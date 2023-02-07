package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class ConstructorInjectedController {
	private final services.GreetingService greetingService;

	public ConstructorInjectedController(services.GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
