package com.skilldistillery.spa.entities;

public class AnimalRetreat {
	
	private Attendant attendant;
	
	public AnimalRetreat(String attendantName) {
		attendant = new Attendant(attendantName);
	}
}
