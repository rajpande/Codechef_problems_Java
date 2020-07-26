package javapractice;
import java.util.*;
import java.io.*;

public class chef_sumordiff {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			if(n1>n2){
				System.out.println(n1-n2);
			}
			else{
				System.out.println(n1+n2);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
