package fr.dawan.formation.exercices;

import java.util.Scanner;

public class Exrcice3TableauSimple {
    
    

    public static void main(String[] args) {

        int[] tab = new int[5];

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int moyenne = 0;
        int numbers;
        int arrayLength = 0;

        System.out.println("Entrez 5 notes :");
        for (int i = 0; i < tab.length; i++) {
            numbers = scan.nextInt();
            if (numbers >= 0 && numbers <= 20) {
                tab[i] = numbers;
                sum += numbers;
                arrayLength++;
            } else {
                System.out.println("Entrez des notes valides !");
                break;
            }

        }

        if (arrayLength == tab.length) {
            moyenne = sum / arrayLength;
            System.out.println("La moyenne de ces notes est : " + moyenne);
        } else {
            System.out.println("Relancez le programme, le tableau de notes est incomplet.");
        }

        int middle = arrayLength / 2;
        double mediane = (tab[middle - 1] + tab[middle]) / 2.0;
        System.out.println("La médiane de ces notes est : " + mediane);
    }

}
