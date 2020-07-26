package javapractice;

import java.util.*;
public class chef_turbosort {

	public static void main(String[] args) {
		try{
			List<Integer> arr = new ArrayList<>();
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				arr.add(input.nextInt());
			}
			Collections.sort(arr);
			for(int i: arr){
				System.out.println(i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
