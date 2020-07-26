package javapractice;
import java.util.*;
import java.io.*;

public class chef_caravans {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0){
				List<Integer> l = new ArrayList<>();
				int n = Integer.parseInt(br.readLine());
				StringTokenizer st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()){
					l.add(Integer.parseInt(st.nextToken()));
				}
				int temp = 0;
				for(int i=0;i<l.size();i++){
					if(i==0){temp++;}
					else{
						if(l.get(i)<l.get(i-1)||l.get(i)==l.get(i-1)){temp++;}
					}
				}
				System.out.println(temp);
				//br.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
