package participationSystem.cucumber.steps;

import org.springframework.context.ConfigurableApplicationContext;

import hello.services.AdminService;
import hello.services.CategoryService;
import hello.services.CitizenService;
import hello.services.CommentService;
import hello.services.Services;
import hello.services.SuggestionService;
import hello.services.SystemServices;
import hello.util.loggercutre.LoggerCutre;
import hello.util.loggercutre.SingletonLoggerCutre;

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
