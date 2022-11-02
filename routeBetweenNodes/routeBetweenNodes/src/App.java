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
        d.putChildren(d);
        d.putChildren(a);
        e.putChildren(g);

        Node[] memberNodes = { a, b, c, d, e, g };

        // we now have a graph with six members
        Graph graph = new Graph(memberNodes);

        // i need to know if there is a path between certain nodes

        boolean solution = routesBetween(graph, a, g);

        System.out.println(solution);

    }

    private static boolean routesBetween(Graph graph, Node start, Node end) {
        // graph is an array of nodes
        // therefore should be able to get the value of graph index 1

        // we created a method in class graph to get the value of the node in the array
        // it contains.

        // System.out.println(graph.getValue(0)); // prints a

        // we need to find the start node in the graph. so must iterate through the
        // graph until we find the start node

        for (int i = 0; i <= graph.numberOfMembers() - 1; i++) {

            System.out.println(graph.getValue(i).toUpperCase() + " Node");
            graph.getNode(i).printChildren(); /// get node is a graph function that returns memeber at a location of
                                              /// type node. This node has an arrayList in Children

            // if (graph.getValue(i) == start.name) {
            // // once we find the start node , check what it points to untill it is null,
            // if
            // // null is achieved return false , else return true
            // // each node contains an array list. see if the list contains node end. if it
            // // does not checck the next level, meaning the children of the nodes on the
            // // list.
            // }
        }

        return false;
    }

}
