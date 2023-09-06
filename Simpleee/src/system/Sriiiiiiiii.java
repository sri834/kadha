package system;
import java.util.Scanner;



public class Sriiiiiiiii {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.print(" Enter Text : ");
	String str=obj.nextLine();
	char ch;
	String rs="";
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		rs=ch+rs;
		
		
	}
	System.out.println("Reversed text : "+rs);
	
	
	
	
	}

}
