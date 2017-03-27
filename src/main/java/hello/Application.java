package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import participationSystem.gestionSugerencias.Services;
import participationSystem.model.Configuration;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
        Configuration config = Services.getSystemServices().getConfiguration();

    }
}