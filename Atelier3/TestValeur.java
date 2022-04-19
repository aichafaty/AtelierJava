package Atelier3;

import java.util.Scanner;

// Tâche 1:    
// Ecrire un programme (fichier nommé TestValeur.java) 
// java qui fait la somme de 2 nombres entiers puis affiche la plus grande valeur


public class TestValeur {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("veillez entrer s1");
        int s1 =scanner.nextInt();

        System.out.println("veillez entrer s2");
        int s2 =scanner.nextInt();

        int S1=s1+s2;
        System.out.println("la somme de S1 est:" +S1);

        System.out.println("veillez entrer s3");
        int s3 =scanner.nextInt();

        System.out.println("veillez entrer s4");
        int s4 =scanner.nextInt();

        int S2=s3+s4;

        System.out.println("la somme de S2 est:" +S2);

        if(S1>S2){
            System.out.println("S1 est le plus grande valeur");
        }else{
            System.out.println("S2 est le plus grande valeur");
        }


    }
    
}
