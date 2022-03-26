package com.sample;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class LaunchWriteDataDriven {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\Desktop\\LaunchMaven\\Excel1\\Jack.xlsx");
		
		Workbook b = new HSSFWorkbook();
		
		//Create new sheet
		
		Sheet createSheet = b.createSheet("DataDriven");
		
		//Create a new Row
		
		Row createRow = createSheet.createRow(2);
		
		//create a cell
		
		Cell createCell = createRow.createCell(1);
		
		//Set the value for cell
		
		createCell.setCellValue("JAYARAM");
		
		//Create object for file Outputstream class
		
		FileOutputStream fileout = new FileOutputStream(f);
		b.write(fileout);
	}

}
