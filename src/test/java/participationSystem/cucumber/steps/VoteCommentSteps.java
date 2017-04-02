package participationSystem.cucumber.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import participationSystem.util.SeleniumUtils;

public class VoteCommentSteps extends SuperSteps{
	@Given("^Soy un usuario registrado$")
	public void soy_un_usuario_registrado() throws Throwable {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("pelayo@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		driver.findElement(By.name("botonlogin")).click();

		SeleniumUtils.esperaCargaPaginaxpath(driver, "/html/body/div/div/div[2]/div[1]/h2", 4);
	}

	@Given("^Existe al menos una sugerencia$")
	public void existe_al_menos_una_sugerencia() throws Throwable {
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Marquesina Llamaquique");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "Plantacion de nuevos arboles en el Campo San Francisco");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), "13");		
	}

	@Given("^Esa sugerencia tiene al menos un comentario$")
	public void esa_sugerencia_tiene_al_menos_un_comentario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Voto positiva o negativamente mi voto$")
	public void voto_positiva_o_negativamente_mi_voto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^S contabiliza el voto$")
	public void s_contabiliza_el_voto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^No se sabe lo que he votado$")
	public void no_se_sabe_lo_que_he_votado() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
