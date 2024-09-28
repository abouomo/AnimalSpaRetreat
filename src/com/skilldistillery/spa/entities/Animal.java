package com.skilldistillery.spa.entities;

import java.util.Objects;

/**
 * 
 */
public abstract class Animal {
	
	private String name;
	
	
	protected Animal() {}
	
	/**
	 * 
	 * @param name
	 */
	protected Animal(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public void makeNoise() {
		System.out.println("I am an animal, growling with delight!");
	}
	
	/**
	 * 
	 * @param quantity
	 */
	public void eat(int quantity) {
		System.out.print("Don't bother me, I'm eating " + quantity + " lbs of food");
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
		
}
