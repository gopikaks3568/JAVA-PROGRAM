import java.security.Principal;
import java.util.Date;

import javax.swing.plaf.TreeUI;
public class hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        boolean ishuman=true;
        if (ishuman==true) {
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
             }
        int topscore=80;
        if (topscore ==100) {
            System.out.println("You got the high marks");
            
        }
        int secondtopscore=81;
        if ((topscore<=secondtopscore) && topscore<100) {
            System.out.println("greater than second top score and less than 100");
        }
        if ((topscore>90)||(secondtopscore<=90))
            System.out.println("Either or both of the condition are true ");
        
        int newvalue=50;
        if (newvalue ==50){
            System.out.println("This is true");
        }
        boolean isCar=false; 
        if (isCar=true) {
         System.out.println("This is not supposed to happen");   
        }
          
    }
        
    }