package com.skilldistillery.spa.app;

import java.util.Scanner;

import com.skilldistillery.spa.entities.Animal;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Dragon;
import com.skilldistillery.spa.entities.Hippo;
import com.skilldistillery.spa.entities.Xenomorph;

public class AnimalRetreatApp {
	
	private AnimalRetreat retreat;
	private Scanner scanner;

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		
		app.run();
	}
	
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
	
	public void menu() {
		System.out.println("\nPlease select an option (1-4) from the menu below:");
		System.out.println("1. List all animals\n"
				+ "2. Add an animal\n"
				+ "3. Start attendant rounds\n"
				+ "4. Close the inn for the night");
		System.out.println("Selection: ");
		
		int option = scanner.nextInt();
		if (option == 1) {
			retreat.listAnimals();
		} else if (option == 2) { 
			// FIX ME
			retreat.addAnimal(null);
		} else if (option == 3) {
			retreat.startAttendantRounds();
		} else if (option == 4) {
			// FIX ME
		}
	}
	
	public void run() {
		retreat = new AnimalRetreat("Fred the Attendant");
		scanner = new Scanner(System.in);
		
		printHead();
		animalsPresentation();
		
		boolean menu = true;
		while(menu) {
			menu();
			
			menu = false;
		}
		
		scanner.close();
	
	}

}
