package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;

public class Cane extends Animale {
	
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void dormi() {
        System.out.println("Il cane dorme. zZzz");
    }

    @Override
    public void verso() {
        System.out.println("Il cane fa Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia carne.");
    }
}