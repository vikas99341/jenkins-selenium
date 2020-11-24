package com.vikas.training.jenkins;

import static org.junit.Assert.*;

public class JenkinsCalcTest {

	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNumbers(5,5));
		fail("Not yet implemented");
	}
	
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.subtractNumbers(5,5));
		fail("Not yet implemented");
	}
}
