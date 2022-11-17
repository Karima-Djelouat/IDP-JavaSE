package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Correction {

    static List<Integer> clean(List<Integer> grades_dirty) {
        List<Integer> cleaned = new ArrayList<>();
        for(int g : grades_dirty) {
            if(g >= 0 && g <= 20) {
                cleaned.add(g);
            }
        }
        return cleaned;
    }   
    
    static double average(List<Integer> grades) {
        int sum = 0;
        int good_grades = 0;
        for(double grade : grades) {
            sum += grade;
            good_grades++;
        } 
        return sum / good_grades;
    }
    
    static double averageDb(List<Double> grades) {
        int sum = 0;
        int good_grades = 0;
        for(double grade : grades) {
            sum += grade;
            good_grades++;
        } 
        return sum / good_grades;
    }
    

    
    static int mediane(List<Integer> grades) {  
        java.util.Collections.sort(grades);
        if(grades.size() % 2 != 0) { // Impaire
            int index = (int) Math.floor(grades.size() / 2); 
            System.out.println("Index " + index);
            return grades.get(index);
        } else { // paire
            int indexUp = grades.size() /2;
            int indexDown = indexUp - 1;
            return (indexUp + indexDown) / 2;
        }  
    }
 

    public static void main(String[] args) {
  
       List<Integer> grades = new ArrayList<>(Arrays.asList(-1, 0, 2, 15, 18, 20, 25));
       List<Integer> cleaned_grades = clean(grades);
       double moyenne = average(cleaned_grades);
       System.out.println("Moyenne : " + moyenne);
       int mediane = mediane(cleaned_grades);
       System.out.println("Mediane : " + mediane);
       
       
       
       List<List<Integer>> groupe = new ArrayList<>(
               Arrays.asList(
                   new ArrayList<>(Arrays.asList(31, 18, 15, 17)),
                   new ArrayList<>(Arrays.asList(30, 10, 16, 10))
               ));
       groupe.add(new ArrayList<>(Arrays.asList(0, 10, 20)));
       
       
       List<Double> all_moyenne = new ArrayList<>();

       // clean -> array list d'integer
       groupe.forEach(notes -> {
           List<Integer> cleaned = clean(notes);
           double m = average(cleaned);
           double me = mediane(cleaned);
           all_moyenne.add(m);
           System.out.println("Moyenne : " + m + ", Mediane " + me);
           System.out.println("----------------------------");
       });
       System.out.println("Moyenne générale : " + averageDb(all_moyenne));
    }

}
