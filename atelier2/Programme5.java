package atelier2;
// Tâche 5:    
// Ecrire un programme (fichier nommé Programme5.java) 
// java qui fait le quotient de 2     nombres entiers saisis au clavier. 
// Fait le contrôle du diviseur qui ne doit pas être nul 

import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("entrer votre q1");
        float q1 = scanner.nextFloat();

        System.out.println("entrer votre q2");
        float q2= scanner.nextFloat();

        float Q = q1/q2;

        if(q2==0){
            System.out.println("imppossible de diviser par 0");
        }else{
            System.out.println("le quotient des deux nombres est:" +Q);
        }

       



        
        
    }
}
