import java.util.Stack;

// a number is palindrom is it is the same backwards 

public class App {
    public static void main(String[] args) throws Exception {
       int number = 121;
      

    
       System.out.println(reverse(number));

       
    }

    
    private static boolean reverse(int number) {
        //conver to a string.
        String numberStr = String.valueOf(number);
        String reversed="";
        Stack strStack = new Stack<Character>();
        //traverse numberStr and reverse each char
        for(int i =0; i<= numberStr.length() -1 ;i++){
           strStack.push(numberStr.charAt(i));
           
           
        }
        
        int stackSize= strStack.size();

        for (int i=1; i<= stackSize ; i++){
            reversed = reversed + strStack.pop();
        }
      
        
        if(numberStr.equals(reversed.toString())){
            return true;
        }else{
            return false;

        } 

     

    

    }
}
