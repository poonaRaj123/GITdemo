package org.javatask;

public class Constructor3 extends Constructor4  {
	
	
	public Constructor3(String name, int clientId) {
		System.out.println("Client name is :"+name+"\t"+"Client id is :"+clientId);
		
		
	}
	public Constructor3() {
		this("Honeywell", 568);
		System.out.println("Client Info");
		
		
	}

}
