package co4;

import java.util.LinkedHashSet;

public class HashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> LHS = 
                new LinkedHashSet<String>();
		LHS.add("Abhishek");
		LHS.add("David");
		LHS.add("Charles");
		LHS.add("Sawyer");
		LHS.add("Paul");
		LHS.add("Kevin");
		System.out.println("Size of Orginal LinkedHashSet = " +
                LHS.size());  
		System.out.println("The LinkedHashSet is"+LHS);
		System.out.println("Removing David from the LinkedHashSet "+LHS.remove("David"));
		System.out.println("LinkedHashSet after removing David is"+LHS);
		System.out.println("Trying to remove leo from the list: " +LHS.remove("leo"));
		System.out.println("searching for sergio in LinkedHashSet :"+LHS.contains("sergio"));
		System.out.println("searching for sergio in LinkedHashSet :"+LHS.contains("sergio"));
		System.out.println("Size of LinkedHashSet after updating= " + LHS.size()); 
}
}
