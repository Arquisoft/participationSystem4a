package participationSystem.cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import hello.services.AdminService;
import hello.services.CategoryService;
import hello.services.CitizenService;
import hello.services.CommentService;
import hello.services.Services;
import hello.services.SuggestionService;
import hello.services.SystemServices;
import hello.util.loggercutre.LoggerCutre;
import hello.util.loggercutre.SingletonLoggerCutre;

@IntegrationTest
@WebAppConfiguration
public class SuperSteps {
	CitizenService citizeServices = Services.getCitizenServices();
	AdminService adminServices = Services.getAdminServices();
	SystemServices systemSercices = Services.getSystemServices();
	CategoryService categoryService = Services.getCategoryService();
	CommentService commentService = Services.getCommentService();
	SuggestionService suggestionService = Services.getSuggestionService();
	
	ConfigurableApplicationContext appContext;
	LoggerCutre loggerCutre = SingletonLoggerCutre.getInstance().getLogger();
	boolean stepBien = true;
	
	WebDriver driver;
	String baseUrl = "http://localhost:8080/";
	StringBuffer verificationErrors = new StringBuffer();
	
	@Autowired
	WebApplicationContext context;
	
	
	public CitizenService getCitizeServices() {
		return citizeServices;
	}
	public AdminService getAdminServices() {
		return adminServices;
	}
	public SystemServices getSystemSercices() {
		return systemSercices;
	}
	public CategoryService getCategoryService() {
		return categoryService;
	}
	public CommentService getCommentService() {
		return commentService;
	}
	public SuggestionService getSuggestionService() {
		return suggestionService;
	}
	

	
}
