package javapractice;
import java.util.*;

public class chef_pricecontrol {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				int k = input.nextInt();
				int rev = 0;
				int rev1 = 0;
				int[] p = new int[n];
				for(int i=0;i<n;i++){
					p[i] = input.nextInt();
					rev = rev + p[i];
				}
				for(int i=0;i<n;i++){
					if(p[i]>k){
						p[i] = k;
					}
					rev1 = rev1 + p[i];
				}
				System.out.println(rev-rev1);
			}
			input.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
