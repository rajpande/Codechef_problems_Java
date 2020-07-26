package javapractice;
import java.util.*;

public class second_largest {

	public static void main(String[] args) {
			int t,a,b,c;
			a=b=c=0;
			Scanner input = new Scanner(System.in);
			t = input.nextInt();
			while(t-->0){
				if(input.hasNextInt()){
				a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				}
				if(a>b && a>c){
					System.out.println(a);
				}
				else if(b>a && b>c){
					System.out.println(b);
				}
				else{
					System.out.println(c);
				}
			}
	}

}
