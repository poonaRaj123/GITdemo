package org.testng;

import org.baseclass.BaseClassTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgparaOptionals3 extends BaseClassTest  {
	@Test
	@Parameters({"A","b"})
	private void tc01(@Optional("5")int a,int b) {

		int multi = a*b;
		System.out.println("Multiplication of the numbers is :"+multi);	
		

	}

}
