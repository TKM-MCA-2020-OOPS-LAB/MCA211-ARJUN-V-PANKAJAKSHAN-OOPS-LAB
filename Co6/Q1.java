import java.io.File;

public class Q1 {

	public static void main(String[] args) {

			    File file = new File("/home/arjun/Documents/MCA/OOPS/MCA211-ARJUN-V-PANKAJAKSHAN-OOPS-LAB/Co4");


			    String[] fileList = file.list();

			    for(String str : fileList) {
			      System.out.println(str);
	}

	}
}
