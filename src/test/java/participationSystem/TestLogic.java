package participationSystem;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import participationSystem.gestionSugerencias.*;
import participationSystem.gestionSugerencias.Services;
import participationSystem.model.Categoria;
import participationSystem.util.exception.CitizenException;


public class TestLogic {

	CitizenServices citizeServices = Services.getCitizenServices();
	AdminServices adminServices = Services.getAdminServices();
	SystemServices systemSercices = Services.getSystemServices();
	
	@Test
	public void createSugerencia(){
		
		String nombre = "Sugerenicia de prueba";
		String contenido = "Que nos pongan un 10 en mayo.";
		Categoria cat = new Categoria("Notas ASW"); //Obviamente esta categoria aun no existe
		boolean todoOK = true;
		try{
			citizeServices.createSugerencia(nombre, contenido, cat);
		}catch (CitizenException e){
			System.out.println("No se puede crear la sugerencia: "+nombre);
			todoOK = false;
		}catch (Exception e2){
			System.out.println("Ah cascado algo internamente al crear la sugerencia: "+nombre);
			todoOK = false;
		}
		assertFalse(todoOK);
	}
}
