import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList<Integer>();

        list.add(5);
        list.add(1);
        list.add(10);
        list.add(7);
        list.add(10);
        list.add(7);
        list.add(3);




        System.out.println(list);

        removeDups(list);
    }

    /**
     * @param list
     */
    private static void removeDups(LinkedList <Integer> list) {

         HashMap map = new HashMap<Integer,Boolean>();

        //iterate through the linked List
        for (Integer num : list) {
            //check if each num is in the map
            if(!map.containsKey(num)){
                map.put(num, true);
            } 
           
        }

        System.out.println(map.keySet()+ "The maps");
    }
}
