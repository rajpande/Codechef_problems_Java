package javapractice;
import java.util.*;
public class chef_icecream {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){ 
				int n = input.nextInt();
				int[] arr = new int[n];
				for(int i =0;i<n;i++){
					arr[i] = input.nextInt();
				}
				int five,ten,fif,flag;
				five = ten = fif = flag =0;
				for(int i=0;i<n;i++){
					if(arr[i]==5){
						five++;
					}
					else if(arr[i]==10){
						if(five>0){
							five--;
							ten++;
						}
						else{
							flag = 1;
							break;
						}
					}
					else if(arr[i]==15){
						if(ten>0){
							ten--;
							fif++;
						}
						else if(five>=2){
							five = five-2;
							fif++;
						}
						else{
							flag=1;
							break;
						}
					}
					
				}
				if(flag==0){System.out.println("YES");}
				else{System.out.println("NO");}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
