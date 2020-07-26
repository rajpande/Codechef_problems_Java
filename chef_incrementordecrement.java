package javapractice;
import java.util.*;
public class chef_incrementordecrement {

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();
	        String s = scan.nextLine();
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
