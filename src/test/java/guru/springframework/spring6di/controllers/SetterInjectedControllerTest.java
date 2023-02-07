package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.GreetingService;
import guru.springframework.spring6di.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Donald F. Coffin
 */
@SpringBootTest
class SetterInjectedControllerTest {

	@Autowired
	SetterInjectedController setterInjectedController;

	@Test
	void sayHello() {
		System.out.println(setterInjectedController.sayHello());
	}
}