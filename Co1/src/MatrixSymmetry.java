import java.util.Scanner;

public class MatrixSymmetry {
	public static void main(String[] args) {
		int x=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows in  matrix");
		int row=scan.nextInt();
		System.out.println("Enter the number of columns in matrix");
		int col=scan.nextInt();
		if(row!=col) {
			System.out.println("Cannot find Symmetry for this matrix");
		}
		else {
			int[][] a=new int[10][10];
			System.out.println("Enter the values of matrix");
			{
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						a[i][j]=scan.nextInt();
					}
				}
			}
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(a[i][j]!=a[j][i]) {
						x=x+1;
						break;
					}
					if(x>0) {
						break;
					}
					
				}
			}
			if(x==0) {
				System.out.println("It is  a Symmatric Matrix");
			}
			else {
				System.out.println("It is not a Symmatric Matrix");

			}
		}
	}

}
