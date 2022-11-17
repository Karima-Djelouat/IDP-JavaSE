package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.estDomestique;

public class Chien extends Animal implements estDomestique {

    
    
    public Chien() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Chien(String name, String color, int age, int nbLegs) {
        super(name, color, age, nbLegs);
        // TODO Auto-generated constructor stub
    }

    public Chien(String name, String color, int age) {
        super(name, color, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void crier() {
        System.out.println("Wouaf Wouaf");
        
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("J'ai besoin de calins !");
        
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Jète moi cette balle, s'il te plaît !");
        
    }

}
