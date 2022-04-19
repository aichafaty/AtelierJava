package atelier2;

import java.util.Scanner;

// Tâche 6:                        
// Ecrire un programme (fichier nommé Programme6.java)
//  java qui détermine la moyenne de 5 entiers positif 
//  saisis au clavier    

public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("entrer votre n1");
        int n1=scanner.nextInt();

        System.out.println("entrer votre n2");
        int n2=scanner.nextInt();

        System.out.println("entrer votre n3");
        int n3=scanner.nextInt();

        System.out.println("entrer votre n4");
        int n4=scanner.nextInt();

        System.out.println("entrer votre n5");
        int n5=scanner.nextInt();

        float moyen=(n1+n2+n3+n4+n5)/100;

        System.out.println("la moyenne est:" +moyen);



        
    }
    
}
