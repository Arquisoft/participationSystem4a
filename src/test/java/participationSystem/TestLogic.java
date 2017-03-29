package participationSystem;

import hello.domain.Categoria;
import hello.domain.Comentario;
import hello.domain.Sugerencia;
import hello.services.AdminService;
import hello.services.CitizenService;
import hello.services.Services;
import hello.services.SystemServices;
import hello.util.exception.CitizenException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;



public class TestLogic {

	CitizenService citizeServices = Services.getCitizenServices();
	AdminService adminServices = Services.getAdminServices();
	SystemServices systemSercices = Services.getSystemServices();
	
	@Test
	public void createSugerencia(){
		
		String nombre = "Sugerenicia de prueba";
		String contenido = "Que nos pongan un 10 en mayo.";
		Categoria cat = new Categoria("Notas ASW"); //Obviamente esta categoria aun no existe
		boolean todoOK = true;
		try{
			Sugerencia s = new Sugerencia(nombre, contenido, cat);
			citizeServices.createSugerencia(s);
		}catch (CitizenException e){
			System.out.println("No se puede crear la sugerencia: "+nombre);
			todoOK = false;
		}catch (Exception e2){
			System.out.println("Ah cascado algo internamente al crear la sugerencia: "+nombre);
			todoOK = false;
		}
		assertFalse(todoOK); 
	}
	
	@Test
	public void testCreateComment(){
		String nombre = "Sugerenicia de prueba";
		String contenido = "Que nos pongan un 10 en mayo.";
		Categoria cat = new Categoria("Notas ASW");
		Sugerencia sugerencia = new Sugerencia(nombre, contenido, cat);
		boolean todoOK = true;
		try{
			String contenidoComment = "Comentario de prueba";
			Comentario c = new Comentario(contenidoComment, sugerencia);
			citizeServices.createComentario(c);
			
			if(sugerencia.getComentarios().size() == 0){
				todoOK = false;
			}
			
			boolean estaDentro = false;
			
			if(todoOK)
			for(Comentario c2 : sugerencia.getComentarios()){
				if(c2.getContenido().equals("Comentario de prueba")){
					estaDentro = true;
				}
			}
			todoOK = estaDentro ? todoOK : false;
		}catch (CitizenException e){
			System.out.println("No se puede crear la sugerencia: "+nombre);
			todoOK = false;
		}catch (Exception e2){
			System.out.println("Ah cascado algo internamente al crear la sugerencia: "+nombre);
			todoOK = false;
		}
		assertFalse(todoOK);

	}
	

	@Test
	public void testGetCategoriasDisponibles(){
		Categoria cat = new Categoria("PruebaCategoriasDisponibles");
		
		
	}
}
