package javapractice;
import java.util.*;
public class chef_gcdlcm {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			long t = input.nextInt();
			long l,s,temp;
			while(t-->0){
				long A = input.nextLong();
				long B = input.nextLong();
				temp = 1;
				if(A>B){ l = A;
				 s = B;}
				else{ l = B;
				s = A;				
				}
				while(temp!=0){
					temp = l%s;
					if(temp!=0){
						if(temp>s){l = temp;}
						else{s = temp;}
					}	
				}
				long gcd = (A*B)/s;
				System.out.println(s +" "+gcd);
			}
			input.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
