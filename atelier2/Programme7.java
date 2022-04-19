package atelier2;

import java.util.Scanner;

// Tâche 7:                        
// Ecrire un programme (fichier nommé Programme7.java) 
// java qui demande la saisie d’un entier puis détermine si
//  l’entier saisi est positif, négatif ou nul


public class Programme7 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("veiller entrer un  nombre");
        int nombre=scanner.nextInt();

        if(nombre>0){
            System.out.println("le nombre saisi est positif");

        }else if(nombre<0){
            System.out.println("le nombre saisie est negatif");
        }else{
            System.out.println("le nombre saisie est nul");
        }
    }
   

    
}
