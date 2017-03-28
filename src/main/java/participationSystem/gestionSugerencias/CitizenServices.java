package participationSystem.gestionSugerencias;

import participationSystem.model.Categoria;
import participationSystem.model.Comentario;
import participationSystem.model.Sugerencia;
import participationSystem.util.exception.CitizenException;

import java.util.List;

public interface CitizenServices extends SuperService {

	void createSugerencia(String nombre, String contenido, Categoria categoria) throws CitizenException;

	void createComentario(String contenido, Sugerencia sugerencia) throws CitizenException;

	List<Categoria> getCategoriasDisponibles() throws CitizenException;

	void createCategoria(String nombre) throws CitizenException;

	void votePositiveComment(Comentario comment) throws CitizenException;

	void voteNegativeComment(Comentario comment) throws CitizenException;

	void votePositiveSugerencia(Sugerencia sug) throws CitizenException;

	void voteNegativeSugerencia(Sugerencia sug) throws CitizenException;


}
