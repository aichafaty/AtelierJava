package atelier2;

import java.util.Scanner;

// Tâche 3:    
// Ecrire un programme (fichier nommé Programme3.java) 
// java qui fait la différence de 2 nombres entiers saisis au clavier


public class Programme3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

         System.out.println("entrer votre nombre n1:");

         int n1=scanner.nextInt();
        
         System.out.println("entrer votre nombre n2:");
         
         int n2=scanner.nextInt();
          
         int d = n1-n2;

         System.out.println("la difference est:" + d);


    }
    
}
