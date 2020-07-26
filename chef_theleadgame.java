package javapractice;
import java.util.*;
public class chef_theleadgame {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			List<Integer> l1,l2;
			l1 = new ArrayList<>();
			l2 = new ArrayList<>();
			int t = input.nextInt();
			while(t-->0){
				int p1 = input.nextInt();
				int p2 = input.nextInt();
				if(p1>p2){
					l1.add(1);
					l2.add(p1-p2);
				}
				else{
					l1.add(2);
					l2.add(p2-p1);
				}
			}
			int max = Collections.max(l2);
			int maxid = l2.indexOf(max);
			System.out.print(l1.get(maxid));
			System.out.print("  "+max);
		}catch(Exception e){
			
		}

	}

}
