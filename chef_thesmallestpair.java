package javapractice;
import java.util.*;
import java.io.*;
public class chef_thesmallestpair {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0){
				int n = Integer.parseInt(br.readLine());
				StringTokenizer st = new StringTokenizer(br.readLine());
				List<Integer> array =  new ArrayList<>();
				//List<Integer> array1 =  new ArrayList<>();
				while(st.hasMoreTokens()){
					 array.add(Integer.parseInt(st.nextToken()));
				}
				/*for(int i=0,j=1;j<(array.size());i++,j++){
					array1.add((array.get(i) + array.get(j)));
				}*/
				Collections.sort(array);
				System.out.println((array.get(0)+array.get(1)));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
