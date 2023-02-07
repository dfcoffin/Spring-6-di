package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author Donald F. Coffin
 */
@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

	@Autowired
	EnvironmentController controller;

	@Test
	void getEnvironment() {
		System.out.println(controller.getEnvironment());
	}
}