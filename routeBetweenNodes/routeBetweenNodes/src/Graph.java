
public class Graph {
    // public List <Node> members = new List<Node>() ;

    public Node[] members;

    // constructor
    public Graph(Node[] members) {
        this.members = members;
    }

    // method to print number of members in this graph
    public int numberOfMembers() {
        return members.length;
    }

    public String getValue(int location) {
        return members[location].name;
    }

    public Node getNode(int location) {
        return members[location];
    }

    // public ArrayList<Node> getList(int location) {
    // return members[location].children; // returns a the node, which will contain
    // an arrayList
    // }

}
