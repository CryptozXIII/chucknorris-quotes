package de.htwberlin;

import de.htwberlin.service.QuotesService;
import de.htwberlin.service.QuotesServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ChucknorrisQuotesApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void quote(){
		QuotesService qs = new QuotesServiceImp();
		String actual = qs.getQuote(0);
		String expected ="Chuck Norris dreht nicht die Dusche auf. Er starrt sie an, bis sie zu weinen anfängt.";
		actual.equals(expected);
	}
}
