package javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chef_luckyfour {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			List<Integer> array = new ArrayList<>();
			int t = input.nextInt();
			while(t-->0){
				int a = input.nextInt();
				int temp = a;
				int flag =0;
				while(temp!=0){
					if(temp%10==4){
						flag++;
					}
					temp = temp/10;
				}
				System.out.println(flag);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
