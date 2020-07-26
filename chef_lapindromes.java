package javapractice;
import java.util.*;
public class chef_lapindromes {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			String S = new String();
			int t = input.nextInt();
			while(t-->0){
				S = input.next();
				String str1 = S.substring(0, (S.length()/2));
				String str2 = S.substring((S.length()+1)/2, S.length());
				char[] ar1 = str1.toCharArray();
				char[] ar2 = str2.toCharArray();
				Arrays.sort(ar1);
				Arrays.sort(ar2);
				
				if(new String(ar1).equals(new String(ar2))){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
