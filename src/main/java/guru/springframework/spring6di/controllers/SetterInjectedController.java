package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class SetterInjectedController {

	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
