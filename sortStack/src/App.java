import java.util.Stack;

import javax.naming.ldap.SortControl;
import javax.swing.tree.TreeNode;

//sort a stack using another stack and no other data structure. 

//I suppose a variable vounts?
public class App {
    public static void main(String[] args) throws Exception {
      
        //an unsorted stack 

    Stack unsortedStack = new Stack<Integer>();
        unsortedStack.push(3);
        unsortedStack.push(9);
        unsortedStack.push(4);
        unsortedStack.push(1);
        unsortedStack.push(4);

        sort(unsortedStack);

    }

    private static void sort(Stack unsortedStack) {
        Stack stack2 = new Stack<Integer>();
        //stack2 will hold the sorted stack
        while(!unsortedStack.isEmpty()){
            Integer temp =  (Integer) unsortedStack.pop();

            
        }

    }
}
