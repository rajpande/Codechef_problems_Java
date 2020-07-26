package javapractice;

import java.util.*;
public class enormous_inputtest {

	public static void main(String[] args) {
		try{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int flag =0;
		while(n-->0){
			int t = input.nextInt();
			if(t%k ==0){
				flag++;
			}
		}
		System.out.println(flag);
	
	}catch(Exception e){
		e.printStackTrace();
	}

}}
