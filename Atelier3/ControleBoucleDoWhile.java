package Atelier3;
// Tâche 4:
// Écrire un programme (fichier nommé ControleBoucleDoWhile.java) 
// java qui demande la saisie d’un nombre positif.
// Utiliser la boucle do..while pour faire le contrôle.

import java.util.Scanner;

public class ControleBoucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n ;

            do{
                System.out.println("entrer un nombre positif ");
                    n = scanner.nextInt();
                        if(n<0){
                            System.out.println("le nombre saisie est negatif veuillez saisir in nombre positif:" +n);
                        }
            }while(n<0);

            System.out.println("bravo le nombre saisie est:" +n);
    }
    
}
