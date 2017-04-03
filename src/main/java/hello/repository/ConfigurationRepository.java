package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.domain.Configuration;

@Repository("configuracionRepository")
public interface ConfigurationRepository extends JpaRepository<Configuration, Long>{

}
