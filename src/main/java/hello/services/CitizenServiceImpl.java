package hello.services;

import hello.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hello.domain.Citizen;

/**
 * Created by pelay on 27/03/2017.
 */
@Service
public class CitizenServiceImpl implements CitizenService {

    private CitizenRepository citizenRepository;


   @Autowired
   public void setCitizenRepository(CitizenRepository citizenRepository){
       this.citizenRepository=citizenRepository;
   }



    @Override
    public Citizen getCitizen(String email) {
        return this.citizenRepository.findByEmail(email);
    }
}
