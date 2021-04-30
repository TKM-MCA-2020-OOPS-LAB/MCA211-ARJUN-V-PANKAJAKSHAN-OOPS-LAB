import java.util.Scanner;

public class product {
	
	int pcode;
	String pname;
	int price;
	public static void main(String[] args) {

		Scanner q=new Scanner(System.in);
		product obj1=new product();
		product obj2=new product();
		product obj3=new product();
		System.out.println("Enter the product Code");
		obj1.pcode=q.nextInt();
		System.out.println("Enter the Product Name");
		q.nextLine();
		obj1.pname=q.nextLine();
		System.out.println("Enter the product Price");
		obj1.price=q.nextInt();
		System.out.println("Enter the product Code");
		obj2.pcode=q.nextInt();
		System.out.println("Enter the Product Name");
		q.nextLine();
		obj2.pname=q.nextLine();
		System.out.println("Enter the product Price");
		obj2.price=q.nextInt();
		System.out.println("Enter the product Code");
		obj3.pcode=q.nextInt();
		System.out.println("Enter the Product Name");
		q.nextLine();
		obj3.pname=q.nextLine();
		System.out.println("Enter the product Price");
		obj3.price=q.nextInt();
		
		if(obj1.price<obj2.price) {
			if(obj1.price<obj3.price) {
				System.out.println(obj1.pname+" has the lower price of "+obj1.price);
			}
			else {
				System.out.println(obj3.pname+" has the lower price of "+obj2.price);

			}
		}
		else if(obj2.price<obj3.price) {
			System.out.println(obj2.pname+" with has the lower price of "+obj2.price);
		}
		else {
			System.out.println(obj3.pname+" with has the lower price of "+obj3.price);

		}
	}
	
}
