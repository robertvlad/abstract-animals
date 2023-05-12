package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.INuotare;

public class Cane extends Animale implements INuotare {
	
	@Override
	public void verso() {
		
		System.out.println("BAUUU");;
	}

	@Override
	public void mangia() {
		
		System.out.println("Carne");
	}

	@Override
	public void nuota() {
		
		System.out.println("Sta nuotando!");
	}
}
