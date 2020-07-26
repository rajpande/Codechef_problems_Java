package javapractice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,month,day);
        int day1 = c.get(Calendar.DAY_OF_WEEK);
        if(day1==1)
        return ("SUNDAY");
        else if(day1==2)
        return ("MONDAY");
        else if(day1==3)
        return ("TUESDAY");
        else if(day1==4)
        return ("WEDNESDAY");
        else if(day1==5)
        return ("THURSDAY");
        else if(day1==6)
        return ("FRIDAY");
        else
        return ("SATURDAY");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




/*package javapractice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int B;
    static int H;
    static boolean flag;
    static{
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        flag = true;
    }
    static{
        if(B<0 || H<0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
            
            
        }
    }

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}*/
