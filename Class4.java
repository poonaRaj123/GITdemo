package org.javatask;

public class Class4 extends Class3{
	public void car4() {
		System.out.println("Honda");
		this.car3();

	}
	public static void main(String[] args) {
		
		Class4 result = new Class4();
		result.car4();
	}

}
