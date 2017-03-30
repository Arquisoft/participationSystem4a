package hello.services.impl;

import hello.domain.Categoria;
import hello.repository.CategoryRepository;
import hello.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pelayo García Lartategui on 30/03/2017.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Categoria> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Categoria findByNombre(String nombre) {
        return categoryRepository.findByNombre(nombre);
    }

    @Override
    public Categoria findById(Long id) {
        return categoryRepository.findOne(id);
    }
}
