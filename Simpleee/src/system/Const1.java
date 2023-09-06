package system;
import java.io.*;

public class Const1 {
	public static void main(String [] args) {
		StringBuffer sb=new StringBuffer("STRING BUFFER");
		sb.append("BUFFER STRING ");
		System.out.println(sb);
		sb.insert(1,"RI");
		System.out.println(sb);
        sb.replace(3,5,"kumar");
		System.out.println(sb);
        sb.delete(5,8);
		System.out.println(sb);
        sb.reverse();
		System.out.println(sb);

	}

}
