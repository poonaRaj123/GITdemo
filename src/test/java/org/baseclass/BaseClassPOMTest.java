package org.baseclass;

import org.openqa.selenium.WebElement;

public class BaseClassPOMTest extends BaseClassTest{
public static void main(String[] args) {
	
	getDriver();
	Launch("https://www.facebook.com/");
	POMTesting p = new POMTesting();
	WebElement textUser = p.getUserName();
	textSend("jack@gmail.com", textUser);
	driver.navigate().refresh();
	textSend("katie@gmail.com", textUser);
	
	
	
	
}
	


}
