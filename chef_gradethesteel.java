package javapractice;
import java.util.*;
import java.io.*;
public class chef_gradethesteel {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				float h,c,ts;
				h = input.nextFloat();
				c = input.nextFloat();
				ts = input.nextFloat();
				if(h>50&&c<0.7&&ts>5600){
					System.out.println(10);
				}
				else if(h>50&&c<0.7){
					System.out.println(9);
				}
				else if(c<0.7&&ts>5600){
					System.out.println(8);
				}
				else if(h>50&&ts>5600){
					System.out.println(7);
				}
				else if(h>50){
					System.out.println(6);
				}
				else if(c<0.7){
					System.out.println(6);
				}
				else if(ts>5600){
					System.out.println(6);
				}
				else{
					System.out.println(5);
				}				
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
