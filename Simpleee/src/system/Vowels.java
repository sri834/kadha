package system;
import java.util.Scanner;


public class Vowels {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String s=obj.next();
		char ch;
		String sk="";
		//String str=s.toLowerCase();
	for(int i=0;i<s.length();i++) {
	    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
				||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
			 ch = s.charAt(i);
			 sk+=ch;
			}
	  }
	System.out.println(sk);
	}

}
