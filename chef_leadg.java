package javapractice;
import java.util.*;
public class chef_leadg {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t,p1,p2,flag,lead;
			flag =0;
			lead =0;
			t = input.nextInt();
			while(t-->0){
				p1 = input.nextInt();
				p2 = input.nextInt();
				if(p1>p2 &&(p1-p2)>lead){
					flag = 1;
					lead = p1-p2;
				}
				else if(p2>p1 &&(p2-p1)>lead){
					flag = 2;
					lead = p2-p1;
				}
			}
			System.out.println(flag +" "+ lead);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
