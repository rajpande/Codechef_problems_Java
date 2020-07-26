package javapractice;
import java.io.*;
import java.util.*;

public class chef_areaorperi {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int l = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			if((l*b)==(2*(l+b))){
				System.out.println("Eq");
				System.out.println((l*b));
			}
			else if((l*b)>(2*(l+b))){
				System.out.println("Area");
				System.out.println((l*b));
			}
			else{
				System.out.println("Peri");
				System.out.println(2*(l+b));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
