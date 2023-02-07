package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingService;

/**
 * @author Donald F. Coffin
 */
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
