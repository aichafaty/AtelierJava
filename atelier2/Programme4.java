package atelier2;

import java.util.Scanner;

// Tâche 4:    
// Ecrire un programme (fichier nommé Programme4.java)
//  java qui fait le quotient de 2 nombres entiers saisis au clavier


public class Programme4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("entrer votre q1");
        float q1 = scanner.nextFloat();

        System.out.println("entrer votre q2");
        float q2= scanner.nextFloat();

        float Q = q1/q2;

       
            System.out.println("le quotient des deux nombres est:" +Q);
       

       



        
        
    }
    
}
