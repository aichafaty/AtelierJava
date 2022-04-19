package Atelier4;
// Tâche 1:    
// Écrire un programme (fichier nommé Calcul.java) java avec une méthode main (c’est un sous programme).
// Ajouter ces quatre sous programmes :
// un sous programme qui reçoit en paramètre 2 entiers (a et b) puis effectue puis affiche la somme
// un sous programme qui reçoit en paramètre 2 entiers  (a et b) puis effectue puis affiche la différence
//  un sous programme qui reçoit en paramètre 2 entiers  (a et b) puis effectue puis affiche le quotient si possible
//  un sous programme qui reçoit en paramètre 2 entiers  (a et b) puis effectue puis affiche le produit
// Pour chaque saisie, vous devez effectuer un contrôle de saisie

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        System.out.println("--------------CALCULATRICE------------");
        int choix;
       
          System.out.println("1:somme");
          System.out.println("2:produit");
          System.out.println("3:deduction");
          System.out.println("4:quotient");
          System.out.println("5:Quitter");

          choix=scanner.nextInt();
          
          if(!(choix>=1 ||choix<=4)){
           
          }else{

            System.out.println("entrer la valeur a");
            int a=scanner.nextInt();
           System.out.println("entrer la valeur b ");
           int b=scanner.nextInt();
            switch (choix) {
                case 1:
                     int s=somme(a, b);
                     System.out.println("le produit est :" +s);
                      break;
                case 2:
                    int p =produit(a, b);
                    System.out.println("le produit est :" +p);
                    break;
                case 3:
                    int d =différence(a, b);
                    System.out.println("la différence est :" +d);
                    break;
    
                case 4:
                    int q =quotient(a, b);
                    System.out.println("le quotient est :" +q);
                    break;
                    case 5:
                        System.out.println("Ciao Ciao");
                    break;
                  default:
                    System.out.println("choix indisponible");
                      break;
              }

          }
          
       
          
        
                
    }

    static int somme(int a,int b){
        return a+b;
    }

    static int produit(int a,int b){
        return a*b;
    }
    static int différence(int a,int b){
        return a-b;
    }
    static int quotient(int a,int b){
        return a/b;
    }

}
