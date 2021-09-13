
import java.util.*;
  class Employee {
    int empid,salary;                         //datamembers of class Employee initialized
    String name,address;
    Employee()                                                  //default constructor
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee Id");
        empid=s.nextInt();
        System.out.println("Enter Employee Name");
        name=s.next();
        System.out.println("Enter Employee Salary");
        salary=s.nextInt();
        System.out.println("Enter Employee Address");
        address=s.next();      
    }
  }
    class Teacher extends Employee                                  //inheritance of class teacher(Single-level)
    {
        String dept,sub;
        Teacher()                                            //constrcutor of class teacher
        {
             Scanner t=new Scanner(System.in);
             System.out.println("Enter department Name");
             dept=t.next();
             System.out.println("Enter Subject  Name");
             sub=t.next();
        }
        public void display()
	{
		System.out.println("emp id : " + empid);
		System.out.println("name : " + name);
		System.out.println("address: " + address);
		System.out.println("salary : " + salary);
		System.out.println("department : " + dept);
		System.out.println("subject : " + sub);
		
	}

    }

public class inheritance {
    public static void main(String [] args)
	{
		int no;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter no of teachers : ");
		no = r.nextInt();
		Teacher obj[] = new Teacher[no];   
		for(int i=0;i<no;i++)
		{
			obj[i] = new Teacher();
			
		}
		
	    for(int i=0;i<no;i++)
	    {
	    	System.out.println("\nDetails of Employee  No : " + (i+1));
	    	obj[i].display();
	    }
		
	}
}

    
