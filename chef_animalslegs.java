package javapractice;
import java.math.BigInteger;
import java.util.*;
public class chef_animalslegs {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			BigInteger c = new BigInteger("1");
			BigInteger d = new BigInteger("1");
			BigInteger l = new BigInteger("1");
			int t = input.nextInt();
			while(t-->0){
				c = input.nextBigInteger();
				d = input.nextBigInteger();
				l = input.nextBigInteger();
				if(l.intValue()>(c.intValue()+d.intValue())*4 ||l.intValue()<d.intValue()*4 || l.intValue()%4 !=0){
					System.out.println("no");
				}
				else{
					if(c.intValue()-(l.intValue()-(d.intValue()*4))/4>(d.intValue()*2)){
						System.out.println("no");
					}
					else{
						System.out.println("yes");
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
