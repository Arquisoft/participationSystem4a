package participationSystem.DBUpdate;

import java.util.List;

import participationSystem.DBUpdate.Util.Hibernate_Jpa;
import participationSystem.model.Categoria;


public class CategoryFinder {
	
	public static List<Categoria> findAll(){
        List<Categoria> list = Hibernate_Jpa.getManager()
                .createNamedQuery("Categoria.findAll",Categoria.class)
                .getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }
	
	public static List<Categoria> findByName(String name){
        List<Categoria> list = Hibernate_Jpa.getManager()
                .createNamedQuery("Categoria.findByName",Categoria.class)
                .setParameter(1, name)
                .getResultList();
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }

}
