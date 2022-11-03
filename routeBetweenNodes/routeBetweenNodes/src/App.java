import java.util.ArrayList;



//given a graph, determine if there is a route between two nodes

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // first lets create a directed graph

        // a map would be represented as a collection of nodes. Each node points to a
        // next node.
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node g = new Node("g");

        //
        a.putChildren(b);
        a.putChildren(c);
        b.putChildren(e);
        d.putChildren(e);
        d.putChildren(a);
        e.putChildren(g);
        g.putChildren(d);

        Node[] memberNodes = { a, b, c, d, e, g };

        // we now have a graph with six members
        Graph graph = new Graph(memberNodes);

        // i need to know if there is a path between certain nodes

        boolean solution = routesBetween(graph, a, c);

        System.out.println(solution);

    }

    private static boolean routesBetween(Graph graph, Node start, Node end) {
        if (start == end){
            return true;
        }

        boolean solution = false;
        // graph is an array of nodes
        // we created a method in class graph to get the value of a node in the array
        // System.out.println(graph.getValue(0)); // prints a

        // we need to find the start node in the graph. so must iterate through the
        // graph until we find the start node

        for (int i = 0; i <= graph.numberOfMembers() - 1; i++) {

            // System.out.println(graph.getValue(i).toUpperCase() + " Node");
            // graph.getNode(i).printChildren(); /// get node is a graph function that returns memeber at a location of
                                             
            //Find the start node.
            
            if (graph.getValue(i) == start.name) {
                graph.getNode(i).visited = true; 

                //check the children of the start node. 
                ArrayList<Node> childrenOfNodeI = graph.getNode(i).children;
                
                //is the end node in the arraylist?  return true if it is
                if(childrenOfNodeI.contains(end)){
                    return true; 
                }else{   //if it is not check the children of the nodes in the arrayList
                    childrenOfNodeI.forEach( entry ->{    //entry is a node
                            //set the every node in this list as visited
                            entry.visited = true;
                    }); 
                }
               


             }
        }

        return solution;
    }

}
