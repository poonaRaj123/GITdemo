package org.testng;

import org.testng.annotations.Test;

public class PriorityTestNg {
	
	@Test(priority=-4,enabled=false)//skip the particular method
	private void tc01() {
		System.out.println("Test1");

	}
	@Test(priority=3,invocationCount=4)//Invocation count
	private void tc02() {
		System.out.println("Test2");

	}
	@Test(priority=-6)
	private void tc03() {
		System.out.println("Test3");

	}
	@Test(priority=6)
	private void tc04() {
		System.out.println("Test4");

	}
	@Test(priority=0)
	private void tc05() {
		System.out.println("Test5");

	}
	@Test(priority=4)
	private void tc06() {
		System.out.println("Test6");

	}

}
