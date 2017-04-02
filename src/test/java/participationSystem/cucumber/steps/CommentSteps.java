package participationSystem.cucumber.steps;

import java.util.List;

import javax.validation.constraints.AssertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hello.Application;
import hello.domain.Comentario;
import hello.domain.Sugerencia;

/**
 * Clase para probar lo que deberia pasar al insertar un comentario.
 * 
 * PD: No se si lo mas adecuado es lanzar excepciones....
 * 
 * 
 * @author Javier Castro
 *
 */
public class CommentSteps extends SuperSteps{

	
	@Before
	public void setUp() {
//		String[] args = {};
//		Application.main(args);
//		this.appContext = Application.getAppInstance();
		this.stepBien = true; //Reiniciar el valor
	}
	
	@Given("^Debe haber una sugerencia que comentar$")
	public void debe_haber_una_sugerencia_que_comentar() throws Throwable {
		List<Sugerencia> listaSugerencias = suggestionService.findAll();
		if (listaSugerencias.size() == 0) {
			stepBien = false;
		}
		if(!stepBien){
			loggerCutre.log(getClass(), getClass().getEnclosingMethod(), "Step fallido. No hay sugerencias");
		}
		// throw new PendingException();
	}

	@Given("^he iniciado sesion en la aplicacion$")
	public void he_iniciado_sesion_en_la_aplicacion() throws Throwable {
		// // Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^creo un comentario$")
	public void creo_un_comentario() throws Throwable {
		try {
			Sugerencia s = suggestionService.findAll().get(0); // Cojo la
																// primera
																// mismamente
			Comentario c = new Comentario("Comentario de pruba con cucumber", s);
			commentService.createComentario(c);
		} catch (Exception e) {
			loggerCutre.log(getClass(), "Step fallido, no he podido crar un comentario");
		}
		throw new PendingException();
	}

	@Then("^la sugerencia debe tener mi comentario$")
	public void la_sugerencia_debe_tener_mi_comentario() throws Throwable {
		Sugerencia s = suggestionService.findAll().get(0); // Cojo la primera
															// mismamente
		if (s.getComentarios().size() == 0) {
			loggerCutre.log(getClass(), "Step fallido, la sugerencia sigue sin tener comentarios tras haber creado uno.");
			return;
		}

		boolean tengoComent = false;
		for (Comentario c : s.getComentarios()) {
			if (c.getContenido().equals("Comentario de pruba con cucumber"))
				tengoComent = true;
		}
		if (!tengoComent)
			loggerCutre.log(getClass(), "Step fallido, no existe mi comentario.");
		// throw new PendingException();
	}

}
