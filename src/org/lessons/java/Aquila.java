package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.IVolare;

public class Aquila extends Animale implements IVolare {
	
	@Override
	public void verso() {
		
		System.out.println("CRAAA");
	}

	@Override
	public void mangia() {
		
		System.out.println("Carne");
	}

	
	@Override
	public void vola() {
		
		System.out.println("Sta volando!");
	}
}
