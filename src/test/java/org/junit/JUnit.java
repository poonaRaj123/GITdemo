package org.junit;

import org.baseclass.BaseClassTest;
import org.openqa.selenium.WebElement;

public class JUnit extends BaseClassTest {
	@BeforeClass
	public static void tc01() {
		getDriver();	

	}
	@Before
	public void tc02() {
		Launch("https://www.facebook.com/");

	}
	@Test
	public void tc03() {
		WebElement textUser = locators("id", "email");
		textSend("ramjey@gmail.com", textUser);
		
		

	}
	@After
	public void tc04() {
		WebElement textPass = locators("xpath", "//input[@type='password']");
		textSend("55875875", textPass);

	}
	@AfterClass
	public static void tc05() {
		WebElement buttonLogin = locators("name", "login");
		buttonClick(buttonLogin);

	}
	
	
	

}
