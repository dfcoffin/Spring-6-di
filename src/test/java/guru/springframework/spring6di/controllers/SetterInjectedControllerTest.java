package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingService;
import guru.springframework.spring6di.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Donald F. Coffin
 */
class SetterInjectedControllerTest {

	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setup() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void sayHello() {
		System.out.println(setterInjectedController.sayHello());
	}
}