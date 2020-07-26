package javapractice;
import java.util.*;
public class chef_sqrt {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int i,result;
				i=result=1;
				while(result<=n){
					i++;
					result=i*i;
				}
				System.out.println(i-1);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
