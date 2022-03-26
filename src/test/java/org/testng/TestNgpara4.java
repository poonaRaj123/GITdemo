package org.testng;

import org.baseclass.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgpara4 extends BaseClassTest {
	
	@BeforeClass
	private void tc01() {
		getDriver();
		Launch("https://www.facebook.com/");
		
	}
	@Test
	@Parameters({"Username"})
	private void tc02(String userName) {
		WebElement textUser = locators("id", "email");
		textSend(userName, textUser);		

	}
	@Test
	@Parameters({"Password"})
	private void tco3(String passWord) {
		WebElement textPass = locators("id", "pass");
		textSend(passWord, textPass);

	}
	@Test
	private void tco4() {
		WebElement login = locators("name", "login");
		buttonClick(login);

	}
	

}
