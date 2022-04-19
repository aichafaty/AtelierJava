package Atelier3;
// Tâche 2:    
// Ecrire un programme (fichier nommé BoucleWhile.java)
//  java qui affiche 1 2 3 4 5 dans l’ordre

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
    
}
