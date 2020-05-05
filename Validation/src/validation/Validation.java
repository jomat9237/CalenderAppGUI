/*
 Jonas - May - Takes your favorite number and outputs it only if it is a number
 */
package validation;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */
public class Validation {

    
    
    
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        int FavNumber;
        
     
       
            System.out.println("Enter Favorite number: ");

            
            try{
                FavNumber = keyedInput.nextInt();
                System.out.println("Your favorite number is: " + FavNumber);
            }
            catch(Exception e){
                System.out.println("That is not a number!"); 
            }  
    }
}
