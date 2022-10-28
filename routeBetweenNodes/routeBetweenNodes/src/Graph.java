
import java.util.List;

public class Graph {
   //public List <Node> members = new List<Node>() ;

   public Node[] members;

   //constructor
    public Graph(Node[] members) {
        this.members = members;
    }

    public void printMembers(){
        System.out.println(members.length);
    }


    
}
