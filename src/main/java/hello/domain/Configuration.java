package hello.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;

@Entity
@Table(name="CONFIGURACION")
public class Configuration {
	@Id
	private String PALABRAS_NO_PERMITIDAS;//Si esto es un POJO... qué hace una lista???
	private int minimoVotos;
	
	@Transient
	private String cadenaDePalabrasnoPermitidas; //En la base de datos se guardaran como palabra@@palabra
	@Transient
	private List<String> palabrasNoPermitidas;
	@Transient
	private String separador = "@@";
	
	

	public String getPalabraNoPermitida() {
		return PALABRAS_NO_PERMITIDAS;
	}

	public Configuration(String palabras) {
		this.palabrasNoPermitidas = new ArrayList<String>();
		rellenarListaPalabrasNoPermitidas();
		PALABRAS_NO_PERMITIDAS=palabras;
	}
	
	public void addPalabraNoPermitida(String word){
		this.palabrasNoPermitidas.add(word);
		actualizarCadenaDePalabras();
	}
	
	public int getMinimoVotos() {
		return minimoVotos;
	}

	public void setMinimoVotos(int minimoVotos) {
		this.minimoVotos = minimoVotos;
	}
	
	public List<String> getPalabrasNoPermitidas(){
		List<String> listado = new ArrayList<String>();
		for(String s : palabrasNoPermitidas){
			listado.add(s);
		}
		return listado;
	}
	
	private void actualizarCadenaDePalabras(){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < palabrasNoPermitidas.size(); i++){
			if(i == palabrasNoPermitidas.size() - 1){
				sb.append(palabrasNoPermitidas.get(i));
			}else{
				sb.append(palabrasNoPermitidas.get(i) + separador);
			}
		}
		cadenaDePalabrasnoPermitidas = sb.toString();
	}
	
	private void rellenarListaPalabrasNoPermitidas(){
		if(this.cadenaDePalabrasnoPermitidas == null){
			this.cadenaDePalabrasnoPermitidas = "";
		}
		String[] palabras = this.cadenaDePalabrasnoPermitidas.split(separador);
		for(String palabra : palabras){
			this.palabrasNoPermitidas.add(palabra);
		}
	}

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
		if (minimoVotos != other.minimoVotos)
			return false;
		return true;
	}
	
	
	
}
