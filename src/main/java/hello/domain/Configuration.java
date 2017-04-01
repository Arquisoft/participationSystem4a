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
	private String PALABRA_NO_PERMITIDA;//Si esto es un POJO... qué hace una lista???
	
	
//	@Transient
//	private String cadenaDePalabrasnoPermitidas; //En la base de datos se guardaran como palabra@@palabra
//	
//	@Transient
//	private List<String> palabrasNoPermitidas;
	
	private String separador = "@@";
	public String getPalabraNoPermitida() {
		return PALABRA_NO_PERMITIDA;
	}

	public Configuration(String palabra) {
//		this.palabrasNoPermitidas = new ArrayList<String>();
//		rellenarListaPalabrasNoPermitidas();
		PALABRA_NO_PERMITIDA=palabra;
	}
	
//	public void addPalabraNoPermitida(String word){
//		this.palabrasNoPermitidas.add(word);
//		actualizarCadenaDePalabras();
//		
//	}
//	
//	public List<String> getPalabrasNoPermitidas(){
//		List<String> listado = new ArrayList<String>();
//		for(String s : palabrasNoPermitidas){
//			listado.add(s);
//		}
//		return listado;
//	}
//	
//	private void actualizarCadenaDePalabras(){
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < palabrasNoPermitidas.size(); i++){
//			if(i == palabrasNoPermitidas.size() - 1){
//				sb.append(palabrasNoPermitidas.get(i));
//			}else{
//				sb.append(palabrasNoPermitidas.get(i) + separador);
//			}
//		}
//		cadenaDePalabrasnoPermitidas = sb.toString();
//	}
//	
//	private void rellenarListaPalabrasNoPermitidas(){
//		if(this.cadenaDePalabrasnoPermitidas == null){
//			this.cadenaDePalabrasnoPermitidas = "";
//		}
//		String[] palabras = this.cadenaDePalabrasnoPermitidas.split(separador);
//		for(String palabra : palabras){
//			this.palabrasNoPermitidas.add(palabra);
//		}
//	}
//	

}
