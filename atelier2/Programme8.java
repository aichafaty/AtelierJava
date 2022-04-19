package atelier2;

import java.util.Scanner;

// Tâche 8:                        
// Ecrire un programme (fichier nommé Programme8.java)
//  java qui demande la saisie d’un entier puis affiche 
//  tous entiers entre 1 et la valeur saisie (1 et valeur saisie compris)


public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("entrer un entier");
        int n=scanner.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i);

        }

    }
    
}
