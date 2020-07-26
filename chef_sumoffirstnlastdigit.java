package javapractice;
import java.util.*;
public class chef_sumoffirstnlastdigit {

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
					array.add(temp%10);
					temp = temp/10;
				}
				System.out.println((array.get(0) + array.get((array.size()-1))));
				array.clear();
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
