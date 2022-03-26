package org.testng;

import org.baseclass.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting extends BaseClassTest {
	
@DataProvider(name="loginDatas")
public Object[][] getdata() {
	
		return new Object[][] {
			{"jack67@gmail.com","5764534"},{"kate71@gmail.com","87565737657"},{"jey79@gmail.com","990796586"}
		};
		}
	
	

}
