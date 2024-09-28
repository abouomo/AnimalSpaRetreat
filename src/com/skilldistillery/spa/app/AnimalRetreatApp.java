package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Animal;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Dragon;
import com.skilldistillery.spa.entities.Xenomorph;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		
		app.run();
	}
	
	public void run() {
		AnimalRetreat retreat = new AnimalRetreat("Fred the Attendant");
		
		Xenomorph xeno = new Xenomorph("xenooo");
		
		Dragon dragon = new Dragon("dragooon");
		
		retreat.getAnimals()[0] = xeno;
		(retreat.getAnimals())[4] = dragon;
		System.out.println("Test makeRounds() here");
		retreat.startAttendantRounds();
		System.out.println("=================================================");
		for (Animal animal : retreat.getAnimals()) {
			System.out.println(animal);
		}
		
		System.out.println("=================================================");
		
	}

}
