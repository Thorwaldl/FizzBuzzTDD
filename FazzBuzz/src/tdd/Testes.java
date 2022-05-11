package tdd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void test() {
		assertEquals(true, fb.testaTres(3));
	}

	@Test
	void test() {
		assertEquals(false, fb.testaTres(1));
	}

	@Test
	void test() {
		assertEquals(true, fb.testaCinco(5));
	}
	
	@Test
	void test() {
		assertEquals(false, fb.testaCinco(1));
	}
}

