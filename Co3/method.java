import java.util.Scanner;

class person
{
	String name;
	String gender;
	String address;
	int age;
	
	public person()
	{
		System.out.println("enter name:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		
		System.out.println("enter gender:");
		gender=sc.next();
		
		System.out.println("enter address:");
		address=sc.next();
		
		System.out.println("enter age:");
		age=sc.nextInt();
	}
}
	
class employee2 extends person
	{
		int emp_id;
		String com_name;
		String qual;
		double salary;
		
		public employee2()
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter employee id:");
			emp_id=sc1.nextInt();
			
			System.out.println("enter company name:");
			com_name=sc1.next();
			
			System.out.println("enter qualification:");
			qual=sc1.next();
			
			System.out.println("enter salary:");
			salary=sc1.nextDouble();
		}
	}
class teacher1 extends employee2
{
	String sub;
	String dept;
	int id;
	
	public teacher1()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("enter teacher id:");
		id=sc3.nextInt();
		
		System.out.println("enter teaching subject:");
		sub=sc3.next();
		
		System.out.println("enter department");
		dept=sc3.next();
		
		
	}
	void display()
	{
		System.out.println(" Name:"+name);
		System.out.println("gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("age:"+age);
		System.out.println("employee id:"+emp_id);
		System.out.println("company name:"+com_name);
		System.out.println("Qualification:"+qual);
		System.out.println("Salary:"+salary);
		System.out.println("teacher id:"+id);
		System.out.println("Teaching Subject:"+sub);
		System.out.println("Department:"+dept);
		System.out.println("\n\n");
		
	}
}

public class method {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of teachers  :");
		Scanner sc2=new Scanner(System.in);
	    n=sc2.nextInt();
	    teacher1 t[]=new teacher1[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of employee"+(i+1));
			t[i]=new teacher1();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Displaying Details of employee"+(i+1));
			t[i].display();
		}
		
		


	}

}
