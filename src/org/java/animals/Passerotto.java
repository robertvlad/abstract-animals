package org.java.animals;

import org.java.abs.Animale;
import org.java.inte.IVolante;

public class Passerotto extends Animale implements IVolante{

	@Override
	public void verso() {
		
		System.out.println("Cip-cip");
	}

	@Override
	public void mangia() {
		
		System.out.println("Vermi");
	}

	@Override
	public void vola() {

		System.out.println("Sto volando!");
	}

}
