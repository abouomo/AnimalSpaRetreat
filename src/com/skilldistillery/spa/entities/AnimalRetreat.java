package com.skilldistillery.spa.entities;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class represents the animal retreat and spa, with a collection of 
 * animal guests and an attendant to care for them.
 */
public class AnimalRetreat {
	
	private Attendant attendant;
	private Animal [] animals;
	public static final int NUMBER_OF_ANIMALS = 10;
	
	/**
	 * Constructs an animal retreat/spa with an attendant and animals.
	 * @param attendantName
	 */
	public AnimalRetreat(String attendantName) {
		attendant = new Attendant(attendantName);
		animals = new Animal[NUMBER_OF_ANIMALS];
	}
	
	
	/**
	 * Getter for Attend name.
	 * @return the attendant
	 */
	public Attendant getAttendant() {
		return attendant;
	}
	
	
	
	/**
	 * @return the animals
	 */
	public Animal[] getAnimals() {
		return animals;
	}


	/**
	 * Iterates over its Animal array and displays the name of the animal 
	 * occupying the room, or "This room is empty" if the room is unoccupied 
	 * (null).
	 */
	public void listAnimals() {
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println(animal);				
			} else System.out.println("This room is empty");
		}
	}
	
	/**
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		
	}
	
	/**
	 * 
	 */
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}


	/**
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalRetreat [attendant=");
		builder.append(attendant);
		builder.append(", animals=");
		builder.append(Arrays.toString(animals));
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(animals);
		result = prime * result + Objects.hash(attendant);
		return result;
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
		AnimalRetreat other = (AnimalRetreat) obj;
		return Arrays.equals(animals, other.animals) 
				&& Objects.equals(attendant, other.attendant);
	}
	
	
	
}
