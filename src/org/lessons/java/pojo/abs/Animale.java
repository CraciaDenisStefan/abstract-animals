package org.lessons.java.pojo.abs;

public abstract class Animale {
	
    private String nome;

    public Animale(String nome) {
    	
    	setNome(nome);
       
    }
    
    public abstract void dormi();

    public abstract void verso();

    public abstract void mangia();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
