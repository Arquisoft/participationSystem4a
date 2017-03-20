package participationSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Configuration {

	List<String> palabrasNoPermitidas;

	public Configuration() {
		loadInfo();
	}
	
	
	/**
	 * Este metodo estaria en el contructor de la clase. Deberia cargar toda la
	 * informacion necesarioa de la configuracion del sistema.
	 */
	private void loadInfo() {
		palabrasNoPermitidas = new ArrayList<String>();
		// Rellenar el array
	}

	public void addPalabraNoPermitida(String word) {
		this.palabrasNoPermitidas.add(word);
	}

	public boolean removePalabraNoPermitida(String word) {
		if (this.palabrasNoPermitidas.contains(word)) {
			this.palabrasNoPermitidas.remove(word);
			return true;
		}
		return false;
	}

	public List<String> getPalabrasNoPermitidas() {
		List<String> copia = new ArrayList<String>();
		copia.addAll(palabrasNoPermitidas);
		return copia;
	}

}
