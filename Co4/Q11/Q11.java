import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		LinkedList<String> num = new LinkedList<>();

	    // add elements in LinkedList
	    num.add("one");
	    num.add("two");
	    num.add("three");
	    num.add("four");
	    num.add("five");
	    System.out.println("linked list: " + num);

	    // remove all the elements
	    num.clear();
	    System.out.println("Linked list after clear(): " + num);

	}

}
