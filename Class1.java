package org.javatask;

public class Class1 extends Abstract1 implements Interface1  {
	public void car1() {
		System.out.println("Hyundai");
		this.apple();
		this.orange();
		this.laddu();
		this.palkova();
		
	}

	@Override
	public void tomato() {
		System.out.println("Tomato price is :31");
		this.milk();
		this.curd();
	}

	@Override
	public void potato() {
		System.out.println("Potato price is :30");
		
	}

	@Override
	public void milk() {
		System.out.println("Milk price is :20");
		this.britania();
		this.parle();
		
	}

	@Override
	public void curd() {
		System.out.println("Curd price is :12");
		
	}

	@Override
	public void britania() {
		System.out.println("Britania price is :10");
		
	}

	@Override
	public void parle() {
		System.out.println("Parle price is :15");
		
	}

	@Override
	public void apple() {
		System.out.println("Apple price is :40");
		this.tomato();
		this.potato();
	}

	@Override
	public void orange() {
		System.out.println("Orange price is :41");
		
	}

	@Override
	public void laddu() {
		System.out.println("Laddu price is :81");
		this.sunFlower();
		this.goldWinner();
		
	}

	@Override
	public void palkova() {
		System.out.println("Palkova price is :80");
		
	}

	@Override
	public void sunFlower() {
		System.out.println("SunFlower price is :71");
		this.chickenBiriyani();
		this.muttonBiriyani();
		
	}

	@Override
	public void goldWinner() {
		System.out.println("GoldWinner price is :70");
		
		
	}

	@Override
	public void chickenBiriyani() {
		System.out.println("ChickenBiriyani price is :61");
		this.vegBiriyani();
		this.mushroomBiriyani();
		
	}

	@Override
	public void muttonBiriyani() {
		System.out.println("MuttonBiriyani price is :60");
		
	}

	@Override
	public void vegBiriyani() {
		System.out.println("VegBiriyani price is :51");
		
	}

	@Override
	public void mushroomBiriyani() {
		System.out.println("MushroomBiriyani price is :50");
		
	}

}
