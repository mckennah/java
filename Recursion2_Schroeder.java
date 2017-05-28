/********************************************/
/*Program: Recursion  						*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*4/15/2017									*/
/*this is a recursion program		        */
/********************************************/

import java.util.Scanner;
public class Recursion2_Schroeder {
   public static void guessNumber(int lowVal, int highVal) {
      Scanner scnr = new Scanner(System.in);
	
	int midVal = 0;
	char userEntry = '-';
	
	midVal = (highVal + lowVal) / 2;
	
	//Input user number
	System.out.println("Thinking...");
	System.out.println("Is your number " + midVal + "?");
		userEntry = scnr.next().charAt(0);
		
	if ((userEntry != 'l') && (userEntry != 'h')) { //didnt type in l/h
		System.out.println ("Number found!");
	} else {
		 if (userEntry == 'l') {
		guessNumber(lowVal, midVal);
	} else {
		guessNumber(midVal + 1, highVal);
	} 
	  
   }
   
   return;
}

 public static void main(String[] args) {
	//Instructions
	System.out.println("Choose a number from 0 to 100");
	System.out.println("Answer with:");
	System.out.println("     'l' if your number is lower");
	System.out.println("     'h' if your number is higher");
	System.out.println("     any other key if the guess is correct");
	
	guessNumber(0, 100);
	
	return;
 }
}