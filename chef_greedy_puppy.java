package javapractice;
import java.util.*;
import java.io.*;
public class chef_greedy_puppy {

	public static void main(String[] args) {
		
		try{
			Scanner input =  new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int k = input.nextInt();
				int i = 1;
				int j=0;
				while(i<=k){
					j = n%i;
					i++;	
				}
				System.out.println(j);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
