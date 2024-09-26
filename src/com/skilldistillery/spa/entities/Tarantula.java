package com.skilldistillery.spa.entities;

public class Tarantula extends Animal {
	
	
	private String noise = "Hissssssssss";
	
	
	public Tarantula() {}
	
	public Tarantula(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println(this.noise);
	}

	@Override
	public void eat(int quantity) {
		// TODO Auto-generated method stub
		super.eat(quantity);
	}

}
