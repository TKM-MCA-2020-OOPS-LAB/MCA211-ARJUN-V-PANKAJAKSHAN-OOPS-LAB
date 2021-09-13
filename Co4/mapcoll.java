import java.util.*;

public class mapcoll {


		public static void main(String args[])
	    {
	       
	        Map<Integer, String> hm2= new HashMap<Integer, String>();
	        hm2.put(new Integer(1), "Geeks");
	        hm2.put(new Integer(2), "For");
	        hm2.put(new Integer(3), "Geeks");

		  
	        System.out.println(hm2);
	        hm2.put(new Integer(2), "Arjun");
	        System.out.println(hm2);

	        hm2.remove(new Integer(1));
	        System.out.println(hm2);
	    
	    }
	}