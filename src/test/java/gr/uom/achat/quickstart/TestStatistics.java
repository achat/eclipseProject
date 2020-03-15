package gr.uom.achat.quickstart;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStatistics {

	@Test
	public void test() {
		
		Statistics stat = new Statistics();
		
		double expected = 51.0;
		double actual = stat.calcMedian();
		
		assertEquals(expected, actual, 0.0001);
		

	}

}
