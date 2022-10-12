import java.lang.reflect.Method;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
       String romanNumeral = "III";

       HashMap<String, Integer> romanNumValues = new HashMap<String, Integer>();
       romanNumValues.put("I", 1);
       romanNumValues.put("V", 5);
       romanNumValues.put("X", 10);
       romanNumValues.put("L", 50);
       romanNumValues.put("C", 100);
       romanNumValues.put("D", 500);
       romanNumValues.put("M", 1000);
       romanNumValues.put("IV",4);
       romanNumValues.put("IX",9);
       romanNumValues.put("XL",40);
       romanNumValues.put("XC",90);
       romanNumValues.put("CM",900);
       romanNumValues.put("CD",400);

       System.out.println(toInt(romanNumeral, romanNumValues));


    }

    public static int toInt(String str, HashMap<String, Integer> dataMap){
                
      //moving backwwards  grab the last two chracters
     
      



        return sum;
    }
}
