package org.lessons.java.pojo;

import org.lessons.java.pojo.inter.IVolante;
import org.lessons.java.pojo.abs.Animale;

public  class Passerotto extends Animale implements IVolante {
    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    public void dormi() {
        System.out.println("Il passerotto dorme. zzzz");
    }

    @Override
    public void verso() {
        System.out.println("Il passerrotto cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia fiocchi d'avena.");
    }

	@Override
	public void vola() {
		System.out.println("Passerotto : sto volando");
		
	}
}
