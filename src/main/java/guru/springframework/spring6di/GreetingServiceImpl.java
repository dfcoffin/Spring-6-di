package guru.springframework.spring6di;

/**
 * @author Donald F. Coffin
 */
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello Everyone From Base Service!!!";
	}
}
