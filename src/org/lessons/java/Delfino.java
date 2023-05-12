package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.INuotare;

public class Delfino extends Animale implements INuotare {
	
	@Override
	public void verso() {
		
		System.out.println("TRIII");
	}

	@Override
	public void mangia() {
		
		System.out.println("Pesce");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("Sta nuotando!");
	}
}
