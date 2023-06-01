package org.java.animals;

import org.java.abs.Animale;
import org.java.inte.INuotante;
import org.java.inte.IVolante;

public class Cane extends Animale implements INuotante{

	@Override
	public void verso() {
		
		System.out.println("Bau-bau");
	}

	@Override
	public void mangia() {
		System.out.println("Croccantini");		
	}

	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando!");
	}
}
