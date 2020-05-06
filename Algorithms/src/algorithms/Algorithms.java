/*
Jonas May 5 
Distributes the balance into least number of alien coins
 */
package algorithms;

/**
 *
 * @author jtmat
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int drobzitTot;
        int clickwickTot;
        int gazoontightTot;
        int frazointTot;
        int blointointTot;
        int vrobitsTot;
        int balance;
        
        final int drobzit = 100000;
        final int clickwick = 50000;
        final int gazoontight = 10000;       
        final int frazopoint = 1000;
        final int blointoint = 500;
        
        balance = 542854;
        
        drobzitTot= (balance%drobzit);
        clickwickTot = (balance%drobzit)/clickwick;
        gazoontightTot = (balance%clickwick)/gazoontight;
        frazointTot = (balance%gazoontight)/frazopoint;
        blointointTot = (balance%frazopoint)/blointoint;
        vrobitsTot = balance % blointoint;
        
        System.out.println("With a balance of 542854 you would have: " + drobzitTot + " drozit, " + clickwickTot + " clickwick, " + gazoontightTot + " gazoontight, " + blointointTot + " blointoint, and " + vrobitsTot + " vrobits ");
        
        /*1 drobzit coin is equal to 100,000 vrobits
        1 clickwick coin is equal to 50,000 vrobits
        1 gazoontight coin is equal to 10,000 vrobits
        1 frazoint coin is equal to 1,000 vrobits
        1 blointoint coin is equal to 500 vrobits 
        */
    }
    
}
