package javapractice;
import java.util.*;
public class chef_remissness {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int a = input.nextInt();
				int b = input.nextInt();
				if(a<b){
					System.out.println(a+" "+(a+b));
				}
				System.out.println(b+" "+(a+b));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
