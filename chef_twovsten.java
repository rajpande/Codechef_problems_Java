package javapractice;
import java.util.*;
public class chef_twovsten {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int x = input.nextInt();
				if(x%10==0){
					System.out.println(0);
				}
				else if(x%5==0){
					System.out.println(1);
				}
				else{
					System.out.println(-1);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
