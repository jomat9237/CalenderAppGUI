/*
Takes movies and scores them
Jonas Matulis
May 22
 */
package moviestats;

    import java.io.*;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */

public class MovieStats {
    private Scanner x;
    
    public static void MainMenu(){
        //THE MAIN MENU OF MY PROGRAM
        System.out.println("Input number for program");
        System.out.println("1. Rate movies! ");
        System.out.println("2. Add movie to our system!");
    }
    
    
    public void openFile(){
        try {
            x = new Scanner(new File("MovieStat.dat"));
        }catch(Exception e){
            System.out.println("File not found");
        }     
    }
    
    public void readFile(){
        while(x.hasNext()){
            String MovieTitle = x.next();
            String MovieYear = x.next();
            String MovieScore = x.next();
            System.out.printf("%s %s %s \n", MovieTitle, MovieYear, MovieScore + "% ");
        }
    }
    
    public void Array(){
        int movieTotal = 16;
        int i = 0;
        String [] Movies = new String [movieTotal];
        while(x.hasNext()){
            i++;
            String MovieTitle = x.next();
            String MovieYear = x.next();
            String MovieScore = x.next();
            Movies[i] = MovieTitle;
        }
        System.out.println(movieTotal);
        //System.out.println(Movies[line]); 
    }
    
    
    public static String[] readArray(String MoviesStats){
        int j = 0;
        try{
            Scanner s1 = new Scanner(new File("MovieStats.dat"));
            while(s1.hasNextLine()){
                j++;
            }
            String [] Movie = new String[j];
            Scanner s2 = new Scanner(new File("MovieStats.dat"));
            for(int i = 0; i < j; i++){
                Movie[i] = s2.next();
            }
            
        }catch(FileNotFoundException e){
            
        }
        
        return null;
    }
    public void closeFile(){
        x.close();
    }
    
    public void newScore(){
        File dataFile = new File("MovieStat.dat");
        FileWriter out;
	BufferedWriter writeFile;
	Scanner keyedInput = new Scanner(System.in);
        int score;
	try {
            out = new FileWriter(dataFile,true);
            writeFile = new BufferedWriter(out);
            score = keyedInput.nextInt();
            writeFile.write(String.valueOf(score));	
            writeFile.close();
            out.close();
            System.out.println("Data written to file.");
    	} catch (IOException e) {
            System.out.println("Problem writing to file.");
            System.err.println("IOException: " + e.getMessage());
    	}
    }
    
    public void writeFile(){
        File dataFile = new File("MovieStat.dat");
        FileWriter out;
	BufferedWriter writeFile;
	Scanner keyedInput = new Scanner(System.in);
	double score;
	String name;
	try {
            out = new FileWriter(dataFile,true);
            writeFile = new BufferedWriter(out);
            for (int i = 0; i < 1; i++) {
                System.out.print("Enter movie: ");
                name = keyedInput.next();
                System.out.print("Enter score: ");
                score = keyedInput.nextInt();
                writeFile.write(name + " ");
                writeFile.write(String.valueOf(score));
                writeFile.newLine();
            }  	
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
        
	MainMenu();
        
        
        while(input<3){
            System.out.println("Input: ");
            input = keyedInput.nextInt(); 
            if(input == 2){
                r.writeFile();
            }
            
            else if(input == 1){
                try{
                    System.out.println("");
                    r.openFile();
                    r.readFile();
                    System.out.println("Choose movie to rate");
                    line = keyedInput.nextInt();
                    String [] Movie = readArray("MovieStats.dat");
                    System.out.println(Movie[line] + "HI");
                    r.closeFile();
                }catch(Exception e){
                    System.out.println("");
                }
                
                //r.newScore();
                
            }
            
        }
    }
    
}
