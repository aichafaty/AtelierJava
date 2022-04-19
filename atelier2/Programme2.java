package atelier2;

import java.util.Scanner;

// Tâche 2:    
// Ecrire un programme (fichier nommé Programme2.java) 
// java qui fait le produit de 2 nombres entiers saisis au clavier


public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("entrer le nombre n1:");
        int n1 = scanner.nextInt();

        System.out.println("entrer le nombre n2:");
        int n2 = scanner.nextInt();

        int p = n1 * n2;

        System.out.println("le produit des deux nombre est:" + p);


    }
    
}
