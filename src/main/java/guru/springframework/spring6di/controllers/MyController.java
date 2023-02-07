package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class MyController {

	private final services.GreetingService greetingService;

	public MyController() {
		this.greetingService = new services.GreetingServiceImpl();
	}

	public String sayHello() {
		System.out.println("I'm in the controller");

		return greetingService.sayGreeting();
	}
}
