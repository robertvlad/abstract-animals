package org.java.animals;

import org.java.abs.Animale;
import org.java.inte.INuotante;
import org.java.inte.IVolante;

public class Delfino extends Animale implements INuotante{

	@Override
	public void verso() {
		
		System.out.println("Criii-criii");
	}

	@Override
	public void mangia() {
		
		System.out.println("Pesci");
	}

	@Override
	public void nuota() {
		
		System.out.println("Sto nuotando!");
	}
}
