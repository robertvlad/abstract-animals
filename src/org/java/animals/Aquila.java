package org.java.animals;

import org.java.abs.Animale;
import org.java.inte.IVolante;

public class Aquila extends Animale implements IVolante{

	@Override
	public void verso() {
		
		System.out.println("Cra-cra");
	}

	@Override
	public void mangia() {
		
		System.out.println("Conigli");
	}

	@Override
	public void vola() {
		
		System.out.println("Sto volando!");
	}
}
