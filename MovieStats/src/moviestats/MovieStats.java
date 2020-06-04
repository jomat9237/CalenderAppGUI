/*
Takes movies and scores them
Jonas Matulis
May 22
 */
package moviestats;

    import java.io.*;
    import java.util.Scanner;
    import java.util.InputMismatchException;
/**
 *
 * @author jtmat
 */

public class MovieStats {
    private Scanner x;
    
    //mainmenu display
    public static void MainMenu(){
        //THE MAIN MENU OF MY PROGRAM
        System.out.println("Input number for program");
        System.out.println("1. See movies in our data base! ");
        System.out.println("2. Add movie to our system and rate it! ");
    }
    
    //opening the file
    public void openFile(){
        try {
            x = new Scanner(new File("MovieStat.dat"));
        }catch(Exception e){
            System.out.println("File not found");
        }     
    }
    //read file
    public void readFile(){
        while(x.hasNext()){
            String MovieTitle = x.next();
            String MovieYear = x.next();
            String MovieScore = x.next();
            System.out.printf("%s %s %s \n", MovieTitle, MovieYear, MovieScore + "% ");
        }
    }
    //close file
    public void closeFile(){
        x.close();
    }

    //wrting movie to file
    public void writeFile(){
        boolean success = false;
        File dataFile = new File("MovieStat.dat");
        FileWriter out;
	BufferedWriter writeFile;
	Scanner keyedInput = new Scanner(System.in);
	double score;
        int year = 0;
	String name;
	try {
            out = new FileWriter(dataFile,true);
            writeFile = new BufferedWriter(out);
            for (int i = 0; i < 1; i++) {
                System.out.print("Enter movie(dashs as spaces): ");
                name = keyedInput.next();
                System.out.println("Enter year film came out: ");
                year = keyedInput.nextInt();
                System.out.println("that is not a year");
                System.out.print("Enter score: ");
                score = keyedInput.nextInt();
                writeFile.write(name + " ");
                writeFile.write("(" + String.valueOf(year) + ") ");
                writeFile.write(String.valueOf(score));
                writeFile.newLine();
            }  	//write movie, year and score to java
            writeFile.close();
            
            out.close();
            System.out.println("Data written to file.");
            
            
    	} catch (IOException e) {
            System.out.println("Problem writing to file.");
            System.err.println("IOException: " + e.getMessage());
    	}
        
    }


    
    
    public static void main(String[] args) {  
        int input = 0;
        int line;
        
        MovieStats r = new MovieStats();
        Scanner keyedInput = new Scanner (System.in);

        
        while(input<3){
            MainMenu();
            System.out.println("Input: ");
            input = keyedInput.nextInt(); 
            if(input == 2){
                //Add movie to database
                r.writeFile();
            }
            
            else if(input == 1){
                //showing movies in database
                try{
                    System.out.println("");
                    r.openFile();
                    r.readFile();
                    r.closeFile();
                }catch(Exception e){
                    System.out.println("");
                }
                
                //r.newScore();
                
            }
            
        }
    }
    
}
