package javapractice;
import java.util.*;
import java.io.*;
public class chef_farmerfeb {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0){
				StringTokenizer st = new StringTokenizer(br.readLine());
			 int x = Integer.parseInt(st.nextToken());
			 int y = Integer.parseInt(st.nextToken());
			 
			  for(int i=1;i<100;i++){
				  int temp = x+y+i;
				  int j=2;
				  int flag = 0;
				  while(j<=temp/2){
					  if((temp%j++)==0){
						  flag=1;
						  break;
					  }
					  
				  }
				  if(flag==0){System.out.println(i);break;}
			  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
