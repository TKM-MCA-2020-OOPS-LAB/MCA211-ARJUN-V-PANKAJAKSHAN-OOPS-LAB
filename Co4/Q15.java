import java.util.LinkedHashSet;

public class Q15 {
	public static void main(String[] args) {
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		LHS.add("Abhishek");
		LHS.add("David");
		LHS.add("Charles");
		LHS.add("Sawyer");
		LHS.add("Paul");
		LHS.add("Kevin");
		LHS.add("Kevin");
		LHS.add("Kevin");
		System.out.println("Size of LinkedHashSet = " +LHS.size());  
		System.out.println("The LinkedHashSet is"+LHS);

}
}
