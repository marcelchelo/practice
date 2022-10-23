
import java.util.Arrays;
import java.util.LinkedList;


//find max number of diners given a table with people ALREADY DINING and dont bother them 

public class App {
    public static void main(String[] args) throws Exception {
        int[] seats = { 2, 6};
        long solution = getMaxAdditionalDinersCount(10, 1, 2, seats);
        System.out.println(solution);
    }

    private static long getMaxAdditionalDinersCount(long N, long K, int M, int[] seats) {
        int maxNewDiners = 0;
        
        int[] table = new int[(int) N];
 

        //first populate the table 
        populate(table , seats);
        System.out.println(Arrays.toString(table) + " Table with active Diners");

        maxNewDiners = calculateNewDiners(N, K, seats, table);  //K is safety buffer, seats the current diners, table the table array
        
        
      
        

        return maxNewDiners;
    }

    private static void populate(int[] table, int[] seatsAssigned) {
        //for every seat assigned place a 1 in table array 
       
        for (int seat : seatsAssigned) {// this actually give me the content directly . Not the index value, even better.
            //get the value  
            table[seat -1  ] = 1;
        }
    }
    
    private static int calculateNewDiners(long N, long safetyGap, int[] seatsAssigned, int[] table) {
        //conver table to true falce values
        
        
        
        
        return 0;
        //N is number of chairs
        //SafetyGapis gapy between each diner
        //seats assigned is the location of each diner 
        

        }

    }

