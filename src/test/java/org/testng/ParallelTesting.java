package org.testng;

import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	private void tc01() {
		System.out.println("Test1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc02() {
		System.out.println("Test2");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc03() {
		System.out.println("Test3");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc04() {
		System.out.println("Test4");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc05() {
		System.out.println("Test5");
		System.out.println(Thread.currentThread().getId());

	}


}
