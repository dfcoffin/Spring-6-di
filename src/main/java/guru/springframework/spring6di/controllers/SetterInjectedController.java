package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class SetterInjectedController {

	@Autowired
	private services.GreetingService greetingService;

	public void setGreetingService(services.GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
