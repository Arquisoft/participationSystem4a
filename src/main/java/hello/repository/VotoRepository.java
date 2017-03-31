package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hello.domain.Voto;

/**
 * 
 * @author Ana
 *
 */
@Repository("votoRepository")
public interface VotoRepository extends JpaRepository<Voto, Long>{

}
