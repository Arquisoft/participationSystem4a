package participationSystem.DBUpdate;

import java.util.List;

import participationSystem.DBUpdate.Util.Hibernate_Jpa;
import participationSystem.model.Comentario;

public class ComentarioFinder {
	
	public static Comentario findById(Long id){
        List<Comentario> lista = Hibernate_Jpa.getManager()
                .createNamedQuery("Comentario.findById",Comentario.class)
                .setParameter(1, id)
                .getResultList();
        if(!lista.isEmpty()){
            return lista.get(0);
        }
        return null;
    }

}
