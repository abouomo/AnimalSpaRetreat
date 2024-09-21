package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Xenomorph;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		
		app.run();
	}
	
	public void run() {
		Xenomorph xeno = new Xenomorph("Gladys");
		System.out.println(xeno.getName());
	}

}
