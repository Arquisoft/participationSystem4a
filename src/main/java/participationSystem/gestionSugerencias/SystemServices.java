package participationSystem.gestionSugerencias;

import java.util.List;

import participationSystem.model.Categoria;
import participationSystem.model.Configuration;
import participationSystem.model.Sugerencia;

public interface SystemServices {

	Configuration getConfiguration();
	List<Categoria> getAllCategories();
	boolean contienePalabrasAdmitidas(String mensaje);
	boolean existeLaCategoria(Categoria cat);
	boolean existeLaSugerencia(Sugerencia sugerencia);
}
