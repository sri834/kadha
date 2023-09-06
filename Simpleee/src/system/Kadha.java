package system;
import java.io.File;
import java.io.IOException;
public class Kadha{
	
	public static void main(String[] args) {
		try {
			File obj=new File("C:\newfolder\simple.txt");
			obj.createNewFile();
			System.out.println("File created:"+ obj.getName());
		}catch(IOException e) {
			System.out.println("File not created");
		}
	  
	}

}
