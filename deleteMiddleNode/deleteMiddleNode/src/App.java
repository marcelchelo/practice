import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
       LinkedList list = new LinkedList<Character>();

       list.add('a');
       list.add("b");
       list.add("c");
       list.add( "d");
       list.add("e");
       
       deleteMiddleNode("c", list);

       System.out.println(list);



    }

    private static void deleteMiddleNode(String letra, LinkedList list) {
        int index = list.indexOf(letra);
        
        list.remove(index);
        
    }
}
