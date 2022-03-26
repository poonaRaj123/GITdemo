package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	static WebDriver driver;
	static WebElement findElement;
	
	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;	

	}
	
	public static void  Launch(String url) {
		driver.get(url);
		
	}
	public static void Title(String text) {
		String title = driver.getTitle();
		System.out.println(title);
		
	

	}
	
	public static WebElement locators(String locatorsType, String values) {
		if (locatorsType.equals("id")) {
			WebElement findElement = driver.findElement(By.id(values));
			return findElement;
			
		} else if (locatorsType.equals("name")) {
			WebElement findElement = driver.findElement(By.name(values));
			return findElement;			
		}else {
			
				WebElement findElement = driver.findElement(By.xpath(values));
				return findElement;			
		}
	}	
	
	public static void textSend(String text, WebElement refName) {
		refName.sendKeys(text);	

	}
	public static void buttonClick(WebElement refName) {
		refName.click();
			

	}
	
	public static JavascriptExecutor driver(String JavascriptExecutor) {
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		return jk;		

	}
	
	public static void executescript( String setvalue, WebElement refName) {
		refName.sendKeys(setvalue);		

	}
	public static  TakesScreenshot driver1(String TakeScreenShot) {
		TakesScreenshot tk = (TakesScreenshot)driver;
		return tk;
		
	}
	public static void getScreenshotAs() {
		

	}
	
	
	
	
	
	

}
