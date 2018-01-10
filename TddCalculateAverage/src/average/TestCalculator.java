package average;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAverage() {
		Calculator calculator = new Calculator();
		calculator.addElement(1);
		calculator.addElement(2);
		calculator.addElement(1000);
		
		try {
			System.out.println(calculator.average());
			assertEquals(334.33, calculator.average(), .01);
		}
		catch (NoElementsException e) {
			fail("Caught NoElementsException");
		}
	}
	
	@Test
	public void testDivideByZero() {
		try {
			new Calculator().average();
			fail("expected NoElementsException");
		}
		catch (NoElementsException e) {
			
		}

}

	
}