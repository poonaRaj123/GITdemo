package org.testng;

import org.baseclass.BaseClassTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgpara1 extends BaseClassTest {
	
	@Test
	@Parameters({"a","b"})
	private void tc01(int a,int b) {
		int sum = a+b;
		System.out.println("Sum of the numbers is :"+sum);	
		

	}
	
	

}
