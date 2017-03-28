package participationSystem.gestionSugerencias.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hello.repository.CitizenRepository;
import participationSystem.gestionSugerencias.LoginServices;
import hello.domain.Citizen;

/**
 * Created by pelay on 27/03/2017.
 */
@Service("loginService")
public class LoginServicesImpl implements LoginServices {

    @Autowired
    private CitizenRepository citizenRepository;


    @Override
    public Citizen findUserByEmail(String email) {
        return citizenRepository.findByEmail(email);
    }
}
