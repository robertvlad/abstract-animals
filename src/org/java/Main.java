package org.java;

import org.java.abs.Animale;
import org.java.animals.AnimaleManager;
import org.java.animals.Aquila;
import org.java.animals.Cane;
import org.java.animals.Delfino;
import org.java.animals.Passerotto;
import org.java.inte.INuotante;
import org.java.inte.IVolante;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Cane: \n");
		Cane c = new Cane();
		c.dormi();
		c.verso();
		c.mangia();
		System.out.println("\n-------------------\n");
		
		System.out.println("Passerotto: \n");
		Passerotto p = new Passerotto();
		p.dormi();
		p.verso();
		p.mangia();
		System.out.println("\n-------------------\n");
		
		System.out.println("Aquila: \n");
		Aquila a = new Aquila();
		a.dormi();
		a.verso();
		a.mangia();
		System.out.println("\n-------------------\n");
		
		System.out.println("Delfino: \n");
		Delfino d = new Delfino();
		d.dormi();
		d.verso();
		d.mangia();
		System.out.println("\n-------------------\n");
		
		
		Animale[] animals = {c, p, a, d};
		
		for (int i = 0; i < animals.length; i++) {
			
			Animale an = animals[i];
			
			System.out.print(an.getClass().getSimpleName() + ": ");
			an.verso();
		}
		
		
		System.out.println("\n-------------------\n");
		
		
		System.out.println("Animali che volano \n");
		
		IVolante[] fly = {p, a};
		
		for (int i = 0; i < fly.length; i++) {
			
			IVolante fl = fly[i];
			
			System.out.print(fl.getClass().getSimpleName() + ": ");
			
			fl.vola();
		}
		
		
		System.out.println("\n-------------------\n");
		
		
		System.out.println("Animali che nuotano \n");
		
		INuotante[] swim = {c, d};
		
		for (int i = 0; i < fly.length; i++) {
			
			INuotante sw = swim[i];
			
			System.out.print(sw.getClass().getSimpleName() + ": ");
			sw.nuota();
		}	
		
		
		System.out.println("\n-------------------\n");
		
		
		AnimaleManager am = new AnimaleManager();
		
		am.faiNuotare(d);
		am.faiVolare(a);
		
		am.faiNuotare(c);
		am.faiVolare(p);		
	}
}
