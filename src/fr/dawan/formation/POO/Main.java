package fr.dawan.formation.POO;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.formation.POO.interfaces.estDomestique;
import fr.dawan.formation.POO.models.Animal;
import fr.dawan.formation.POO.models.Chat;
import fr.dawan.formation.POO.models.Chien;
import fr.dawan.formation.POO.models.Felin;

public class Main {

    public static void main(String[] args) {

        Chien chien = new Chien();
        chien.setName("Médor");

        Chat chat = new Chat("Cactus", "tabby", 10);
        chat.manger();

        chien.crier();
        chat.crier();

        Felin felin = new Felin("Jean Michel", "roux", 103);
        felin.crier();
        chien.demanderDesCaresses();
        chat.demanderDesCaresses();
        chat.demanderCroquettes();

        System.out.println(chat.getPelage());
        System.out.println(Animal.getCount());
        // le même nombre car incrément uniquement sur animal
        // il faudrait créer un nouvel attribut static dans chat pour avoir le nombre de
        // chats;
        System.out.println(Chat.getCount());
        chat.switchPelage();

        /*
         * Pas accès aux attributs et méthodes ne venant pas de la classe animal comme
         * demanderCaresses, par exemple; utilité :
         */
        Animal cat1 = new Chat();
        Animal felin1 = new Felin();

        System.out.println(cat1.getPelage());
        System.out.println(felin1.getPelage());
        cat1.crier();

        List<Animal> mes_animaux = new ArrayList<>();
        mes_animaux.add(felin1);
        mes_animaux.add(cat1);
        // le chien sera casté en animal donc n'aura pas accès aux méthodes/attributs de
        // chien, seulement d'animal
        mes_animaux.add(chien);

        // fonctionne également pour les interfaces :

        estDomestique chien2 = new Chien();
        estDomestique chat2 = new Chat();
        // estDomestique felin2 = new Felin(); ici, ne fonctionnera pas car n'est pas
        // implémenter dans felin
        chien2.demanderDesCaresses();
        chat2.jouerALaBalle();
        
        // mes_animaux.add(chien2); => n'est pas un Animal
        
        /*
         * C'est le typage qui définit son type et non pas le constructor used;
         * les objets = instances de leur classe, mais aussi des classes et interfaces dont ils héritent
         * */
        
        // Chien chien = new Chien();
        System.out.println("Chien est un animal ? " + (chien instanceof Animal));
        System.out.println("Chien est un chien ? " + (chien instanceof Chien));
        System.out.println("Chien est domestique ? " + (chien instanceof estDomestique));
        
        System.out.println("------------------------");
        
        // estDomestique chien2 = new Chien();
        // même si le type est domestique, il reste une instance de Animal
        System.out.println("Chien est un animal ? " + (chien instanceof Animal));
        System.out.println("Chien est un chien ? " + (chien instanceof Chien));
        System.out.println("Chien est domestique ? " + (chien instanceof estDomestique));
    }

}
