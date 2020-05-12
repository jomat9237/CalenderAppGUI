/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

import java.util.Scanner;

/**
 *
 * @author jtmat
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        int wholeNumberInt;
        double wholeNumberDouble;
        double decimalNumberDouble;
        int decimalNumberInt;
        char characterChar;
        String characterString;
        String nameString;
        char nameChar;
        String wholeNumberString;
        int wholeNumberStringInt;
        String decimalNumberString;
        double decimalNumberStringDouble;
        
        System.out.println("Enter a whole number: ");
        wholeNumberInt = keyedInput.nextInt(); 
        System.out.println("Enter a decimal number: ");
        decimalNumberDouble = keyedInput.nextDouble();
        System.out.println("Enter a character: ");
        characterChar = keyedInput.next().charAt(0);
        System.out.println("Enter a name: ");
        nameString = keyedInput.next();
        System.out.println("Enter a whole number: ");
        wholeNumberString = keyedInput.next();
        System.out.println("Enter a decimal number: ");
        decimalNumberString = keyedInput.next();
        
        wholeNumberDouble = (double)wholeNumberInt;
        decimalNumberInt = (int)decimalNumberDouble;
        characterString = String.valueOf(characterChar);
        nameChar = nameString.charAt(0);
        wholeNumberStringInt = Integer.parseInt(wholeNumberString);
        try{
            decimalNumberStringDouble = Double.parseDouble(decimalNumberString);
        }
        catch(Exception e){
            System.out.println("Reenter decimal number with no letters and a single period");     
            decimalNumberString = keyedInput.next();
            decimalNumberStringDouble = Double.parseDouble(decimalNumberString);
        }
        
        
        System.out.println(decimalNumberStringDouble +" "+wholeNumberStringInt+" "+nameChar + " " + characterString+ " " +  decimalNumberInt + " "+ wholeNumberDouble );
        
        
        
        /*
        a whole number and stores it as an integer
        a decimal number and stores it as a Double
        a single character and stores it as a char
        a name and stores it as a String
        a whole number and stores it as a String
        a decimal number and stores it as a String
        The program should then, with appropriate titles,

        convert the whole number integer into a double and output it.
        convert the decimal number Double into an integer and output it.
        convert the single character into a String and output it.
        convert the first character of the name into a char and output it.
        convert the whole number String into an integer and output it.
        convert the decimal number String into a Double and output it.
        */
    }
    
}
