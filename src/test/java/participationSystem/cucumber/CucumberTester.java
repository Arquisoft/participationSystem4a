package participationSystem.cucumber;

//import java.util.List;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import hello.Application;
//import hello.domain.Comentario;
//import hello.domain.Sugerencia;
//import hello.services.AdminService;
//import hello.services.CategoryService;
//import hello.services.CitizenService;
//import hello.services.CommentService;
//import hello.services.Services;
//import hello.services.SuggestionService;
//import hello.services.SystemServices;

public class CucumberTester {
//	CitizenService citizeServices = Services.getCitizenServices();
//	AdminService adminServices = Services.getAdminServices();
//	SystemServices systemSercices = Services.getSystemServices();
//	CategoryService categoryService = Services.getCategoryService();
//	CommentService commentService = Services.getCommentService();
//	SuggestionService suggestionService = Services.getSuggestionService();
//
//	@Before
//	public void arrancarAplicacion() {
//		String[] args = {};
//		Application.main(args);
//	}
//
//	@Given("^Debe haber una sugerencia que comentar$")
//	public void debe_haber_una_sugerencia_que_comentar() throws Throwable {
//		List<Sugerencia> listaSugerencias = suggestionService.findAll();
//		if (listaSugerencias.size() == 0) {
//			throw new IllegalStateException("No hay sugerencias que comentar");
//		}
//		// throw new PendingException();
//	}
//
//	@Given("^he iniciado sesion en la aplicacion$")
//	public void he_iniciado_sesion_en_la_aplicacion() throws Throwable {
//		// // Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@When("^creo un comentario$")
//	public void creo_un_comentario() throws Throwable {
//		try {
//			Sugerencia s = suggestionService.findAll().get(0); // Cojo la
//																// primera
//																// mismamente
//			Comentario c = new Comentario("Comentario de pruba con cucumber", s);
//			commentService.createComentario(c);
//		} catch (Exception e) {
//			throw new IllegalStateException("No he podido crear un comentario.");
//		}
//		throw new PendingException();
//	}
//
//	@Then("^la sugerencia debe tener mi comentario$")
//	public void la_sugerencia_debe_tener_mi_comentario() throws Throwable {
//		Sugerencia s = suggestionService.findAll().get(0); // Cojo la primera
//															// mismamente
//		if (s.getComentarios().size() == 0) {
//			throw new IllegalStateException("Mi comentario no se ha enlazado con la sugerencia");
//		}
//
//		boolean tengoComent = false;
//		for (Comentario c : s.getComentarios()) {
//			if (c.getContenido().equals("Comentario de pruba con cucumber"))
//				tengoComent = true;
//		}
//		if (!tengoComent)
//			throw new IllegalStateException("Mi comentario no se ha enlazado con la sugerencia");
//		// throw new PendingException();
//	}
//
//	@Given("^Inicio sesion$")
//	public void inicio_sesion() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Soy un usuario administrador$")
//	public void soy_un_usuario_administrador() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@When("^Añado una palabrea prohida$")
//	public void añado_una_palabrea_prohida() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^No se puede volver a utilizar esa palabra\\.$")
//	public void no_se_puede_volver_a_utilizar_esa_palabra() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Inicio sesion en la aplicacion$")
//	public void inicio_sesion_en_la_aplicacion() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Existe al menos una categoria en la que puedo meter mi sugerencia$")
//	public void existe_al_menos_una_categoria_en_la_que_puedo_meter_mi_sugerencia() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@When("^Creo la sugerencia$")
//	public void creo_la_sugerencia() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^El sistema debe tener mi sugerencia$")
//	public void el_sistema_debe_tener_mi_sugerencia() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Soy un usuario registrado$")
//	public void soy_un_usuario_registrado() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Existe al menos una sugerencia$")
//	public void existe_al_menos_una_sugerencia() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Esa sugerencia tiene al menos un comentario$")
//	public void esa_sugerencia_tiene_al_menos_un_comentario() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@When("^Voto positiva o negativamente mi voto$")
//	public void voto_positiva_o_negativamente_mi_voto() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^S contabiliza el voto$")
//	public void s_contabiliza_el_voto() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^No se sabe lo que he votado$")
//	public void no_se_sabe_lo_que_he_votado() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Inicion sesion en la aplicacion$")
//	public void inicion_sesion_en_la_aplicacion() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^Existe al menos una sugerencia para votar$")
//	public void existe_al_menos_una_sugerencia_para_votar() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Given("^No he votado ya esa sugerencia$")
//	public void no_he_votado_ya_esa_sugerencia() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@When("^Voto positiva o negativamente$")
//	public void voto_positiva_o_negativamente() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^Se contabiliza mi voto$")
//	public void se_contabiliza_mi_voto() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^pero no se sabe lo que he votado$")
//	public void pero_no_se_sabe_lo_que_he_votado() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}

}
