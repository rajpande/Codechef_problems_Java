package javapractice;
import java.util.*;
public class chef_servent {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				if(n<10){
					System.out.println("What an obedient servant you are!");
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
