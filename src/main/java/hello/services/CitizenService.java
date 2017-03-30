package hello.services;

import hello.domain.Categoria;
import hello.domain.Citizen;
import hello.domain.Comentario;
import hello.domain.Sugerencia;
import hello.util.exception.CitizenException;

import java.util.List;

public interface CitizenService extends SuperService {

	public Citizen getCitizen(String email);

	// public void createSugerencia(Sugerencia sug) throws CitizenException;

	// public void createComentario(Comentario comment) throws CitizenException;

	public List<Categoria> getCategoriasDisponibles() throws CitizenException;

//	public void createCategoria(Categoria categoria) throws CitizenException;

	public void votePositiveComment(Comentario comment) throws CitizenException;

	public void voteNegativeComment(Comentario comment) throws CitizenException;

	public void votePositiveSuggestion(Sugerencia suggestion) throws CitizenException;

	public void voteNegativeSuggestion(Sugerencia suggestion) throws CitizenException;

}
