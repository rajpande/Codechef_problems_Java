package javapractice;
import java.util.*;
import java.io.*;
import java.math.*;
public class hackerrank_loops {

	public static void main(String[] args) {
		try{
			Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int flag;
	            flag =0;
	            System.out.printf("\n");
	            for(int j =0;j<n;j++){
	                flag = flag + (b*(int)Math.pow(2,j));
	                System.out.printf("%d ",(flag+a));
	            }
	        }
	        in.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
