package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrectionCollection {

    public static void main(String[] args) {
        /*
         * Collection : classes permettant de gérer des listes/tableaux
         */

        int[] arr_initial = { 20, 30, 40 };

        Integer[] arr2 = new Integer[ arr_initial.length];

        // ici il s'agit d'une fonction prenant en parameter i et return la valeur
        // arr[i]
        // à chaque boucle, elle retourne la valeur correspondante du tableau :
        Arrays.setAll(arr2, i ->  arr_initial[i]);

        List<Integer> collection = new ArrayList<>();

        List<Integer> notes = new ArrayList<>(Arrays.asList(20, 30, 45, 60));

    }

}
