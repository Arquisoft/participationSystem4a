package participationSystem;
/*import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;
import participationSystem.util.SeleniumUtils;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

@SuppressWarnings("deprecation")
@IntegrationTest
@WebAppConfiguration*/
public class SeleniumTest {
	/*private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Cuando("^inicia sesion$")
	@Before
	public void inicia_sesion() throws Exception {
		driver = new HtmlUnitDriver();
		baseUrl = "http://localhost:8080/";
		driver.get(baseUrl);
		SeleniumUtils.EsperaCargaPagina(driver, baseUrl, "inputEmail", 5);
		driver.findElement(By.id("inputEmail")).sendKeys("pelayo@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		driver.findElement(By.name("botonlogin")).click();

		SeleniumUtils.EsperaCargaPaginaxpath(driver, "/html/body/div/div/div[2]/div[1]/h2", 4);
	}

	@Test
	public void testIniciarSesion() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("inputEmail")).sendKeys("pelayo@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		driver.findElement(By.xpath("/html/body/div[2]/form/h2"));

		driver.findElement(By.name("botonlogin")).click();
		SeleniumUtils.EsperaCargaPaginaxpath(driver, "/html/body/div/div/div[2]/div[1]/h2", 3);
		//Selenium.waitForPageToLoad("30000");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/h2"));
	}
	
	@Test
	@Entonces("^vota positivo$")
	public void testVotarPositivo() throws Exception {
		//Selenium.waitForPageToLoad("30000");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Marquesina Llamaquique");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "Plantacion de nuevos arboles en el Campo San Francisco");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), "13");		
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[5]/form/button")).click();
		SeleniumUtils.EsperaCargaPaginaxpath(driver, "//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]", 3);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "Plantacion de nuevos arboles en el Campo San Francisco");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), "14");		
		
		
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Activar ayudas a la eficiencia energética para apoyar la rehabilitación");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "La hora de recogida de basuras en invierno es demasiado tarde");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), 1);		
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[4]/form/button")).click();
		SeleniumUtils.EsperaCargaPaginaxpath(driver, "//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]", 3);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "La hora de recogida de basuras en invierno es demasiado tarde");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), 1);		
	}
	
	
	
	@Entonces("^vota negativo$")
	public void testVotarNegativo() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[5]/form/button")).click();
		SeleniumUtils.EsperaCargaPaginaxpath(driver, "//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]", 3);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "Plantacion de nuevos arboles en el Campo San Francisco");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), "14");
		
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[2]")).getText(), "La hora de recogida de basuras en invierno es demasiado tarde");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[3]")).getText(), "0");
		
	}
	
	@Entonces("^Busca la sugerencia$")
	public void testBuscarSugerencia() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"sugerencias_filter\"]/label/input")).sendKeys("HUCA");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[1]")).getText(), "Lineas de bus Nuevo HUCA");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")), 1);
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[4]/form/button")).click();
		SeleniumUtils.EsperaCargaPaginaxpath(driver, "//*[@id=\"sugerencias\"]/tbody/tr/td[3]", 3);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")), 2);
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[5]/form/button")).click();
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")), 1);		
		
	}
	@Test
	@Entonces("^ordena las sugerencias por categoria$")
	public void testPorCategoria() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/thead/tr/th[2]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[1]")).getText(), "Marquesina Llamaquique");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")).getText(), "3");		
		
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[1]")).getText(), "Nuevo estadio de atletismo");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")).getText(), "6");
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[4]/form/button")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")).getText(), "7");
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[5]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr/td[3]")).getText(), "6");		
		
		
	}
	
	@Test
	@Entonces("^ordena las sugerencias por titulo$")
	public void testOrdenarSugerenciasPorTitulo() throws Exception {		
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/thead/tr/th[1]")).click();
		for(int i=1;i<4;i++)
			System.out.println(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr["+i+"]/td[1]")).getText());
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Marquesina Llamaquique");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]")).getText(), "Nuevos Ã¡rboles");
	
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Activar ayudas a la eficiencia energética para apoyar la rehabilitación");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]")).getText(), "Ampliacion de horario de recogida");
	}
	
	@Test
	@Entonces("^ordena las sugerencias por contenido$")
	public void testOrdenarSugerenciasPorContenido() throws Exception {		
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/thead/tr/th[1]")).click();
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Marquesina Llamaquique");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]")).getText(), "Nuevos Ã¡rboles");
		
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Ampliar el horario de la zona verde e incluir los domingos");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]")).getText(), "Activar ayudas a la eficiencia energética para apoyar la rehabilitación");
	
	}
	
	@Test
	@Entonces("^ordena las sugerencias por votos$")
	public void testOrdenarSugerenciasPorVotos() throws Exception {		
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/thead/tr/th[3]")).click();
		//assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Ampliacion de horario de recogida");
		//assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]")).getText(), "Ampliar horario");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[1]/td[1]")).getText(), "Marquesina Llamaquique");
		assertEquals(driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]")).getText(), "Nuevos Ã¡rboles");

	}
	
	@Test
	@Entonces("^muestra los comentarios$")
	public void testMostrarComentarios() throws Exception {		
		driver.findElement(By.xpath("//*[@id=\"sugerencias\"]/tbody/tr[2]/td[1]/a")).click();
		assertEquals(driver.findElement(By.xpath("/html/body/div/div/div[2]/"
				+ "div[2]/div/div/div[1]/div[2]/div")).getText(), "Pedro made a post.");
		assertEquals(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/p")).getText(), "Para que quieres saber eso? xd");
		assertEquals(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/p")).getText(), "Todo genial");
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
*/
}
