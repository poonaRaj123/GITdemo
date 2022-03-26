package org.testng;

import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void tc01() {
		String s ="Hi";
		Assert.assertEquals("hi", s);
		System.out.println(s);
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
		

	}
	@Test
	private void tc02() {
		System.out.println("End");

	}

}
