import java.util.*;
import java.util.PriorityQueue;
import java.util.Iterator;
public class Q13 {

	public static void main(String[] args) {
		 int n;
	        String str;
	        PriorityQueue<String> pq = new PriorityQueue<String>();
	        System.out.println("Enter the no. of data:");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the data:");
	        for(int i=0;i<n;i++)
	        {
	            str = sc.nextLine();
	            pq.add(str);
	        }
	        Iterator itr = pq.iterator();
	        System.out.println("\nPriority Queue\n");
	        while(itr.hasNext())
	            System.out.println(itr.next()+" ");

	}

}
