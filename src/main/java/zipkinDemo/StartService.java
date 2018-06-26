package zipkinDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@RestController
public class StartService {
	
	@Autowired
	RestTemplate restTemplate;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping("/")
	public String callOther() {
		return restTemplate.getForObject("http://localhost:9001", String.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(StartService.class, 
				"--spring.application.name=startService",
				"--server.port=9000");
	}

}
