import java.io.Console;

//given an array [1,2,3,4,5]  = 0

// find the number of rotations 
// ex:   [4,5,1,2,3]   -> 2
// ex : [3,4,5,1,2] -> 3




public class App {
    public static void main(String[] args) throws Exception {
        
        int [] array = {-10,20,35,40,50};

        System.out.println( rotationNum(array));

    }




   
    public static int rotationNum (int[] input){
      
        int solution = 0;
        for (int i = 0; i < input.length -1 ; i++) {
            //compare value value of index i vs value of inde i+1
            //if i+1 >i ->    do nothing, i++

            if(input[i] > input[i+1]){
                solution = i+1;
            }
        }

        return solution;
}
}
