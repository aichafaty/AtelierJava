package atelier;
import java.util.Scanner;
public class ExempleVeille2{
       public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer votre nom");
            String nom=scanner.next();

            System.out.println("entrer votre age");
            int age=scanner.nextInt();
    
            if( age>18){
                System.out.println("vous etes majeur");
            }else{
                System.out.println("vous etes mineur");
    
            }
    }
}