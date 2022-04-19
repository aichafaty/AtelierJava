package atelier;
import java.util.Scanner;
public class ExempleVeille{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
           int i=1;
        
           while(i<=5)
            {
                if(i%2 ==0)
                {
                    System.out.println(i+ " est paire");
                }else{
                    System.out.println(i+" est impaire");
                }
                i++;
            }
                
        }
}
