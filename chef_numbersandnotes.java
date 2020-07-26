package javapractice;
import java.util.*;
public class chef_numbersandnotes {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int a[] ={1,2,5,10,50,100};
			int t = input.nextInt();
			int count,flag;
			while(t-->0){
				int n =input.nextInt();
				flag=count=0;
				for(int i=5;i>=0;--i){
					if(a[i]<=n){
						count++;
						n=n-a[i];
						i++;
					}
				}
				System.out.println(count);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
