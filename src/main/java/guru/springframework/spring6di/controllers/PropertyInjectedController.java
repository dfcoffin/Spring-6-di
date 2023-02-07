package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	services.GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
