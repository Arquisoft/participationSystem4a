package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.domain.Sugerencia;



@Repository("sugestionRepository")
public interface SuggestionRepository extends JpaRepository<Sugerencia, Long>{

}
