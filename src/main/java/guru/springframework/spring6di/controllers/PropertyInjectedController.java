package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingService;

/**
 * @author Donald F. Coffin
 */
public class PropertyInjectedController {

	GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
