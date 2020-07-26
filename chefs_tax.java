package javapractice;
import java.util.*;
public class chefs_tax {

	public static void main(String[] args) {
		int t,temp,n;
		double tax = 0;
		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		temp =t;
		for(int k=0;k<t;k++){
			n = input.nextInt();
			if(n<=250000)
				tax = 0;
			else if(n>250000 && n<=500000)
				tax = 0.05*(n - 250000);
			else if(n>500000 && n<=750000)
				tax = (0.05*250000) + (0.1*(n-500000));
			else if(n>750000 && n<=1000000)
				tax = (0.05*250000) + (0.1*250000) + (0.15*(n-750000));
			else if(n>1000000 && n<=1250000)
				tax = (0.05*250000) + (0.1*250000) + (0.15*250000) + (0.2*(n-1000000));
			else if(n>1250000 && n<=1500000)
				tax = (0.05*250000) + (0.1*250000) + (0.15*250000) + (0.2*250000) +(0.25*(n-1250000));
			else
				tax=(0.05*250000)+(0.1*250000)+(0.15*250000)+(0.2*250000)+(0.25*250000)+(0.3*(n-1500000));
			System.out.println((int)(n-tax));
		}

	}

}
