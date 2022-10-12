import java.io.Console;
import java.util.Arrays;

//given a m * n  matrix,  if there is a zero, convert its correspending row and column to zero's


public class App {
    public static void main(String[] args) throws Exception {
        //a matrix is row firt and then column
        //below is a 4*3 matrix 
        int matrix [][] = {{3, 8,1},  {1,2,4} ,  {5,0,2} , {5,3,5}};
        


        printMatrix(matrix, "The original matrix");

        
        int [] solution  = zeroMatrixSolution(matrix);  //return the row and colum if there is a zero . 

        System.out.println(Arrays.toString(solution) + "Location of zero, rewrite the array and print ");
        //lets do the actual work.


        //store the solution and then print it.
        int[][] zeroMatrix = make0Matrix(matrix, solution);

        printMatrix(zeroMatrix, "The zero matrix");
    }


    private static int[][] make0Matrix(int[][] matrix, int[] solution) {
        //solution: [0] row number [1] column number 
        int rowCount = matrix.length;
        int row = solution[0];
        int column = solution[1];
        //first convert row to zero
        for (int i=0 ; i < matrix.length -1 ; i++){  //it should be the length of the inner array so it goes all the wat through. 
            matrix[row][i] = 0;
        }
       
        //then convert the column to zeros
        //the column'th element of reach row 
        //to reach the column we use a double loop, the first loop iterates the row and the second iterates the columnsl
        for (int i = 0 ; i < rowCount ; i++){
            for(int j =0; j< matrix.length  ; j++){
                if(j == column){
                    matrix[i][j]=0;
                }
                
            }
        }
        return matrix;
    }


    private static int[]  zeroMatrixSolution(int[][] matrix) {
        int[] solution = new int [2];
        int rowNum = matrix.length;  //number of rows

        //look for a zero in each row. 
        for(int i=0; i < rowNum ; i++){
            //create a method to search an array for 0 and return its index value 
            //No the array has a method called includes... NVM that was javascript
            
            Integer column = contains0(matrix[i]);

            if(column != null){   // if we get returned a vlue other than null, we have found a zero!    The number returned is the column location 
                //convert the entire row to zeros, this would be a void method. 

                //maybe in this method we can just return the the column and row
                // yes lets do that and in another method we will print the zero matrix. 
                
                solution[0] = i;
                solution[1] = column;
                return solution;

            }

        }

        return null;
    }


    private static Integer contains0(int[] array) {   //use Integer instead of int for more flexibility :)   it allows us to return null if no 0 is found. 
            Integer index =  null;   //auto
        for(int i=0; i<array.length ; i++){
            if(array[i] == 0){
                
                return i;
                
            }
        }
        return index;
    }


    public static void printMatrix (int matrix[][], String message){
         //first we need to find the size of the array's FIRST dimension,  AKA the row dimension. 
        int rowNum = matrix.length;

         //at every row we must print its contents, do this in a new line per row
        System.out.println(message);
         for(int i = 0 ; i< rowNum   ; i++){
            System.out.println(

              Arrays.toString(matrix[i])   //in java To string prints memorry address, the Attays class to string prints its contents. 
            );   //println prints in a new line. 

        }
    }
}
