package javapractice;
import java.util.*;
public class chef_findremainder {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int a = input.nextInt();
				int b = input.nextInt();
				System.out.println(a%b);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
