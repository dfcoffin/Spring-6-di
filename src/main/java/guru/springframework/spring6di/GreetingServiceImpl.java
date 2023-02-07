package guru.springframework.spring6di;

import org.springframework.stereotype.Service;

/**
 * @author Donald F. Coffin
 */
@Service
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello Everyone From Base Service!!!";
	}
}
