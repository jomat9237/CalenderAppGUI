/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */
public class CustomMethods {
    
    public static void mainMenu(){
        System.out.println("1. Square a number");
        System.out.println("2. Find the hypotnus of a triangle");
        System.out.println("3. Find the acceleration");
        System.out.println("4. Find the momentum of an object");
        System.out.println("5. Find how much work has been done");
        System.out.println("6. Exit");
    }
    
    public static void squareAndOut (int base){
        int square;
        square = base*base;   
        System.out.println("The square of the number is:" + square);
    }
    
    public static void pythagAndOut(int a, int b){
        double c;
        c = Math.sqrt((a*a)*(b*b));
        
        System.out.println("The hypotneus of the triangle is: " + c);
    }
    
    public static void impulseAndOut(int mass, int velocity){
        int momentum;
        momentum = mass*velocity;
        System.out.println("The momentum of the object: " + momentum + " kg*m/s");
    }
    
    public static void workAndOut(double force, double displacementW, double angle){
        double work;
        work = (force*displacementW)*Math.cos(angle);
        System.out.println("The work done is: " + Math.round(100.00*work/100.00) + " J");
    }
    
    public static void accelAndOut(int IntialVelocity, int FinalVelocity, int time){
        Scanner keyedInput = new Scanner (System.in);
        int acceleration;
        acceleration = (IntialVelocity - FinalVelocity)/time;
        System.out.println("The acceleration is: " + acceleration + " m/s/s");
    }   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        mainMenu();
        int Input;
        do{
            Input = keyedInput.nextInt();
                if(Input == 1){
                    int base;
                    System.out.println("Enter a base to be squared:");
                    base = keyedInput.nextInt();
                    squareAndOut(base);
                }
                else if(Input == 2){
                    int a, b;
                    System.out.println("Enter the height: ");
                    a = keyedInput.nextInt();
                    System.out.println("Enter the base; ");
                    b = keyedInput.nextInt();
                    pythagAndOut(a,b);
                }
                else if(Input == 3){
                    int IntialVelocity, FinalVelocity, time, acceleration;
                    System.out.println("Enter the intial velocity (m/s):");
                    IntialVelocity = keyedInput.nextInt();
        
                    System.out.println("Enter the final velocity (m/s):");
                    FinalVelocity = keyedInput.nextInt();
        
                    System.out.println("Enter the time (s):");
                    time = keyedInput.nextInt();
                    accelAndOut(FinalVelocity, IntialVelocity, time);
                }
                else if(Input == 4){
                    int mass, velocity;
                    System.out.println("Enter the mass of the object (kg): ");
                    mass = keyedInput.nextInt();
                    
                    System.out.println("Enter the velocity of the object(m/s): ");
                    velocity = keyedInput.nextInt();
                    impulseAndOut(mass, velocity);
                }
                else if(Input == 5){
                    double force, displacement, angle;
                    System.out.println("Enter the force applied on the object(N)");
                    force = keyedInput.nextInt();
                    System.out.println("Enter the displacement of object(M): ");
                    displacement = keyedInput.nextInt();
                    System.out.println("Enter the angle relative to the horizontal of the direction: ");
                    angle = keyedInput.nextInt();
                    workAndOut(force, displacement, angle);
                }
                
                
        }while(Input != 6);
        System.out.println("Program Over");
    
     }
    
}
