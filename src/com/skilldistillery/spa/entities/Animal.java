package com.skilldistillery.spa.entities;

public abstract class Animal {
	
	private String name;
	
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("I am an animal, growling with delight!");
	}
	
	public void eat(int quantity) {
		System.out.println("Don't bother me, I'm eating " + quantity + " lbs of food");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
