package participationSystem.cucumber.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import participationSystem.util.SeleniumUtils;
import static org.junit.Assert.assertEquals;

public class LogginSteps extends SuperSteps {

	private List<Map<String, String>> usuarios;

	@Before
	public void setUp() {
		driver.get(baseUrl);

		// driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("pelayo@gmail.com");
		// driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		// driver.findElement(By.name("botonlogin")).click();
		Map<String, String> pelayo = new HashMap<String, String>();
		pelayo.put("usuario", "pelayo@gmail.com");
		pelayo.put("pass", "temporal");

		Map<String, String> pedro = new HashMap<String, String>();
		pedro.put("usuario", "pedro@gmail.com");
		pedro.put("pedro", "temporal");

		usuarios = new ArrayList<>();
		usuarios.add(pelayo);
		usuarios.add(pedro);

		// SeleniumUtils.esperaCargaPaginaxpath(driver,
		// "/html/body/div/div/div[2]/div[1]/h2", 4);
	}

	@Given("^dada esta lista de usuarios:$")
	public void dada_esta_lista_de_usuarios(List<Map<String, String>> arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		// throw new PendingException();
		assertEquals(2, usuarios.size());
	}

	@When("^introduzo pelayo@gmail\\.com y la contraseña temporal$")
	public void introduzo_pelayo_gmail_com_y_la_contraseña_temporal() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String userLoggin = "pelayo@gmail.com";
		String passLoggin = "temporal";
		boolean esta = false;

		for (Map<String, String> map : usuarios) {
			if (map.get("usuario").equals(userLoggin) && map.get("pass").equals(passLoggin)) {
				esta = true;
			}
		}
		assertEquals(true, esta);

		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(userLoggin);
		driver.findElement(By.id("inputPassword")).sendKeys(passLoggin);
		driver.findElement(By.name("botonlogin")).click();
	}

	@Then("^debo iniciar sesion$")
	public void debo_iniciar_sesion() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String currentURL = driver.getCurrentUrl();
		assertEquals(currentURL, "http://localhost:8080/home");
	}

}
