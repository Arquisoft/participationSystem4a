package participationSystem.gestionSugerencias.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import participationSystem.DBUpdate.CategoryFinder;
import participationSystem.gestionSugerencias.SystemServices;
import participationSystem.model.Categoria;
import participationSystem.model.Configuration;

public class SystemServicesImpl implements SystemServices {

	List<Categoria> categorias = new ArrayList<>();
	Configuration config = null;
	public Configuration getConfiguration() {
		//Obtener de la base de datos
		return null;
	}

	@Override
	public List<Categoria> getAllCategories() {
		// TODO Auto-generated method stub
		//Obtener de la  base de datos y actualizar la lista
		List<Categoria> categorias=CategoryFinder.findAll();
		return categorias;
	}

	@Override
	public boolean contienePalabrasAdmitidas(String mensaje) {
		List<String> wordsNotAllowed = config.getPalabrasNoPermitidas();
		String[] myWordsTemp = mensaje.split(" "); 
		for(int i = 0; i < myWordsTemp.length; i++){
			if(wordsNotAllowed.contains(myWordsTemp[i])){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existeLaCategoria(Categoria cat) {
		this.categorias = getAllCategories();
		if(categorias.contains(cat)){
			return true;
		}
		return false;
	}

}
