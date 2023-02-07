package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
