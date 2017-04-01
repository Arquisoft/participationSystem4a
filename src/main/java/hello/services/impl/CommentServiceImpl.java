package hello.services.impl;

import hello.domain.Citizen;
import hello.domain.Sugerencia;
import org.springframework.beans.factory.annotation.Autowired;
import hello.domain.Comentario;
import hello.producers.Topics;
import hello.repository.CommentRepository;
import hello.services.CommentService;
import hello.util.exception.CitizenException;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
	private CommentRepository commentRepository;

	@Autowired
	public void setCommentRepository(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	@Override
	public void createComentario(Comentario comment) throws CitizenException {
		try {

			// addComentario(comentario);
			this.commentRepository.save(comment);
			logger.send(Topics.COMMENT_SUGGESTION,
					comment.getSugerencia().getId() + separator + comment.getContenido());
			loggerCutre.log(this.getClass(), "Comentario ID = " + comment.getId());
		} catch (Exception e) {
			throw new CitizenException("Error al crear un comentario.");
		}

	}
	
	@Override
	public void votePositiveComment(Comentario comment, Citizen ciudadano) throws CitizenException {
		if (commentRepository.findOne(comment.getId()) == null) {
			// Error
			throw new CitizenException("El comentario no existe");
		} else {
			//votoRepository save
			comment.incrementarVoto();
			logger.send(Topics.POSITIVE_COMMENT_VOTE, comment.getId() + "");
			loggerCutre.log(this.getClass(), "Votando positivo a comentario ID: "+comment.getId());
		}

	}

	@Override
	public void voteNegativeComment(Comentario comment, Citizen ciudadano) throws CitizenException {
		if (commentRepository.findOne(comment.getId()) == null) {
			throw new CitizenException("El comentario no existe");
		} else {
			comment.decrementarVoto();
			logger.send(Topics.POSITIVE_COMMENT_VOTE, comment.getId() + "");
			loggerCutre.log(this.getClass(), "Votando negativo a comentario ID: "+comment.getId());
		}

	}

	@Override
	public void createComentario(String contenido, Sugerencia sugerencia, Citizen citizen) {
		Comentario c = new Comentario(contenido,sugerencia,citizen);
		sugerencia.addComentario(c);
		commentRepository.save(c);
	}


}
