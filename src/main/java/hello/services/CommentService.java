package hello.services;

import hello.domain.Comentario;
import hello.util.exception.CitizenException;

public interface CommentService extends SuperService{

	public void createComentario(Comentario comment) throws CitizenException;
}
