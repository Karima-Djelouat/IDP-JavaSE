package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

//classe abstraite, ne pourra pas être instancié

abstract public class Animal {

    /*
     * POJO Plain Old Java Object (convention d'écriture) => classe sans
     * restrictions Java Beans (type de POJO) => classe, manière dont les objets
     * sont écrits : constructor, attributs privés, getters et setters, serializable
     * (transformer une donnée complexe comme un objet en élément plus simple) Bonne
     * pratique, convention d'écriture
     * 
     * Public => utilisable dans tous les projets Private => utilisable uniquement
     * dans la classe Protected (default) => utilisable uniquement dans le package
     * 
     */

    private int nbLegs, age;
    private String color, name;
    private Peau pelage;
    // static : dès qu'un nouvel animal se crée, incrémentation de count
    private static int count = 0;
    
    public Animal() {
        count++;

    }

    public Animal(String name, String color, int age) {
        this.age = age;
        this.color = color;
        this.name = name;
        count++;
    }

    public Animal(String name, String color, int age, int nbLegs) {
        this.nbLegs = nbLegs;
        this.age = age;
        this.color = color;
        this.name = name;
        count++;
    }


    public void manger() {
        System.out.println(this.name + " dit Miam Miam !");
    }
    
    
    public void switchPelage() {
        switch(this.pelage) {
        
        case FOURRURE :
            System.out.println("Perd ses poils partout.");
            break;
        case ECALLES :
            System.out.println("Pas agréable à caresser.");
            break;
        case CARAPASSES :
            System.out.println("Change de carapaces tous les 4 matins !");
            break;
        default:
            System.out.println("Plus d'idées.");
            break;
        
        }
    }

    // on pourra utiliser cette méthode dans les autres classes avec plus de détails
    // selon le type de l'animal
    public abstract void crier();

    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getAge() {
        return age;
    }

    // pas de setter pour count car je ne veux pas modif le nombre d'animaux crées;
    public static int getCount() {
        return count;
    }

   
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peau getPelage() {
        return pelage;
    }

    public void setPelage(Peau pelage) {
        this.pelage = pelage;
    }
    
    

}
