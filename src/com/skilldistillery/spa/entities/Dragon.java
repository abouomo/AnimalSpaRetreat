package com.skilldistillery.spa.entities;

import java.util.Objects;

/**
 * 
 */
public class Dragon extends Animal {
	
	private String noise = "Roarrrrr";
	
	/**
	 * 
	 */
	public Dragon() {}
	
	/**
	 * 
	 * @param name
	 */
	public Dragon(String name) {
		super(name);
	}

	/**
	 * 
	 */
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
		System.out.println(this.noise);
	}

	/**
	 * 
	 */
	@Override
	public void eat(int quantity) {
		System.out.println("I love eating these " + quantity + " lbs of goat.");
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getName());
		builder.append(" the Dragon: ");
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
		Dragon other = (Dragon) obj;
		return Objects.equals(noise, other.noise);
	}
	
}
