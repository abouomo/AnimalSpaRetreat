package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Animal;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Dragon;
import com.skilldistillery.spa.entities.Hippo;
import com.skilldistillery.spa.entities.Xenomorph;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		
		app.run();
	}
	
	public void run() {
		AnimalRetreat retreat = new AnimalRetreat("Fred the Attendant");
		
		Animal xeno = new Xenomorph("xenooo");
		
		Animal dragon = new Dragon("dragooon");
		
		for (int i = 0; i < 10; i++) {
			(retreat.getAnimals())[i] = xeno;
		}
		
//		(retreat.getAnimals())[9] = dragon;
		
		System.out.println("Test makeRounds() here");
		retreat.startAttendantRounds();
		System.out.println("=================================================");
//		for (Animal animal : retreat.getAnimals()) {
//			System.out.println(animal);
//		}
		
		System.out.println("=================================================");
		
		Animal hippo = new Hippo("hippooo");
		
		retreat.addAnimal(hippo);
		
		System.out.println("=================================================");
//		for (Animal animal : retreat.getAnimals()) {
//			System.out.println(animal);
//		}
		
		
	}

}
