package org.lessons.java.pojo;

import org.lessons.java.pojo.inter.IVolante;
import org.lessons.java.pojo.abs.Animale;

public class Aquila extends Animale implements IVolante{
    public Aquila(String nome) {
        super(nome);
    }

    @Override
    public void dormi() {
        System.out.println("L'aquila dorme. zzz");
    }

    @Override
    public void verso() {
        System.out.println("L'aquila  grida");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia topi.");
    }

	@Override
	public void vola() {
		System.out.println("Aquila: sto volando");
		
	}
}
