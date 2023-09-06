package system;
import java.util.Scanner;


public class Null {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int c=0,num1=0,num2=1,a=0;
		int n=obj.nextInt();
		while(c<n) {
			a+=num1;
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			c+=1;
			
		}
		System.out.println(a);
		
	}

}
