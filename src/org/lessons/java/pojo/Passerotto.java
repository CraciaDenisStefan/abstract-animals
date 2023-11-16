package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
public class Passerotto extends Animale {
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
}
