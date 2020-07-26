package javapractice;
import java.util.*;
public class chef_blockgame {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int temp,flag;
				temp = n;
				flag=0;
				while(temp>0){
					flag = flag*10;
					flag = flag+(temp%10);
					temp = temp/10;
				}
				if(n==flag){
					System.out.println("Wins");
					}
				else{
					System.out.println("Losses");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
