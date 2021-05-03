import java.util.Scanner;

public class SumofComplexNumbers {
	int x,y;

	public static void main(String[] args) {
		SumofComplexNumbers num1=new SumofComplexNumbers();
		SumofComplexNumbers num2=new SumofComplexNumbers();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Real Part of Real of First complex number");
		num1.x=scan.nextInt();
		System.out.println("Enter the Imaginary Part of Real of First complex number");
		num1.y=scan.nextInt();
		System.out.println("Enter the Real Part of Real of second complex number");
		num2.x=scan.nextInt();
		System.out.println("Enter the Imaginary Part of Real of Second complex number");
		num2.y=scan.nextInt();
		System.out.println("The Sum of two complex numbers "+num1.x+"+"+num1.y+"i"+" and "+num2.x+"+"+num2.y+"i"+"="+(num1.x+num2.x)+"+"+
		(num1.y+num2.y)+"i");
	}

}
