package hello.services;

import hello.domain.Categoria;
import hello.domain.Sugerencia;
import hello.util.exception.CitizenException;

import java.util.List;

/**
 * Created by pelay on 29/03/2017.
 */
public interface SuggestionService extends SuperService {

    List<Sugerencia>findAll();
    Sugerencia findById(Long id);
    List<Sugerencia>findByCat(Categoria cat);
    void votePositiveSugerencia(Sugerencia sug) throws CitizenException;
    void voteNegativeSugerencia(Sugerencia sug) throws CitizenException;




}
