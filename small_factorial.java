package javapractice;
import java.util.*;
import java.math.*;

public class small_factorial {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-- > 0){
				int n = input.nextInt();
				BigInteger temp = new BigInteger("1");
				for(int i=n;i>0;i--)
				{
					temp =temp.multiply(BigInteger.valueOf(i));
				}
				System.out.println(temp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
