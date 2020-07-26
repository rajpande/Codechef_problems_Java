package javapractice;
import java.util.*;
import java.util.Scanner;

public class chef_operators {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int o = input.nextInt();
				if(n==o){System.out.println("=");}
				else if(n>o){System.out.println(">");}
				else{System.out.println("<");}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
