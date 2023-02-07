package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Donald F. Coffin
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@BeforeEach
	void setup() throws Exception {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());

	}

	@Test
	void sayHello() {
		System.out.println(controller.sayHello());
	}
}