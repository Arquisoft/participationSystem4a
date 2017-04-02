package hello.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.domain.Categoria;
import hello.domain.Citizen;
import hello.domain.Configuration;
import hello.domain.Sugerencia;
import hello.producers.Topics;
import hello.repository.ConfigurationRepository;
import hello.repository.SuggestionRepository;
import hello.services.SuggestionService;
import hello.util.exception.CitizenException;

/**
 * Created by pelay on 29/03/2017.
 */
@Service
public class SuggestionServiceImpl implements SuggestionService {
    private SuggestionRepository suggestionRepository;
    private ConfigurationRepository configurationRepository;
    
    @Autowired
    public void setSuggestionRepository(SuggestionRepository suggRep) {
        this.suggestionRepository = suggRep;
    }
    
   
    @Autowired
    public void setConfigurationRepository(ConfigurationRepository configurationRepository) {
		this.configurationRepository = configurationRepository;
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
    public void votePositiveSugerencia(Sugerencia sug, Citizen ciudadano) throws CitizenException {
        if (suggestionRepository.findOne(sug.getId()) == null) {
            throw new CitizenException("La sugerencia no existe.");
        } else {
        	sug.addCiudadanoHaVotado(ciudadano);
            sug.incrementarVotos();
            suggestionRepository.save(sug);
            //guardar en la tabla votos la sugerencia con el usuario
            logger.send(Topics.POSITIVE_SUGGESTION_VOTE, sug.getId() + "");
            loggerCutre.log(this.getClass(), "El ciudadano con ID: "+ciudadano.getId()+", Votando postivo a sugerencia ID: "+sug.getId());
            
            comprobarConsiguioMinimoVotos(sug);
        }
    }

    @Override
    public void voteNegativeSugerencia(Sugerencia sug, Citizen ciudadano) throws CitizenException {
        if (suggestionRepository.findOne(sug.getId()) == null) {
            // Error
            throw new CitizenException("La sugerencia no existe.");
        } else {
        	sug.addCiudadanoHaVotado(ciudadano);
            sug.decrementarVotos();
            suggestionRepository.save(sug);
            logger.send(Topics.NEGATIVE_SUGGESTION_VOTE, sug.getId() + "");
            loggerCutre.log(this.getClass(), "El ciudadano con ID: "+ciudadano.getId()+", Votando negativo a sugerencia ID: "+sug.getId());

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

    @Override
    public void createSugerencia(Citizen citizen, Categoria categoria, String titulo, String contenido) throws CitizenException {
        try {
            Sugerencia sug = new Sugerencia(titulo, contenido, categoria, citizen);
            suggestionRepository.save(sug);
            // Mandar a Kafka (ejemplo que no tiene por qué ser asi)
            logger.send(Topics.CREATE_SUGGESTION,
                    sug.getNombre() + separator + sug.getContenido() + separator + sug.getCategoria());
            loggerCutre.log(this.getClass(), "Sugerencia = " + sug.getNombre(), "Categoria = " + sug.getCategoria().getNombre());
        } catch (Exception e) {
            throw new CitizenException("Error al guardar la sugerencia.");
        }
    }
    
    private void comprobarConsiguioMinimoVotos(Sugerencia sug){
    	Configuration config = this.configurationRepository.findAll().get(0);
    	int minVotos = config.getMinimoVotos();
    	if(sug.getVotos() >= minVotos){
    		sug.setConsiguioElMinimo(true);
    	}
    	logger.send(Topics.SUGGESTION_GETS_MIN_VOTES, sug.getNombre());
    }


	@Override
	public List<Sugerencia> findSugerenciaWithMinVotes() {
		List<Sugerencia> sugs = this.suggestionRepository.findAll();
		List<Sugerencia> mySugs = new ArrayList<>();
		for(Sugerencia sug : sugs){
			if(sug.isConsiguioElMinimo()){
				mySugs.add(sug);
			}
		}
		return sugs;
	}

}
