package javapractice;
import java.util.*;
public class chef_totalexpenses {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			double te;
			while(t-->0){
				int q = input.nextInt();
				double p = input.nextDouble();
				if(q>1000){
					double temp;
					temp = p * (0.1);
					p = p - temp;
					te = p * q;
					System.out.println(String.format("%.6f", te));
				}
				else{
					te = p * q;
					System.out.println(String.format("%.6f", te));
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
