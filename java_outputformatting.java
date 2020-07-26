package javapractice;
import java.util.*;
import java.math.*;
public class java_outputformatting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = new String();
		int a;
		a = input.nextInt();
		str = input.next();
		
		System.out.printf("%-15s%03d", str,a);

	}

}
