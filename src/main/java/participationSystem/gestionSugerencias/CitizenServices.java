package participationSystem.gestionSugerencias;

import java.util.List;

import participationSystem.model.Categoria;
import participationSystem.model.Comentario;
import participationSystem.model.Sugerencia;
import participationSystem.util.exception.CitizenException;

public interface CitizenServices {

	void createSugerencia(String nombre, String contenido, Categoria categoria) throws CitizenException;

	void addComentario(Comentario comment) throws CitizenException;

	void createComentario(String contenido, Sugerencia sugerencia) throws CitizenException;

	List<Categoria> getCategoriasDisponibles() throws CitizenException;

	void createCategoria(String nombre) throws CitizenException;

	void votePositiveComment(Comentario comment) throws CitizenException;

	void voteNegativeComment(Comentario comment) throws CitizenException;

	void votePositiveSugerencia(Sugerencia sug) throws CitizenException;

	void voteNegativeSugerencia(Sugerencia sug) throws CitizenException;

}
