import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
       LinkedList list = new LinkedList<Character>();

       list.add('a');
       list.add("b");
       list.add("d");
       list.add( "c");
       list.add("e");
       
       deleteMiddleNode("c", list);



    }

    private static void deleteMiddleNode(String letra, LinkedList list) {
        int index = list.indexOf(letra);
        System.out.println(index);
    }
}
