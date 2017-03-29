package hello.services;



import java.util.List;

import hello.domain.Categoria;
import hello.domain.Citizen;
import hello.domain.Comentario;
import hello.domain.Sugerencia;
import hello.util.exception.CitizenException;

public interface CitizenServices extends SuperService {
	
	Citizen getCitizen(String email);

	void createSugerencia(Sugerencia sug) throws CitizenException;

	void createComentario(Comentario comment) throws CitizenException;

	List<Categoria> getCategoriasDisponibles() throws CitizenException;

	void createCategoria(Categoria categoria) throws CitizenException;

	void votePositiveComment(Comentario comment) throws CitizenException;

	void voteNegativeComment(Comentario comment) throws CitizenException;

	void votePositiveSugerencia(Sugerencia sug) throws CitizenException;

	void voteNegativeSugerencia(Sugerencia sug) throws CitizenException;


}
