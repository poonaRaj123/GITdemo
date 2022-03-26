package org.javatask;

public class Constructor2 extends Constructor3  {
	
	public Constructor2(String name, int companyId) {
		System.out.println("Company name is :"+name+"\t"+"Company id is :"+companyId);
		
	}
	public Constructor2() {
		this("Infosys", 679);
		System.out.println("Company Info");
	}

}
