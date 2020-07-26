package javapractice;
import java.util.*;
import java.io.*;

public class chef_grosssalary {

	public static void main(String[] args) {
		try{
			
			
			/*Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int s = input.nextInt();
				if(s<1500){
					System.out.printf("\n%.2f", (s+(s*0.1)+(s*0.9)));
				}
				else{
					System.out.printf("\n%.2f", (s+500+(s*0.98)));
				}
			
			}*/
			
			String d = "bookkeeper";
			d = d.substring(1,7);
			d = "w" + d;
			System.out.println(d);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
