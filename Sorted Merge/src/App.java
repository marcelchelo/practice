import java.io.Console;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Integer [] arrA = {1, 3, 5, 6, 10, null, null, null, null, null};
        Integer [] arrB = {2, 4, 7, 8, 9};

        //insert B into A and sort

        for (Integer intB : arrB) {
            if (intB == null) {
                break;
            }
            for (int i = 0; i < arrA.length; i++) {
                if (arrA[i] == null) {
                    arrA[i] = intB;
                    break;
                }
            }
        }

    System.out.println(Arrays.toString(arrA));

    Arrays.sort(arrA);
    System.out.println(Arrays.toString(arrA));

    }
}
