import java.util.ArrayList;

// each node should store the nodes the point to, in 
public class Node {
    public String name;
    public ArrayList<Node> children = new ArrayList<Node>();

    // constructor
    public Node(String name) {
        this.name = name;
    }

    public void putChildren(Node child) {
        this.children.add(child);
    }

    public void printChildren() {

        this.children.forEach((entry) -> {
            System.out.println(entry.name);
        });

    }

}
