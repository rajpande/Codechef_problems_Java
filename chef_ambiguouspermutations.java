package javapractice;
import java.util.*;
public class chef_ambiguouspermutations {

	public static void main(String[] args) {
		try{
			HashMap<Integer,Integer> hm = new HashMap<>();
			HashMap<Integer,Integer> hm1 = new HashMap<>();
			Scanner input = new Scanner(System.in);
			while(true){
				int n = input.nextInt();
				int temp =n;
				int i;
				i=1;
				if(n!=0){
					while(temp-->0){
						hm.put(i++,input.nextInt());
					}
					for(int k =1;k<=n;k++){
						hm1.put(hm.get(k),k);
					}
					if(hm.equals(hm1)){System.out.println("ambiguous");}
					else{System.out.println("not ambiguous");}
				}else{
					break;
				}
				hm.clear();
				hm1.clear();
			}
			input.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
