package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Donald F. Coffin
 */
class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setup() throws Exception {

		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	void sayHello() {
		System.out.println(propertyInjectedController.sayHello());
	}
}