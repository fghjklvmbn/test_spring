package univ.gwangju.demo_park;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerTest {
	@GetMapping("/test")
	public String index() {
		return "Greetings from Spring Boot! test";
	}
}
