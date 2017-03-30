package hello.services.impl;

import hello.domain.Categoria;
import hello.domain.Sugerencia;
import hello.repository.SuggestionRepository;
import hello.services.SuggestionService;
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
    public List<Sugerencia> findByCat(Categoria cat) {
        return this.suggestionRepository.findByCategoria(cat);
    }
}
