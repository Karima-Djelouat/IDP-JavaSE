package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.estDomestique;

// classe final ne pourra plus être hérité par la suite

public final class Chat extends Felin implements estDomestique{

    public Chat() {
    }

    public Chat(String name, String color, int age) {
        super(name, color, age, true, true);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void crier() {
        System.out.println("Miaou Miaou");
    }

    public void demanderCroquettes() {
        System.out.println("Nourris moi, humain·e !");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Je veux des caresses !!");
        
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Joue avec moi, humaine !");
        
    }
}
