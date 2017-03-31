package participationSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.thoughtworks.selenium.Selenium;

public class SeleniumTest {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		baseUrl = "http://localhost:8080/";
		driver.get(baseUrl);
	}

	@Test
	public void testIniciarSesion() throws Exception {
		driver.findElement(By.id("inputEmail")).sendKeys("pelayo@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		driver.findElement(By.name("botonlogin")).click();
		//Selenium.waitForPageToLoad("30000");
		//...
	//	driver.findElement(By.id("homeParticipation"));
	}
	
	@Test
	public void testVotarPositivo() throws Exception {
		driver.findElement(By.id("inputEmail")).sendKeys("pelayo@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		driver.findElement(By.name("botonlogin")).click();
		//Selenium.waitForPageToLoad("30000");
		//...
	//	assertEquals(driver.findElement(By.id("??sugerencia_es_ES??")), 2);
	
//		driver.findElement(By.name("8")).click();
	//	assertEquals(driver.findElement(By.id("??sugerencia_es_ES??")), 3);
	}
	
	@Test
	public void testVotarNegativo() throws Exception {
		driver.findElement(By.id("inputEmail")).sendKeys("pelayo@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("temporal");
		driver.findElement(By.name("botonlogin")).click();
		//Selenium.waitForPageToLoad("30000");
		//...
	//	assertEquals(driver.findElement(By.id("??sugerencia_es_ES??")), 2);
	
//		driver.findElement(By.name("8")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
