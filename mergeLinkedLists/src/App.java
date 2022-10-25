import java.util.HashMap;
import java.util.LinkedList;

//given two linked lists merge them into a single sorted linked list
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList listA = new LinkedList<>();
        listA.add(1);
        listA.add(3);
        listA.add(7);

        LinkedList listB = new LinkedList<>();
        listB.add(1);
        listB.add(2);
        
        LinkedList sorted = new LinkedList<>();

        sorted = sort(listA, listB);
}

    private static LinkedList sort(LinkedList listA, LinkedList listB) {
        LinkedList sortedList = new LinkedList<>();
        HashMap map = new HashMap<Integer,Integer>();

        for(int i = 0 ; i<listA.size() ; i++){
            if(map.containsKey(listA.get(i))){
                Integer currentValue =  (Integer) map.get(listA.get(i));
                map.replace( listA.get(i) , currentValue + 1);
            }else{
                map.put(listA.get(i), 1);
            }
        }


        return sortedList;
    }
}
