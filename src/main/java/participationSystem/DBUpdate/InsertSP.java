package participationSystem.DBUpdate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import participationSystem.DBUpdate.Util.Hibernate_Jpa;
import participationSystem.ReportWriter.WriteReport;
import participationSystem.model.Categoria;
import participationSystem.model.Sugerencia;

public class InsertSP implements Insert{
	private static final WriteReport reporter = new WReport();


	@Override
	public void insertSugerencia(Sugerencia sugerencia) {
		EntityManager mapper = Hibernate_Jpa.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();
		
		//Comprobaciones 
		
		mapper.persist(sugerencia);
		trx.commit();
		mapper.close();

	}

	@Override
	public void insertCategoria(Categoria categoria) {
		EntityManager mapper = Hibernate_Jpa.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();
		
		//Comprobaciones 
		
		mapper.persist(categoria);
		trx.commit();
		mapper.close();
	}
	
	

}
