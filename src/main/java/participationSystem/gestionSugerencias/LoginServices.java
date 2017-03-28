package participationSystem.gestionSugerencias;

import hello.domain.Citizen;

/**
 * Created by pelay on 27/03/2017.
 */
public interface LoginServices extends SuperService{

    public Citizen findUserByEmail(String email);

}
