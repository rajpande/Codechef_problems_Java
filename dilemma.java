package javapractice;

import java.util.*;

public class dilemma {

	public static void main(String[] args) {
		int a, b, c, d, t;
		a = b = c = d = 0;
		try{
		List<Integer> res = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		while(t-- != 0){
			if(input.hasNext()){
				a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				d = input.nextInt();
			}
			if((a + c) == (b+d) ||(a+d) == (b+c)){
				res.add(1);
			}
			else{
				res.add(0);
			}
		}
		int i = 0;
		for (Integer num : res) { 		      
	        if(res.get(i++)==1)   
	        	System.out.println("Yes");
	        else
	        	System.out.println("No");
	      }
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
