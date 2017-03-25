package participationSystem.DBUpdate;


import participationSystem.model.Categoria;
import participationSystem.model.Sugerencia;

public interface Insert {
	
	void insertSugerencia(Sugerencia sugerencia);
	void insertCategoria(Categoria categoria);

}
