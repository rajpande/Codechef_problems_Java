package javapractice;
import java.util.*;
public class chef_reversenumber {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int flag=0;
				int temp;
				while(n!=0){
					temp = n%10;
					flag = flag*10;
					flag = flag+temp;
					n=n/10;
				}
				System.out.println(flag);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
