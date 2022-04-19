package Atelier3;
// Tâche 3:    
// Ecrire un programme (fichier nommé BoucleDoWhile.java) 
// java qui affiche 1 2 3 4 5 dans l’ordre

import java.util.Scanner;

public class BoucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=1;
        do{
            for(i=1;i<=5;i++)
            {
                System.out.println(i);
            }
           
        }while(i==5);
    }
    
}
