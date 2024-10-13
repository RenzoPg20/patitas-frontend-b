package pe.edu.cibertec.patitas_frontend_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//Se consiguio que cuando el proyecto coorra lo haga utilizando spring claud ademas de la dependencia de FeignClient
@EnableFeignClients
public class PatitasFrontendBApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatitasFrontendBApplication.class, args);
	}



}
