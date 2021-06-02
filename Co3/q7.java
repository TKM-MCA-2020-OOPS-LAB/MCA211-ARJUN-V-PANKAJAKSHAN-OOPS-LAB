package opsproj;
import java.util.*;
import java.time.*;

interface calBill
{
	public void calc();
	
}

class calculate implements calBill
{
	int id,qnt,up,tot,on,date;
	String name;
	public void inform()
	{
		Scanner inf = new Scanner(System.in);
		
		System.out.println("Enter Product ID : ");
		id = inf.nextInt();
		System.out.println("Enter Name : ");
		name = inf.next();
		System.out.println("Enter Quantity : ");
		qnt = inf.nextInt();
		System.out.println("Unit Price : ");
		up = inf.nextInt();
		
	}
	
	public void orderdetails()
	{
		Scanner ord = new Scanner(System.in);
		System.out.println("Enter Order No : ");
		on = ord.nextInt();
	}
	
	public void calc()
	{
		tot = qnt * up;
		System.out.println("   "+id+"\t\t "+name+"\t   "+qnt+"\t\t    "+up+"\t         "+tot);
		
		
	}
	
	void display()
	{
		System.out.println("Order No : " + on);
		LocalDate obj = LocalDate.now();
		System.out.print("\n");
		System.out.println("Date : " + obj);
		System.out.print("\n");
		System.out.println("Product Id\tName\tQuantity\tunit price\tTotal");
		System.out.print("_______________________________________________________________________");
		System.out.print("\n");
		
	}

}

public class Q7BILL
{
  public static void main(String[] args)
  {
	  int no,net = 0;
	  
	  Scanner inp3 = new Scanner(System.in);
	  System.out.println("Enter no of products : ");
	  no = inp3.nextInt();
	  calculate or = new calculate();
	  
	  calculate obj[] = new calculate[no];
	  
	  or.orderdetails();
	  
	  for(int i=0;i<no;i++)
	  {
		  System.out.print("\n");
		  System.out.println("Enter Details of product "+ (i+1));
		System.out.println("==========================");

		  obj[i] = new calculate();
		  obj[i].inform();
		  
	  }
	  
	  
	  or.display();
	  
	  for(int i=0;i<no;i++)
	  {
		  obj[i].calc();
		  net = net + obj[i].tot;
	  }
	  
	  System.out.println("_______________________________________________________________________");
	  System.out.println("    "+"\t\t  "+"\t    "+"\t\tNet amount :"+"\t "+net);
		  
	  
  }
}