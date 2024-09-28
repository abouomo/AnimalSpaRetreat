package com.skilldistillery.spa.entities;

import java.util.Objects;

/**
 * 
 */
public class Tarantula extends Animal {
	
	
	private String noise = "Hissssssssss";
	
	/**
	 * 
	 */
	public Tarantula() {}
	
	/**
	 * 
	 * @param name
	 */
	public Tarantula(String name) {
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
		System.out.println("I love eating these " + quantity + " lbs of crickets.");
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
		Tarantula other = (Tarantula) obj;
		return Objects.equals(noise, other.noise);
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarantula [noise=");
		builder.append(noise);
		builder.append("]");
		return builder.toString();
	}
	
	

}
