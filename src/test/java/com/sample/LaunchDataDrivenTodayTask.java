package com.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchDataDrivenTodayTask {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13 pro",Keys.ENTER);
		Thread.sleep(3000);
		File f = new File("C:\\Users\\ELCOT\\Desktop\\LaunchMaven\\Excel1\\iphone13pro1.xls");
		Workbook w = new HSSFWorkbook();
		Sheet createSheet = w.createSheet("Sheet1");
		List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < phones.size(); i++) {
			WebElement webElement = phones.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			
		}
		FileOutputStream fs = new FileOutputStream(f);
		w.write(fs);
		
		
		
		
	}
	
	
	
}
	

	


