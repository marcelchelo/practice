public class App {
    public static void main(String[] args) throws Exception {
        String ogString = "aaabcccaa";

        System.out.println(compressString(ogString));
        
    }

    private static StringBuilder compressString(String ogString) {
        StringBuilder solution = new StringBuilder();
    
        while (ogString.length() > 0) {
            int cutStringAt = 0;
            
            //count number of repetitions,
            for (int i = 0; i < ogString.length(); i++) {
                if (ogString.charAt(i) == ogString.charAt(0)) {
                    cutStringAt++;
                   
                } else {

                    break;
                }
            }
    
            solution.append(ogString.charAt(0)).append(cutStringAt);
            ogString = ogString.substring(cutStringAt);
    
        }
    
        return solution;
    }
    
}
