import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<String>();   
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements you want to insert:");
		int n=sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i =0;i<n;i++)
		{
			String obj=sc.next();
			deque.add(obj);
	 
		}
	   
	    // Popping the element  
	    deque.pop();  
	    System.out.println("After popping : ");  
	    for (String string : deque) {  
	        System.out.println(string);  
	    }  
	    deque.remove("bob");  
	    System.out.println("Final Queue "+deque);

	}

}
