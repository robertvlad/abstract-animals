package org.lessons.java;

import org.lessons.java.interfaccia.INuotare;
import org.lessons.java.interfaccia.IVolare;

public class AnimaleManager {
	
	public void faiVolare(IVolare volante) {
		
		volante.vola();
	}
	
	public void faiNuotare(INuotare nuotatore) {
		
		nuotatore.nuota();
	}
}
