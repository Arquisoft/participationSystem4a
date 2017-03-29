package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.domain.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long>{

}
