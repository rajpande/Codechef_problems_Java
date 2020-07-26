package javapractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chef_aprillunch_abp {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			List<Integer> d = new ArrayList<>();
			int t = input.nextInt();
			while(t-->0){
				int N = input.nextInt();
				int K = input.nextInt();
				for(int i =0;i<N;i++){
					d.add(input.nextInt());
				}
				for(int i =0, j=i+1;i<N;i++){
					if(d.get(i)>d.get(j)){
						int temp = d.get(i);
						d.add(i, d.get(i+K));
						d.add((i+K), temp);
					}
				}
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
