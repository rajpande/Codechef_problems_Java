package javapractice;
import java.math.*;
import java.util.*;

public class chef_tomandjerrygame {

	public static void main(String[] args) {
		
		try{
			Scanner input = new Scanner(System.in);
			BigInteger ts = new BigInteger("1");
			BigInteger js = new BigInteger("1");
			BigInteger flag = new BigInteger("0");
			
			int t = input.nextInt();
			while(t-->0){
				ts = input.nextBigInteger();
				flag = num(ts);
				System.out.println(flag);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static BigInteger num(BigInteger ts){
		BigInteger flag = new BigInteger("0");
		if(!ts.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
			for(BigInteger i = new BigInteger("2");i.intValue()<ts.intValue();i=i.add(new BigInteger("2"))){
				flag = flag.add(BigInteger.ONE);
			}
			return flag;
		}
		else{
			for(BigInteger i = new BigInteger("1");i.intValue()<ts.intValue();i=i.add(new BigInteger("1"))){
				//flag = flag.add(BigInteger.ONE);
				if(i.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
					flag = num(ts.divide(new BigInteger("2")));
				}
			}
			return flag;
		}
	}

}
