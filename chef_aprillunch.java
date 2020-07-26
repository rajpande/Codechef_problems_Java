package javapractice;
import java.util.*;
public class chef_aprillunch {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			List<Integer> d = new ArrayList<>();
			List<Integer> f = new ArrayList<>();
			List<Integer> f1 = new ArrayList<>();
			List<Integer> d1 = new ArrayList<>();
			int t = input.nextInt();
			while(t-->0){
				int N = input.nextInt();
				int S = input.nextInt();
				int temp = 0;
				for(int i =0;i<N;i++){
					d.add(input.nextInt());
				}
				for(int i =0;i<N;i++){
					f.add(input.nextInt());
				}
				for(int i =0;i<N;i++){
					if(f.get(i)==0){
						d1.add(d.get(i));
					}
					else{
						f1.add(d.get(i));
					}
				}
				for(int i=0;i<d1.size();i++){
					for(int j=0;j<f1.size();j++){
						if((d1.get(i)+f1.get(j))<=(100-S)){
							temp = 1;
							break;
						}
					}
					if(temp == 1){
						break;
					}
				}
				if(temp == 1){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
				f.clear();
				d.clear();
				f1.clear();
				d1.clear();
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
