import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		ArrayList<String> obj= new ArrayList<String>();
		obj.add("Anzal");
		obj.add("Aneef");
		obj.add("Asif");
		obj.add("Ameer");
		obj.add("Raees");
		obj.add("Hafiz");
		
		System.out.println("\nDisplaying Arraylist:\n");
		for(String list:obj)
			System.out.println(list);
		
		System.out.println("\nlist after Removing elements:\n");
		obj.remove("Anzal");
		obj.remove(1);
		for(String list:obj)
			System.out.println(list);
		
		System.out.println("\nSort elements:\n");
		Collections.sort(obj);
		for(String list:obj)
			System.out.println(list);
		
		System.out.println("\nGetting object of list which is present at the specified index:\n");
		System.out.println(obj.get(3));
		
		System.out.println("\nIs asif in the list:"+obj.contains("Aneef"));
		
		System.out.println("\nSize of the list:"+obj.size());
		

	    obj.clear();
	      
	    System.out.println("\nArrayList after clear method :"+obj);
		
			

	}

}
