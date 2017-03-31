package hello.services.impl;

import hello.domain.Categoria;
import hello.domain.Citizen;
import hello.domain.Sugerencia;
import hello.producers.Topics;
import hello.repository.SuggestionRepository;
import hello.services.SuggestionService;
import hello.util.exception.CitizenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pelay on 29/03/2017.
 */
@Service
public class SuggestionServiceImpl implements SuggestionService {
    SuggestionRepository suggestionRepository;

    @Autowired
    public void setSuggestionRepository(SuggestionRepository suggRep) {
        this.suggestionRepository = suggRep;
    }


    @Override
    public List<Sugerencia> findAll() {
        return this.suggestionRepository.findAll();

    }

    @Override
    public Sugerencia findById(Long id) {
        return this.suggestionRepository.findOne(id);
    }

    @Override
    public List<Sugerencia> findByCat(Categoria cat) {
        return this.suggestionRepository.findByCategoria(cat);
    }

    @Override
    public void votePositiveSugerencia(Sugerencia sug) throws CitizenException {
        if (suggestionRepository.findOne(sug.getId()) == null) {
            throw new CitizenException("La sugerencia no existe.");
        } else {
            sug.incrementarVotos();
            suggestionRepository.save(sug);
            //guardar en la tabla votos la sugerencia con el usuario
            logger.send(Topics.POSITIVE_SUGGESTION_VOTE, sug.getId() + "");
        }
    }

    @Override
    public void voteNegativeSugerencia(Sugerencia sug) throws CitizenException {
        if (suggestionRepository.findOne(sug.getId()) == null) {
            // Error
            throw new CitizenException("La sugerencia no existe.");
        } else {
            sug.decrementarVotos();
            suggestionRepository.save(sug);
            logger.send(Topics.NEGATIVE_SUGGESTION_VOTE, sug.getId() + "");
        }
    }
    @Override
	public void createSugerencia(Sugerencia sug) throws CitizenException {

		try {
			this.suggestionRepository.save(sug);
			// Mandar a Kafka (ejemplo que no tiene por qué ser asi)
			logger.send(Topics.CREATE_SUGGESTION,
					sug.getNombre() + separator + sug.getContenido() + separator + sug.getCategoria());
			loggerCutre.log(this.getClass(), "Sugerencia = " + sug.getNombre(), "Categoria = " + sug.getCategoria().getNombre());
		} catch (Exception e) {
			throw new CitizenException("Error al guardar la sugerencia.");
		}

	}
}
