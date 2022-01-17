package MavenTest.SampleTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import SampleProg.Calculator;

public class CalTest {
	Calculator c = new Calculator();
	@Test
	public void logic () {
		System.out.println("Sample Calculator");
		assertEquals("Addition success ", 20,c.add(10, 10));
		assertEquals("Multipilcation sucess ", 200,c.mul(20, 10));
		
	}
	
}
