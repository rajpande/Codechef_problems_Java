package javapractice;
import java.io.*;
public class buffread {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the integer");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter the String");
			String b = br.readLine();
			System.out.printf("You have entered "+a+" and the string is "+b);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
