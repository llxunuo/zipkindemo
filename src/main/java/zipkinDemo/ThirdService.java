package zipkinDemo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class ThirdService {
	
	@RequestMapping("/")
	public String printTime() {
		return new Date().toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(ThirdService.class, 
				"--spring.application.name=thirdService",
				"--server.port=9003");
	}

}
