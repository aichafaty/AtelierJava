package Atelier4;

import java.util.Date;
import java.util.Scanner;

// Tâche 2:

// Une personne se caractérise dans notre contexte par un matricule, son nom,
// prénom, adresse, date de naissance, lieu de naissance et son numéro de téléphone. 
// Ecrire un sous-programme qui permet la saisie des informations d’une personne donnée
// Ecrire un sous-programme qui permet d’afficher les informations d’une personne saisie
// Choisissez un nom pour le programme.


public class Personne {
    private String matricule;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateNaiss;
    private String lieuxNaiss;
    private String telephone;

public Personne(String matricule, String nom, String prenom,String adresse,String dateNaiss,String lieuxNaiss,String telephone){
    this.matricule=matricule;
    this.nom=nom;
    this.adresse=adresse;
    this.prenom=prenom;
    this.lieuxNaiss=lieuxNaiss;
    this.telephone=telephone;
    this.dateNaiss=dateNaiss;
}

public void Affichage(){
    System.out.println("le matricule est:" +matricule);
    System.out.println("son nom est:" +nom);
    System.out.println("son prenom est:" +prenom);
    System.out.println("son adresse:"+adresse);
    System.out.println("son lieux de naissance :" +lieuxNaiss);
    System.out.println("son numero tel est :"+telephone);
    System.out.println("sa date de naissance est:" +dateNaiss);
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Ecrire un sous-programme qui permet d’afficher les informations d’une personne saisie
        System.out.println("Entrer votre matricule");
        String matricule=scanner.nextLine();

        System.out.println("Entrer votre nom");
        String nom=scanner.nextLine();

        System.out.println("Entrer votre prenom");
        String prenom=scanner.nextLine();

        System.out.println("Entrer votre adresse");
        String adresse=scanner.nextLine();

        System.out.println("Entrer votre lieux de naissance");
        String lieuxNaiss=scanner.nextLine();

        System.out.println("Entrer votre  telephone");
        String telephone=scanner.nextLine();


        System.out.println("Entrer votre date naissance");
        String dateNaiss=scanner.nextLine();
        
        Personne P =new Personne(matricule, nom, prenom, adresse, dateNaiss, lieuxNaiss, telephone);
        P.Affichage();

        
    }
   

//insuffisance ce programme permet la saisie et l'affichage d'une seule Personne
   
    
}
