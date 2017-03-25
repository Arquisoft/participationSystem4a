package participationSystem.gestionSugerencias.servicesImpl;

import java.util.List;

import participationSystem.DBUpdate.Insert;
import participationSystem.DBUpdate.InsertSP;
import participationSystem.gestionSugerencias.CitizenServices;
import participationSystem.gestionSugerencias.Services;
import participationSystem.gestionSugerencias.SystemServices;
import participationSystem.model.Categoria;
import participationSystem.model.Comentario;
import participationSystem.model.Configuration;
import participationSystem.model.Sugerencia;
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
	public void createSugerencia(String nombre, String contenido, Categoria categoria) throws CitizenException {
		boolean catBien = systemServices.existeLaCategoria(categoria);
		boolean nombreYcontenidoBien = (systemServices.contienePalabrasAdmitidas(contenido)
				|| systemServices.contienePalabrasAdmitidas(nombre)) ? false : true;

		boolean todoOK = (catBien && nombreYcontenidoBien) ? true : false;
		if (todoOK) {
			
			Sugerencia sugerencia = new Sugerencia(nombre, contenido, categoria);
			db.insertSugerencia(sugerencia);
			// GUARDAR EN LA BASE DE DATOS

		}else{
			throw new CitizenException();
		}

	}

	@Override
	public void addComentario(Sugerencia sugerencia, Comentario comment) throws CitizenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createComentario(String contenido) throws CitizenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categoria> getCategoriasDisponibles() throws CitizenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createCategoria(String nombre) throws CitizenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void votePositiveComment(Comentario comment) throws CitizenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voteNegativeComment(Comentario comment) throws CitizenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void votePositiveSugerencia(Sugerencia sug) throws CitizenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voteNegativeSugerencia(Sugerencia sug) throws CitizenException {
		// TODO Auto-generated method stub
		
	}


}
