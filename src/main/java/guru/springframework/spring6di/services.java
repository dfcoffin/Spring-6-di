package guru.springframework.spring6di;

import org.springframework.stereotype.Service;

/**
 * @author Donald F. Coffin
 */
public interface services {
	/**
	 * @author Donald F. Coffin
	 */
	interface GreetingService {

		String sayGreeting();
	}

	/**
	 * @author Donald F. Coffin
	 */
	@Service
	class GreetingServiceImpl implements GreetingService {
		@Override
		public String sayGreeting() {
			return "Hello Everyone From Base Service!!!";
		}
	}
}
