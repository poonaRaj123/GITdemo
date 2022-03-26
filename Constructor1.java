package org.javatask;

public class Constructor1 extends Constructor2 {
	
	public Constructor1(String name, int empId) {
		System.out.println("Employee name is :"+name+"\t"+"Employee id is :"+empId);
		}
	
	public Constructor1() {
		this("Jayaram", 90302);
		System.out.println("Employee Info");
	}
	
	

}
