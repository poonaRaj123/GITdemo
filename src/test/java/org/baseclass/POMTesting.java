package org.baseclass;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMTesting extends BaseClassTest{
	
	public POMTesting() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="email")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}

	

	
	
	

	
	
	
	

}
