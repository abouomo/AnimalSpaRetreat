package com.skilldistillery.spa.entities;

import java.util.Objects;

/**
 * 
 */
public class Xenomorph extends Animal {
	
	private String noise = "Sizzzzzle";
	
	/**
	 * 
	 */
	public Xenomorph() {}
	
	/**
	 * 
	 * @param name
	 */
	public Xenomorph(String name) {
		super(name);
	}

	/**
	 * 
	 */
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println(this.noise);
	}

	/**
	 * 
	 */
	@Override
	public void eat(int quantity) {
		System.out.println("I love eating these " + quantity + " lbs of buffalo.");
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getName());
		builder.append(" the Xenomorph: ");
		builder.append(noise);
		return builder.toString();
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(noise);
		return result;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Xenomorph other = (Xenomorph) obj;
		return Objects.equals(noise, other.noise);
	}
	
	
	
}
