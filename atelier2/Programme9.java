package atelier2;
// Tâche 9:                        
// Ecrire un programme (fichier nommé Programme9.java) 
// java qui demande la saisie d’un réel, d’un entier 
// et d’une chaine de caractère  puis affiche les valeurs saisies    

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("entrer un reel r");
        float r=scanner.nextFloat();

        System.out.println("entrer un entier n");
        int n=scanner.nextInt();

        System.out.println("entrer une chaine c");
        String c=scanner.next();

        System.out.println("la valeur saisie est :" +r);
        System.out.println("la valeur saisie est :" +n);
        System.out.println("la valeur saisie est :" +c);

    }
}
