package org.testng;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsOnTesting {
	@Test(groups="@smoke")
		private void tc01() {
		//depends on Assert
		Assert.assertTrue(false);
		System.out.println("Test1");

	}
	@Test(groups="@reg",dependsOnGroups="@smoke")//depends on groups
	private void tc02() {
		System.out.println("Test2");

	}
	@Test(groups="@smoke",invocationCount=3)//invocation count
	private void tc03() {
		System.out.println("Test3");

	}
	@Test(groups="@sanity",dependsOnMethods= {"tc01"})//depends on Methods
	private void tc04() {
		System.out.println("Test4");

	}
	@Test(groups="@smoke",enabled=false)//Skip particular method
	private void tc05() {
		System.out.println("Test5");

	}
	@Test(groups="@reg",dependsOnGroups="@smoke",alwaysRun=true)//alwaysRun
	private void tc06() {
		System.out.println("Test6");

	}
	@Test(groups="@sanity",dependsOnMethods= {"tc01"})//depends on Methods
	private void tc07() {
		System.out.println("Test7");

	}

	
}
