package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

// comme le model Animal est abstrait, on l'étend ici pour récup ses attributs

public class Felin extends Animal {

    private boolean isSociable;
    private boolean hasGriffesRectactiles;
    
    public Felin() {
        super();
        this.setPelage(Peau.FOURRURE);
    }

    public Felin(String name, String color, int age) {
        super(name, color, age, 4);
        this.setPelage(Peau.FOURRURE);
    }
 
    
    public Felin(String name, String color, int age, boolean griffes, boolean sociable) {
        super(name, color, age);
        this.hasGriffesRectactiles=griffes;
        this.isSociable = sociable;
        this.setPelage(Peau.FOURRURE);
    }
    
    // pour préciser que la méthode vient d'une interface ou d'une classe parente (animal)
    @Override
    public void crier() {
        System.out.println("Graou Graou");
    }
    public boolean isSociable() {
        return isSociable;
    }

    public void setSociable(boolean isSociable) {
        this.isSociable = isSociable;
    }

    public boolean isHasGriffesRectactiles() {
        return hasGriffesRectactiles;
    }

    public void setHasGriffesRectactiles(boolean hasGriffesRectactiles) {
        this.hasGriffesRectactiles = hasGriffesRectactiles;
    }
    
    
}
