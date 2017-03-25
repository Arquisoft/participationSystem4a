package participationSystem.DBUpdate;


import participationSystem.model.Categoria;
import participationSystem.model.Comentario;
import participationSystem.model.Sugerencia;

public interface Insert {
	
	void insertSugerencia(Sugerencia sugerencia);
	void insertCategoria(Categoria categoria);
	void insertComentario(Comentario comentario);

}
