
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

//given two linked lists merge them into a single sorted linked list
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList listA = new LinkedList<Integer>();
        listA.add(40);
        listA.add(3);
        listA.add(2);
        listA.add(5);

        LinkedList listB = new LinkedList<Integer>();
        listB.add(1);
        listB.add(2);
        listB.add(3);
        listB.add(5);
        listB.add(5);
        listB.add(5);
        
       
        LinkedList combinedList = new LinkedList<Integer>();
        combinedList =  orderAndCombine(listA,listB);
        System.out.println(combinedList);
        

       
}

    private static  LinkedList orderAndCombine(LinkedList<Integer> listA, LinkedList<Integer> listB) {
        LinkedList combinedList = new LinkedList <Integer>();
        
        HashMap map = new HashMap<Integer,Integer>();

        //first iterate throught the first linked and add values to the map
        for (int i : listA) {
          if(map.containsKey(i)){
            //get current value of the key
            int currentValue = (int) map.get(i);

            //update the value 
            map.replace(i, currentValue +1);


          }else{
            map.put(i, 1);
          }
        }

        //Repeat the above step for list B
        for (int i : listB) {
            if(map.containsKey(i)){
              //get current value of the key
              int currentValue = (int) map.get(i);
  
              //update the value 
              map.replace(i, currentValue +1);
  
  
            }else{
              map.put(i, 1);
            }
          }

        System.out.println(map);


    //take the key set of map. For every key, append to cobinedList the value of the key
         Set keySet = map.keySet();

         keySet.forEach( (i) -> {

           //get the value of the key
           int value = (int) map.get( i);
           int counter =0 ;
           while (counter != value ){
                combinedList.add(i);
                counter = counter +1;
           }
           counter = 0;

         });

        
    
        


        
        
        return combinedList;
    }

}
