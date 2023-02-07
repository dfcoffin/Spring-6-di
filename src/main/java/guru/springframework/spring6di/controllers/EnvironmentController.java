package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class EnvironmentController {

	private final EnvironmentService environmentService;

	public EnvironmentController(EnvironmentService environmentService) {
		this.environmentService = environmentService;
	}

	public String getEnvironment() {
		return "You are in " + environmentService.getEnv() + " Environment";
	}
}
