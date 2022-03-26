package org.testng;

import org.baseclass.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DataProviderTesting2 extends BaseClassTest{
	
	
	@Test(dataProvider="loginDatas", dataProviderClass=DataProviderTesting.class)
	private void test(String s,String s1) {
		getDriver();
		Launch("https://www.facebook.com/");
		WebElement textUser = locators("id", "email");
		textSend(s, textUser);		
		WebElement textPass = locators("id", "pass");
		textSend(s1, textPass);
		WebElement click = locators("name", "login");
		buttonClick(click);
		

	}

}
