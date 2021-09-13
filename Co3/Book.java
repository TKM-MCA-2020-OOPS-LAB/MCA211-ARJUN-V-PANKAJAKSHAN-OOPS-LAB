import java.util.*;


class Publisher
{ 
	String pub;
	public Publisher()
	{
	Scanner a = new Scanner(System.in);
	System.out.println("enter the pubisher Name");
	pub = a.nextLine();
	}
	
}
class tbook extends Publisher{
	String bookid,name;
	public tbook() {
		Scanner n = new Scanner(System.in);
	    System.out.println("enter the name of the book");
		name = n.nextLine();

		System.out.println("enter the id");
		bookid = n.nextLine();

	}

}
class literature extends  tbook
{
	 String genres;
	   String discription;
	   int yop;
	   String author;
	   Scanner lit = new Scanner(System.in);
	   public  void literature()
	   {
	   System.out.println("Enter the genres");
	   genres = lit.nextLine();
	   System.out.println("Enter author");
	   author = lit.nextLine();
	   System.out.println("year of publication");
	   yop = lit.nextInt();
	   }
	   public void display()
	   {
	  System.out.println("DETAILS");
	  System.out.println("The name of publisher:"+pub);
	  System.out.println("The name of book:"+name);
	  System.out.println("Author of book:"+author);
	  System.out.println("year of publication:"+yop);
	  System.out.println("Book id:"+bookid);
	  System.out.println("genres:"+genres);
	   } 
}
class fiction extends literature{
	 String genres2,author2;
	   int yop2;
	   Scanner fic = new Scanner(System.in);
	   public  void fiction()
	   {
	   System.out.println("enter the type");
	   genres2 = fic.next();
	   System.out.println("enter the author");
	   author2 = fic.next();
	   System.out.println("year of publicaton");
	   yop2 = fic.nextInt();
	   }
	   public void display()
	   {
		   System.out.println("DETAILS");
			  System.out.println("The name of publisher:"+pub);
			  System.out.println("The name of book:"+name);
			  System.out.println("Author of book:"+author2);
			  System.out.println("year of publication:"+yop2);
			  System.out.println("Book id:"+bookid);
			  System.out.println("genres:"+genres2);
			   } 
	}
public class Book{
	public static void main(String[] args) {
		System.out.println("Choices");
		System.out.println("1.literature.");
		  System.out.println("2.fiction.");
		  System.out.println("Enter the choice:");
		  Scanner ch =new Scanner(System.in);
		  int choice=ch.nextInt();
		  switch(choice)
		  {
		      case 1: 
		      literature l1=new literature();
		      l1.literature();
		      l1.display();
		      break;
		      case 2: 
		      fiction f1=new fiction();
		      f1.fiction();
		      f1.display();
		      break;
		      default:
		      System.out.println("invalid choice");
		      break;      
		  }
		

	}
	
}
