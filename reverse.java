package javapractice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class reverse {
	
	static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
            
            Map<Integer, Character> spl_chars = new HashMap<>();
            for(int k =0;k<word.length();k++)
            {
            	if((word.charAt(i)>=48 && word.charAt(i)<=57)||(word.charAt(i)>=65&&word.charAt(i)<=90)||(word.charAt(i)>=97&&word.charAt(i)<=122)){                	            		
            	}
            	else{
            		spl_chars.put(i,word.charAt(i));
            	}
            }
            
            for (int j = word.length()-1; j >= 0; j--) 
            {
            	if((word.charAt(j)>=48 && word.charAt(j)<=57)||(word.charAt(j)>=65&&word.charAt(j)<=90)||(word.charAt(j)>=97&&word.charAt(j)<=122)){ 
            		
            		reverseWord = reverseWord + word.charAt(j);
            	}
            	
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println("Input String:  " + inputString);
         
        System.out.println("Output String:  "+reverseString);
    }
     
    public static void main(String[] args) 
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	try{
    		System.out.println("Enter the string");
    		String input = br.readLine();
    		reverseEachWordOfString(input);
    	}
    	catch(Exception e){
    		
    	}
    	
    }

}
