//is there a route between two nodes


public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       //first lets create a directed graph 

       //a map would be represented as a collection of nodes.   Each node points to a next node.
        
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node g = new Node("g");


       //a children 
       a.putChildren(b);
       a.putChildren(c);
       //b children
       b.putChildren(e);
       d.putChildren(d);
       d.putChildren(a);
       e.putChildren(g);

       Node[] memberNodes = {a,b,c,d,e,g};

       Graph graph = new Graph(memberNodes);
      graph.printMembers();
        

        
 
        //connect the nodes
        

        
   
        
    }


 
}
