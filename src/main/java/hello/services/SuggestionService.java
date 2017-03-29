package hello.services;

import hello.domain.Categoria;
import hello.domain.Sugerencia;

import java.util.List;

/**
 * Created by pelay on 29/03/2017.
 */
public interface SuggestionService {

    public List<Sugerencia>findAll();
    public List<Sugerencia>findByCat(Categoria cat);



}
