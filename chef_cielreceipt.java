package javapractice;
import java.util.*;
public class chef_cielreceipt {

	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while (t-->0 )
	        {   
	            int p=sc.nextInt(),count=0;
	            int a[]=new int[12];
	            for (int i=11;i>=0 ;i-- )
	            {
	                a[i]=(int)Math.pow(2,i);
	                if (a[i]<=p)
	                {
	                    p=p-a[i];
	                    count ++;
	                    i++;
	                }
	                //System.out.print(a[i]+" ");
	            }
	            
	            System.out.println(count);
	        }
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
