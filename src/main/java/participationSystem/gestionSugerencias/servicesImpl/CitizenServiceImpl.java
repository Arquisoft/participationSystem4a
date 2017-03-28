package participationSystem.gestionSugerencias.servicesImpl;

import java.util.List;

import participationSystem.DBUpdate.Insert;
import participationSystem.DBUpdate.InsertSP;
import participationSystem.DBUpdate.finders.CategoryFinder;
import participationSystem.DBUpdate.finders.ComentarioFinder;
import participationSystem.DBUpdate.finders.SugerenciaFinder;
import participationSystem.gestionSugerencias.CitizenServices;
import participationSystem.gestionSugerencias.Services;
import participationSystem.gestionSugerencias.SystemServices;
import participationSystem.model.Categoria;
import participationSystem.model.Comentario;
import participationSystem.model.Configuration;
import participationSystem.model.Sugerencia;
import participationSystem.producer.Topics;
import participationSystem.util.exception.CitizenException;

public class CitizenServiceImpl implements CitizenServices {

	Configuration config;
	SystemServices systemServices;
	private static Insert db = new InsertSP();

	public CitizenServiceImpl() {
		this.config = Services.getSystemServices().getConfiguration();
		this.systemServices = Services.getSystemServices();
	}

	@Override
	public void createSugerencia(String nombre, String contenido,
			Categoria categoria) throws CitizenException {
		boolean catBien = systemServices.existeLaCategoria(categoria);
		boolean nombreYcontenidoBien = (systemServices
				.contienePalabrasAdmitidas(contenido) || systemServices
				.contienePalabrasAdmitidas(nombre)) ? false : true;

		boolean todoOK = (catBien && nombreYcontenidoBien) ? true : false;
		if (todoOK) {

			Sugerencia sugerencia = new Sugerencia(nombre, contenido, categoria);

			db.insertSugerencia(sugerencia);
			// GUARDAR EN LA BASE DE DATOS

			// Mandar a Kafka (ejemplo que no tiene por qué ser asi)
			logger.send(Topics.CREATE_SUGGESTION, nombre + separator
					+ contenido + separator + categoria);

		} else {
			throw new CitizenException();
		}

	}

	@Override
	public void createComentario(String contenido, Sugerencia sugerencia)
			throws CitizenException {
		boolean sugBien = systemServices.existeLaSugerencia(sugerencia);
		boolean commentBien = (systemServices
				.contienePalabrasAdmitidas(contenido)) ? false : true;
		boolean todoOK = (commentBien && sugBien) ? true : false;
		if (todoOK) {
			Comentario comentario = new Comentario(contenido, sugerencia);
//			addComentario(comentario);
			db.insertComentario(comentario);
			
			logger.send(Topics.COMMENT_SUGGESTION, sugerencia.getId() + separator + contenido);
		}
		
	}

	@Override
	public List<Categoria> getCategoriasDisponibles() throws CitizenException {
		SystemServices ss = new SystemServicesImpl();
		return ss.getAllCategories();
	}

	@Override
	public void createCategoria(String nombre) throws CitizenException {
		//SystemServices ss = new SystemServicesImpl();
		if (CategoryFinder.findByName(nombre) == null)
			db.insertCategoria(new Categoria(nombre));
		else {
			throw new CitizenException("Ha ocurrido un error al crear la categoría.");

		}

	}

	@Override
	public void votePositiveComment(Comentario comment) throws CitizenException {
		if (ComentarioFinder.findById(comment.getId()) == null) {
			// Error
			throw new CitizenException("El comentario no existe");
		} else{
			comment.incrementarVoto();
			logger.send(Topics.POSITIVE_COMMENT_VOTE, comment.getId()+"");
		}
			
	}

	@Override
	public void voteNegativeComment(Comentario comment) throws CitizenException {
		if (ComentarioFinder.findById(comment.getId()) == null) {
			throw new CitizenException("El comentario no existe");
		} else{
			comment.decrementarVoto();
			logger.send(Topics.POSITIVE_COMMENT_VOTE, comment.getId()+"");
		}
			
		
	}

	@Override
	public void votePositiveSugerencia(Sugerencia sug) throws CitizenException {
		if (SugerenciaFinder.findById(sug.getId()) == null) {
			throw new CitizenException("La sugerencia no existe.");
		} else{
			sug.incrementarVotos();
			logger.send(Topics.POSITIVE_SUGGESTION_VOTE, sug.getId()+"");
		}
	}

	@Override
	public void voteNegativeSugerencia(Sugerencia sug) throws CitizenException {
		if (SugerenciaFinder.findById(sug.getId()) == null) {
			// Error
			throw new CitizenException("La sugerencia no existe.");
		} else{
			sug.decrementarVotos();
			logger.send(Topics.NEGATIVE_SUGGESTION_VOTE, sug.getId()+"");
		}
	}

}
