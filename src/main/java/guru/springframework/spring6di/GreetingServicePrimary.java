package guru.springframework.spring6di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Donald F. Coffin
 */
@Primary
@Service
public class GreetingServicePrimary implements services.GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello From the Primary Bean!!";
	}
}
