package org.testng;

import org.baseclass.BaseClassTest;
import org.testng.annotations.Test;

public class ParallelTesting2 extends BaseClassTest {
	@Test
	private void tc01() {
		getDriver();
		Launch("https://www.facebook.com/");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc02() {
		getDriver();
		Launch("https://www.amazon.in/");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc03() {
		getDriver();
		Launch("https://www.flipkart.com/");
		Title(null);
		System.out.println(Thread.currentThread().getId());			
	}
	

}
