package org.lessons.java;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.Cane;
import org.lessons.java.pojo.Passerotto;
import org.lessons.java.pojo.Aquila;
import org.lessons.java.pojo.Delfino;
public class Main {
	public static void main(String[] args) {
		 	Cane cane = new Cane("Spike");
	        Passerotto passerotto = new Passerotto("Tweetie");
	        Aquila aquila = new Aquila("Aquilino");
	        Delfino delfino = new Delfino("Flipper");

	        Animale[] animali = {cane, passerotto, aquila, delfino};

	        for (Animale animale : animali) {
	            animale.dormi();
	            animale.verso();
	            animale.mangia();
	            System.out.println("------------------");
	        }
	}
}
