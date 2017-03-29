package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.domain.Categoria;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Categoria, Long>{

	Categoria findByNombre(String name);
	
}
