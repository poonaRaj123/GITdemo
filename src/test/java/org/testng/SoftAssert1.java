package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	private void tc01() {
		String s ="Hi";
		SoftAssert assert2 = new SoftAssert();
		assert2.assertEquals("hi", s);
		
			
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
