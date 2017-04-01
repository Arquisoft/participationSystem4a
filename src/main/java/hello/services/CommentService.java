package hello.services;

import hello.domain.Citizen;
import hello.domain.Comentario;
import hello.util.exception.CitizenException;

public interface CommentService extends SuperService{

	public void createComentario(Comentario comment) throws CitizenException;
	public void votePositiveComment(Comentario comment, Citizen ciudadano) throws CitizenException;
	public void voteNegativeComment(Comentario comment, Citizen ciudadano) throws CitizenException;
}
