package javapractice;
import java.util.*;
import java.io.*;
public class chef_andstrings {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0){
				int temp = 0;
				String str = br.readLine();
				if(str.length()==1){System.out.println(temp);}
				else{
					for(int i=0;str.length()>1;i++){
						String str1 = str.substring(i, i+2);
						if(str1.equals("xy")||str1.equals("yx")){
							temp++;
							str = str.substring(i+2, str.length());
							i=-1;
						}
						else{
							str = str.substring(i+1, str.length());
							i=-1;
						}
					}
					System.out.println(temp);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
