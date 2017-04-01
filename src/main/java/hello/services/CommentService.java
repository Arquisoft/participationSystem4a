package hello.services;

import hello.domain.Citizen;
import hello.domain.Comentario;
import hello.domain.Sugerencia;
import hello.util.exception.CitizenException;

public interface CommentService extends SuperService{

    void createComentario(Comentario comment) throws CitizenException;

    void createComentario(String comentario, Sugerencia sugerencia, Citizen citizen);
	public void votePositiveComment(Comentario comment, Citizen ciudadano) throws CitizenException;
	public void voteNegativeComment(Comentario comment, Citizen ciudadano) throws CitizenException;
}
