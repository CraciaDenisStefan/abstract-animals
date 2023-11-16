package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante {
    public Delfino(String nome) {
        super(nome);
    }

    @Override
    public void dormi() {
        System.out.println("Il delfino dorme. zzZZZz");
    }

    @Override
    public void verso() {
        System.out.println("Il delfino fa chichichi (boh hahahaha)");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesce.");
    }

	@Override
	public void nuota() {
		System.out.println("Delfino: sto nuotando");
		
	}


}
 