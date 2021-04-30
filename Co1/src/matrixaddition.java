import java.util.Scanner;

public class matrixaddition {
	int row,col;
	public static void main(String[] args) {
		matrixaddition matrix1=new matrixaddition();
		matrixaddition matrix2=new matrixaddition();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows in first matrix");
		matrix1.row=scan.nextInt();
		System.out.println("Enter the number of columns in first matrix");
		matrix1.col=scan.nextInt();
		System.out.println("Enter the number of rows in Second matrix");
		matrix2.row=scan.nextInt();
		System.out.println("Enter the number of columns in Second matrix");
		matrix2.col=scan.nextInt();
		if(matrix1.row!=matrix2.row || matrix1.col!=matrix2.col) {
			System.out.println("Cannot Perform Addition of Matrix");
		}
		else {
			int[][] a=new int[10][10];
			int[][] b=new int[10][10];
			int[][] c=new int[10][10];
			System.out.println("Enter the values of first matrix");
			{
				for(int i=0;i<matrix1.row;i++) {
					for(int j=0;j<matrix1.col;j++) {
						a[i][j]=scan.nextInt();
					}
				}
			}
			System.out.println("Enter the values of Second matrix");
			{
				for(int i=0;i<matrix2.row;i++) {
					for(int j=0;j<matrix2.col;j++) {
						b[i][j]=scan.nextInt();
					}
				}
			}
			System.out.println("The sum of two matrices");
			{
				for(int i=0;i<matrix1.row;i++) {
					for(int j=0;j<matrix1.col;j++) {
						c[i][j]=a[i][j]+b[i][j];
					}
				}
				for(int i=0;i<matrix1.row;i++) {
					for(int j=0;j<matrix1.col;j++) {
						System.out.print(c[i][j]+" ");
					}
					System.out.println("");
				}
			}
		}

	}

}
