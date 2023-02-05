package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class MyController {

	public String sayHello() {

		System.out.println("I'm in the controller");

		return "Hello Everyone!!!";
	}
}
