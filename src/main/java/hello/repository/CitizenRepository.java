package hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import hello.domain.Citizen;


/**
 * Created by Pelayo García Lartategui on 27/03/2017.*/


    @Repository("citizenRepository")
    public interface CitizenRepository extends CrudRepository<Citizen,Long> {

        Citizen findByEmail(String email);

    }

