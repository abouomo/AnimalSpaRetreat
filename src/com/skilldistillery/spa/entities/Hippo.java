package com.skilldistillery.spa.entities;

public class Hippo extends Animal {

	private String noise = "Chomp chomp chomp";
	
	
	public Hippo() {}
	
	public Hippo(String name) {
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
