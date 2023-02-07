package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Donald F. Coffin
 */
@Profile({"default", "dev"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {
	@Override
	public String getEnv() {
		return "dev";
	}
}
