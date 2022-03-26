package org.testng;

import org.baseclass.BaseClassTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgpara2 extends BaseClassTest {
	
	@Test
	@Parameters({"a","b"})
	private void tc01(int a,int b) {
		int minus = a-b;
		System.out.println("minus of the numbers is :"+minus);	
		

	}
	

}


























