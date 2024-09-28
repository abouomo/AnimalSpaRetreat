package com.skilldistillery.spa.entities;

import java.util.Objects;

/**
 * This class represents the attendant of an animal retreat and spa.
 */
public class Attendant {
	private String name;
	
	/**
	 * Constructs an attendant with a name.
	 * @param name The name of the attendant
	 */
	public Attendant(String name) {
		this.name = name;
	}
	
	
	
	/**
	 * A getter for the field name.
	 * @return the name of the attendant
	 */
	public String getName() {
		return name;
	}


	/**
	 * Iterates over the passed in Animal array, allowing the attendant to 
	 * check each room for an occupant.  If room has an occupant, it displays 
	 * the name of the occupant that is being fed; otherwise, it displays that
	 * the room is empty.
	 * @param animals The list of Animal to be fed
	 */
	public void makeRounds(Animal [] animals) {
		
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("I will feed " + animals[i].getName());
			} else {
				System.out.println("The room #" + i + " is empty");
			}
		}
		System.out.println(this.name + " is done for the day!");	
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Attendant [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
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
		Attendant other = (Attendant) obj;
		return Objects.equals(name, other.name);
	}
	
}
