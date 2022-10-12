import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

//return the kth to last element of a list 

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList<String>();

        list.add("Bob");
        list.add("Sussy");
        list.add("Megan");
        list.add("Mark");

        //first parameter is the kth to last value 
        //second parameter is the list 
        returnKthtoLast(2,list);
        
    }

    private static void returnKthtoLast(int i, LinkedList list) {
        
        int size = list.size();
        if(i>size){
            System.out.println("Out of bounds");
            return;
        }
        System.out.println(list.get(size - i));
        return;
    }
}
