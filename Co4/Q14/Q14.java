import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();   
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements  you want to insert:");
		int n=sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i =0;i<n;i++)
		{
			String obj=sc.next();
			deque.add(obj);
	 
		}
	   
	    // Popping the element  
	    System.out.println("The Queue is "+deque);
	    String x=deque.pop();  
	    System.out.println("Popped element is : "+x);  
	    System.out.println("The Queue after popping is "+deque);
	    System.out.println("Enter the element want to insert");
	    String obj=sc.next();
		deque.add(obj);
	    System.out.println("The Queue is "+deque);
	    String y=deque.pop();  
	    System.out.println("Popped element is : "+y);  
	    System.out.println("The Queue after popping is "+deque);
	}

}
