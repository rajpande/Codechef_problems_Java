package javapractice;
import java.util.*;
public class chef_idandship {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			int t = input.nextInt();
			while(t-->0){
				String str = input.next();
				if(str.equalsIgnoreCase("c")){
					System.out.println("Cruiser");					
				}
				else if(str.equalsIgnoreCase("b")){System.out.println("BattleShip");}
				else if(str.equalsIgnoreCase("d")){System.out.println("Destroyer");}
				else if(str.equalsIgnoreCase("f")){System.out.println("Frigate");}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
