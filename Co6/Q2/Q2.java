import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {
	public static void main(String[] args){
		try {
            FileWriter writer = new FileWriter("/home/arjun/Documents/MCA/java.txt", true);
            writer.write("First\n");
            writer.write("Second\n");  
            writer.write("Third\n");
            writer.close();
            FileReader reader = new FileReader("/home/arjun/Documents/MCA/java.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            System.out.println("File reading and writing both done\n");
            
	} catch (IOException e) {
		System.out.println("Error reading file named java.txt");
        }
 
    }
}
