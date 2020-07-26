package javapractice;
import java.util.*;
public class chef_atm {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int amount = input.nextInt();
			double bal = input.nextDouble();
			if((amount%5)==0 && (bal-amount)>=0.50){
				double ans = bal - amount - 0.50;
				System.out.printf("%.2f",ans);
			}
			else 
				System.out.printf("%.2f",bal);
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
