import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		 // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        // Use add() method to add elements in the Stack
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        stack.add("E");
  
        // Output the Stack
        System.out.println("Stack: " + stack);
  
        // Remove the element using remove()
        String rem_ele = stack.remove(0);
  
        // Print the removed element
        System.out.println("Removed element: " + rem_ele);
  
        // Print the final Stack
        System.out.println("Final Stack: " + stack);

	}

}
