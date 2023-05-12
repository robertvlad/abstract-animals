package org.lessons.java.main;

import org.lessons.java.Aquila;
import org.lessons.java.Cane;
import org.lessons.java.Delfino;
import org.lessons.java.Passerotto;
import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.INuotare;
import org.lessons.java.interfaccia.IVolare;

public class Main {
	
	public static void main(String[] args) {
		
		Cane c = new Cane();
		Passerotto p = new Passerotto();
		Aquila a = new Aquila();
		Delfino d = new Delfino();
		
		System.out.println("Cane:");
		c.dormi();
		c.verso();
		c.mangia();
		System.out.println("------------\n");
		
		System.out.println("Passerotto:");
		p.dormi();
		p.verso();
		p.mangia();
		System.out.println("------------\n");
		
		System.out.println("Aquila:");
		a.dormi();
		a.verso();
		a.mangia();
		System.out.println("------------\n");
		
		System.out.println("Delfino:");
		d.dormi();
		d.verso();
		d.mangia();
		
		System.out.println("------------\n");		
		System.out.println("------------\n");
		
		System.out.println("Array:");
		
		Animale[] animali = { c, p, a, d };
		
		for ( int i = 0; i < animali.length; i++ ) {
			
			Animale an = animali[i];
			
			System.out.println(an.getClass().getSimpleName() + ":");
			
			an.dormi();
			an.verso();
			an.mangia();
			
			System.out.println("------------\n");
		}
		
		System.out.println("------------\n");
		System.out.println("Array animali che volano:");
		
		IVolare[] volanti = { p, a };
		
		for ( int i = 0; i < volanti.length; i++) {
			
			IVolare iv = volanti[i];
			
			System.out.println(iv.getClass().getSimpleName() + ":");
			
			iv.vola();
			
			System.out.println("------------\n");
		}
		
		System.out.println("------------\n");
		System.out.println("Array animali che nuotano:");
		
		INuotare[] nuotanti = { c, d };
		
		for ( int i = 0; i < nuotanti.length; i++) {
			
			INuotare in = nuotanti[i];
			
			System.out.println(in.getClass().getSimpleName() + ":");
			
			in.nuota();
			
			System.out.println("------------\n");
		}
	}
}
