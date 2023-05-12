package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.IVolare;

public class Passerotto extends Animale implements IVolare {
	
	@Override
	public void verso() {
		
		System.out.println("CIP-CIP");
	}

	@Override
	public void mangia() {
		
		System.out.println("Insetti");
	}

	
	@Override
	public void vola() {
		
		System.out.println("Sta volando!");
	}
}
