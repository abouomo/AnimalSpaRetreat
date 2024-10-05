package com.skilldistillery.spa.app;

import java.util.Scanner;

import com.skilldistillery.spa.entities.Animal;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Dragon;
import com.skilldistillery.spa.entities.Hippo;
import com.skilldistillery.spa.entities.Tarantula;
import com.skilldistillery.spa.entities.Xenomorph;

public class AnimalRetreatApp {
	
	private AnimalRetreat retreat;
	private Scanner scanner;

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.run();
	}
	
	/**
	 * Header.
	 */
	public void printHead() {
		System.out.println("We're excited to announce the COMPLETION of "
				+ "building out our NEW Animal Retreat and Spa Resort.\n"
				+ "We welcome our non-human guests, and invite them all "
				+ "to luxuriate in delight!\n"
				+ "We've hired the best attendant on the planet to provide"
				+ " for all our guests. ");
		
		System.out.println(retreat.getAttendant().getName() 
				+ " , please introduce yourself!\n");
		
		System.out.println("Huzzah! I got the job of my dreams as "
				+ "Attendant JUST BEFORE THE COMPLETION OF THE NEW Animal"
				+ " Retreat and Spa! I can't wait to get started!\n");
	}
	
	/**
	 * Lists current animal at the retreat.
	 */
	public void animalsPresentation() {
		Animal ethel = new Xenomorph("Ethel");
		Animal miranda = new Dragon("Miranda");
		Animal henri = new Hippo("Henri");
		
		retreat.getAnimals()[4] = ethel;
		retreat.getAnimals()[7] = miranda;
		retreat.getAnimals()[0] = henri;
		System.out.println("Make yourself at home, " +  ethel.getName());
		System.out.println("Make yourself at home, " +  miranda.getName());
		System.out.println("Make yourself at home, " +  henri.getName());
	}
	
	/**
	 * Prompt the user to choose which sub-type of Animal. When the user 
	 * chooses the type, construct that type of animal.
	 */
	public Animal createAnimalBasedOnUserInput() {
		Animal theAnimal = null;
		// ask which kind of animal
		System.out.println("You've chosen to add a new animal. What kind of "
				+ "animal do you want to add? (a-d)");
		System.out.println("a. Dragon\n"
				+ "b. Hippo\n"
				+ "c. Tarantula\n"
				+ "d. Xenomorph");
		char animalOption = scanner.next().charAt(0);
		// create that specific animal
		switch(animalOption) {
		case 'a':
		case 'A':
			theAnimal = new Dragon();
			break;
		case 'b':
		case 'B':
			theAnimal = new Hippo();
			break;
		case 'c':
		case 'C':
			theAnimal = new Tarantula();
			break;
		case 'd':
		case 'D':
			theAnimal = new Xenomorph();
			break;
		default:
			System.out.println("We only handle four types of animal");
			System.out.println("a. Dragon\n"
					+ "b. Hippo\n"
					+ "c. Tarantula\n"
					+ "d. Xenomorph");
		}
		
		System.out.println("Next, what is their name?");
		String name = scanner.next();
		theAnimal.setName(name);
		
		return theAnimal;
	}
	
	/**
	 * Add an animal to the sanctuary.
	 * @param theSpa The sanctuary
	 */
	public void addAnimal(AnimalRetreat theSpa) {
		theSpa.addAnimal(createAnimalBasedOnUserInput());
	}
	
	/**
	 * List the menu option.
	 */
	public void menu() {
		System.out.println("\nPlease select an option (1-4) from the menu below:");
		System.out.println("1. List all animals\n"
				+ "2. Add an animal\n"
				+ "3. Start attendant rounds\n"
				+ "4. Close the inn for the night");
		System.out.println("Selection: ");
	}
	
	/**
	 * Handles the logic.
	 */
	public void run() {
		retreat = new AnimalRetreat("Fred the Attendant");
		scanner = new Scanner(System.in);
		printHead();
		animalsPresentation();
		boolean menu = true;
		while(menu) {
			menu();
			int option = scanner.nextInt();
			if (option == 1) {
				retreat.listAnimals();
			} else if (option == 2) { 
				addAnimal(retreat);
			} else if (option == 3) {
				retreat.startAttendantRounds();
			} else if (option == 4) {
				menu = false;
			}
		}
		scanner.close();
	}
}
