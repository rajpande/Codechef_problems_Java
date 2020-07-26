package javapractice;
import java.util.*;
import java.io.*;

public class chef_tanuandheadbob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner input = new Scanner(System.in);
			int t =  input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				input.nextLine();
				String str = input.nextLine();
				int yes,no,ind;
				yes = no = ind = 0;
				for(int i=0;i<n;i++){
					if(str.charAt(i)=='Y'){
						yes++;
					}
					else if(str.charAt(i)=='N'){
						no++;
					}
					else if(str.charAt(i)=='I'){
						ind++;
					}
				}
				if(yes>0&&no>0&&ind==0){
					System.out.println("NOT INDIAN");
				}
				else if((yes==0&&no>0&&ind==0)){
					System.out.println("NOT SURE");
				}
				else if(no>0&&ind>0||no==0&&ind>0){
					System.out.println("INDIAN");
				}
				else if(yes>0&&no==0&&ind==0){
					System.out.println("NOT INDIAN");
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
