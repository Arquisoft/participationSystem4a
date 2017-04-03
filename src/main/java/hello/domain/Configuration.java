package hello.domain;

import javax.persistence.*;

import hello.util.loggercutre.SingletonLoggerCutre;

import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

@Entity
@Table(name = "CONFIGURACION")
public class Configuration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String PALABRAS_NO_PERMITIDAS;
	private int minimoVotos;

	@Transient
	private String cadenaDePalabrasnoPermitidas; // En la base de datos se
													// guardaran como
													// palabra@@palabra
	@Transient
	private List<String> palabrasNoPermitidas;
	@Transient
	private String separador = "@@";

	public Configuration(Long id) {
		this.id = id;
	}

	public String getPalabraNoPermitida() {
		return PALABRAS_NO_PERMITIDAS;
	}

	public Configuration() {
		// TODO Auto-generated constructor stub
		this.palabrasNoPermitidas = new ArrayList<String>();
		//rellenarListaPalabrasNoPermitidas();
		this.minimoVotos = 0;

	}

	public Configuration(String palabras) {
		this();
		PALABRAS_NO_PERMITIDAS = palabras;
	}

	public void addPalabraNoPermitida(String word) {
		if (!"".equals(word)) {
			//rellenarListaPalabrasNoPermitidas();
//			this.palabrasNoPermitidas.add(word);
			SingletonLoggerCutre.getInstance().getLogger().log(getClass(),
					"Antes de actualizar " + PALABRAS_NO_PERMITIDAS);
//			actualizarCadenaDePalabras();
			StringBuilder sb = new StringBuilder();
			sb.append(this.PALABRAS_NO_PERMITIDAS);
			sb.append(separador + word);
			this.PALABRAS_NO_PERMITIDAS =  sb.toString();

			SingletonLoggerCutre.getInstance().getLogger().log(getClass(),
					"Tras actualizar " + this.PALABRAS_NO_PERMITIDAS);
		}
	}

	public int getMinimoVotos() {
		return minimoVotos;
	}

	public void setMinimoVotos(int minimoVotos) {
		this.minimoVotos = minimoVotos;
	}

	public List<String> getPalabrasNoPermitidas() {
		List<String> listado = new ArrayList<String>();
		String[] aux = this.PALABRAS_NO_PERMITIDAS.split(separador);
		for (String s : aux) {
			listado.add(s);
		}
		return listado;
	}

//	private void actualizarCadenaDePalabras() {
//		StringBuilder sb = new StringBuilder();
//		
//		for (int i = 0; i < palabrasNoPermitidas.size(); i++) {
//			if (i == palabrasNoPermitidas.size() - 1) {
//				sb.append(palabrasNoPermitidas.get(i));
//			} else {
//				sb.append(palabrasNoPermitidas.get(i) + separador);
//				SingletonLoggerCutre.getInstance().getLogger().log(getClass(),
//						"He añadido la palabra " + palabrasNoPermitidas.get(i));
//			}
//		}
//		PALABRAS_NO_PERMITIDAS = sb.toString();
//		this.cadenaDePalabrasnoPermitidas = PALABRAS_NO_PERMITIDAS;
//	}

//	private void rellenarListaPalabrasNoPermitidas() {
//		
//		if (this.PALABRAS_NO_PERMITIDAS == null) {
//			this.PALABRAS_NO_PERMITIDAS = ""; //Parece ser que no carga las palabras de la base de datos (9:47)
//		}
//		
//		String[] palabras = this.PALABRAS_NO_PERMITIDAS.split(separador);
//		for (String palabra : palabras) {
//			if (!"".equals(palabra))
//				this.palabrasNoPermitidas.add(palabra);
//		}
//		this.cadenaDePalabrasnoPermitidas = this.PALABRAS_NO_PERMITIDAS;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PALABRAS_NO_PERMITIDAS == null) ? 0 : PALABRAS_NO_PERMITIDAS.hashCode());
		result = prime * result + minimoVotos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		if (PALABRAS_NO_PERMITIDAS == null) {
			if (other.PALABRAS_NO_PERMITIDAS != null)
				return false;
		} else if (!PALABRAS_NO_PERMITIDAS.equals(other.PALABRAS_NO_PERMITIDAS))
			return false;
		return !(minimoVotos != other.minimoVotos);
	}

}
