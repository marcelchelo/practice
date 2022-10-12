public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String result = stringCompression("aabxxxXXacddmz");
		System.out.println(result);
    }

  
    private static String stringCompression(String stringInput) {
        String compressedString = "";
        // keeps count of consecutive repetitions
        int counter =0;


            for (int j = 0; j < stringInput.length()   ; j++) {
              counter++;  //bc if there is only one char(non reaating) it is still one/
                if(j+1 >= stringInput.length() || stringInput.charAt(j) != stringInput.charAt(j+1)){
                    compressedString = compressedString +stringInput.charAt(j) + counter;
                    counter=0;
                }
            }
        

        return compressedString;
    }
}
