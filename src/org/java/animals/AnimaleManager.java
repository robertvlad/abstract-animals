package org.java.animals;

import org.java.inte.INuotante;
import org.java.inte.IVolante;

public class AnimaleManager {
	
	public void faiVolare(IVolante animale) {
		
		animale.vola();		
	}
	
	public void faiNuotare(INuotante animale) {
		
		animale.nuota();
	}
}
