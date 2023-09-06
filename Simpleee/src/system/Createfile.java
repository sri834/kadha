package system;
import java.io.File;
public class Createfile {
	public static void main(String[] args) {
		
			File obj=new File("C:\\newfolder\\simple.txt");
			if(obj.delete()) {
				System.out.println("file deleted " + obj.getName());
			}else {
				System.out.println("file not deleted ");
			}
	  
	}

}
