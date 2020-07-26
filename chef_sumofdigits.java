package javapractice;
import java.util.*;
public class chef_sumofdigits {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int temp = n;
				int flag =0;
				while(temp!=0){
					flag = flag + (temp%10);
					temp = temp/10;
				}
				System.out.println(flag);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
