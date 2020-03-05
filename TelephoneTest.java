/**
 * Nathan Repella Unit Test Case
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TelephoneTest {

	@Test
	void testFormat() {
		Telephone tele = new Telephone();
		String result = tele.format("5556556555");
		assertEquals("(555)655-6555", result);
	}

	@Test
	void testFormat1() {
		Telephone tele = new Telephone();
		String result = tele.format("(555)655-6555");
		assertEquals("(555)655-6555", result);
	}
	
	@Test
	void testFormat2() {
		Telephone tele = new Telephone();
		String result = tele.format("5556667777");
		assertFalse(result.length() != 13);
	}
}
