/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        int [ ] RandomNums = new int [10];
        int max = 0;
        int min = 100;
        
        for(int i = 1; i<10 ; i++){
            RandomNums[i]=(int)Math.round(Math.random()*99+1);
            System.out.println(RandomNums[i]);
            if(RandomNums[i]>max){
                max = RandomNums[i];
            }
            if(RandomNums[i]<min){
                min = RandomNums[i];
            }
                
        }
        
        System.out.println("The max value was " + max);
        System.out.println("The min value was " + min);
        
    }
    
}
