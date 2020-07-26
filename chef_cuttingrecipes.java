package javapractice;
import java.util.*;
public class chef_cuttingrecipes {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				int n = input.nextInt();
				List<Integer> list = new ArrayList<>();
				List<Integer> list1 = new ArrayList<>();
				int temp = n;
				while(temp-->0){
					list.add(input.nextInt());
				}
				for(int i=0;i<n;i++){
					int a = list.get(i);
					list.forEach(flag->{
						if((flag%a)==0){list1.add(flag/a);}
					});
					if(list1.size()==n){
						list1.forEach(val->{System.out.print(val+" ");});
						break;
					}
					else{
						list.forEach(val1->{System.out.print(val1 +" ");});
						break;
					}
				}

			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
