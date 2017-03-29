package hello.domain;



import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;

@Entity
@Table(name="CONFIGURACION")
public class Configuration {
	@Id
	private String PALABRA_NO_PERMITIDA;//Si esto es un POJO... qué hace una lista???

	public String getPalabraNoPermitida() {
		return PALABRA_NO_PERMITIDA;
	}

	public Configuration(String palabra) {
		PALABRA_NO_PERMITIDA=palabra;
	}
	
	
	/**
	 * Este metodo estaria en el contructor de la clase. Deberia cargar toda la
	 * informacion necesaria de la configuracion del sistema.
	 */
//	private void loadInfo() {
//		palabrasNoPermitidas = new ArrayList<String>();
//		// Rellenar el array
//	}

//	public void addPalabraNoPermitida(String word) {
//		this.palabrasNoPermitidas.add(word);
//	}
//
//	public boolean removePalabraNoPermitida(String word) {
//		if (this.palabrasNoPermitidas.contains(word)) {
//			this.palabrasNoPermitidas.remove(word);
//			return true;
//		}
//		return false;
//	}
//
//	public List<String> getPalabrasNoPermitidas() {
//		List<String> copia = new ArrayList<String>();
//		copia.addAll(palabrasNoPermitidas);
//		return copia;
//	}

}
