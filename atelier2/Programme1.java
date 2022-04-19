package atelier2;
// Tâche 1:    
// Écrire un programme (fichier nommé Programme1.java) 
// java qui fait la somme de 2 nombres entiers saisis au clavier.

import java.util.Scanner;

public class Programme1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            
        System.out.println("entrer le nombre a:");
         int a =scanner.nextInt();
         System.out.println("entrer le nombre b:");
         int b=scanner.nextInt();
            int s =a + b;
         System.out.println("la somme est :"+  s);
    }
}