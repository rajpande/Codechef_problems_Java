package javapractice;
import java.io.*;
import java.util.*;

public class chef_puppyandsum {

	public static void main(String[] args) {
		try{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			int d,n,t;
			t = Integer.parseInt(input.readLine());
			while(t-->0){
				StringTokenizer st = new StringTokenizer(input.readLine());
				d = Integer.parseInt(st.nextToken());
				n = Integer.parseInt(st.nextToken());
				int flag,temp;
				flag = 1;
				temp = 0;
				for(int i=0;i<d;i++){
					while(flag<=n){
						temp = temp + flag;
						flag++;
					}
					n = temp;
				}
				System.out.println(temp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
