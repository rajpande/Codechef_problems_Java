package javapractice;
import java.util.*;
import java.io.*;

public class chef_trainpartner {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			List<Integer> l = new ArrayList<Integer>();
			
			while(t-->0){
				int n = Integer.parseInt(br.readLine());
				int x=n%8;
			       if(x==0)
			           System.out.println((n-1)+"SL");
			       else if(x==1)
			           System.out.println((n+3)+"LB");
			       else if(x==2)
			           System.out.println((n+3)+"MB");
			       else if(x==3)
			           System.out.println((n+3)+"UB");
			        else if(x==4)
			           System.out.println((n-3)+"LB");
			       else if(x==5)
			           System.out.println((n-3)+"MB");
			       else if(x==6)
			           System.out.println((n-3)+"UB");
			      else if(x==7)
			           System.out.println((n+1)+"SU");
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
