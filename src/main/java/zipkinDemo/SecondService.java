package zipkinDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SecondService {
	
	@RequestMapping("/")
	public String printString() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		SpringApplication.run(SecondService.class, 
				"--spring.application.name=secondService",
				"--server.port=9002");
	}

}
