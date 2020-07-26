package javapractice;
import java.util.*;
public class chef_cupcakes {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				System.out.println((n/2)+1);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
