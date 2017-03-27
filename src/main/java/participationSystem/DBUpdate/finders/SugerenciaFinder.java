package participationSystem.DBUpdate.finders;

import java.util.List;

import participationSystem.DBUpdate.Util.Hibernate_Jpa;
import participationSystem.model.Sugerencia;

public class SugerenciaFinder {
	
	public static Sugerencia findById(Long id){
       List<Sugerencia> lista=Hibernate_Jpa.getManager()
                .createNamedQuery("Sugerencia.findById",Sugerencia.class)
                .setParameter(1, id)
                .getResultList();
       if(!lista.isEmpty())
    	   return lista.get(0);
       return null;
    }

}
