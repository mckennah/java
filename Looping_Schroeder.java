/********************************************/
/*Program: Looping  						*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*2/27/2017									*/
/*this is a looping program	    	        */
/********************************************/

import java.util.Scanner;
public class Looping_Schroeder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
     int userChange;
	  int numHalfDollars = 0; //these need to be 0 to begin with
	  int numQuarters = 0;
	  int numDimes = 0;
	  int numNickels = 0;
	  int numPennies = 0;
      
	  System.out.print("Enter net worth in your pocket: ");
      userChange = scnr.nextInt();

      if ((userChange > 99) || (userChange < 1)) {
		  System.out.println("Please enter value between 1 and 99, inclusive.");//if user types in number outside range
	  }
	  else {
		  
		  while (userChange >= 50) {
			 userChange = userChange - 50;
			 numHalfDollars = 1;//half-dollars will always equal one if 50 or greater
		  } 
		  while ((userChange <= 49) && (userChange >=25)) {
			  numQuarters = 1;
			  userChange = userChange - (25 * numQuarters); //quarters would also always equal one if userChange at this point is greater than 25
		  }
		 while ((userChange <= 24) && (userChange >=10)) {
			 numDimes = userChange / 10;
			 userChange = userChange - (10 * numDimes);//dimes can be 0, 1, or 2
		 }
		 while ((userChange >= 5) && (userChange <= 9)) {
			 numNickels = 1;
			 userChange = userChange - (5 * numNickels); //nickels should be either 0 or 1
		 }
		 while (userChange >= 1) {
			 numPennies = userChange;
			 userChange = userChange - numPennies; //pennies should be what is left, and should be 4 or less
		 }
		 
		 System.out.println("You have " + numHalfDollars + " half-dollars and " + numQuarters + " quarters and " + numDimes + " dimes and " + numNickels + " nickels and " + numPennies + " pennies." );
		  
	  }
	  if ((numDimes > 2) || (numPennies > 4)) {
		  System.out.println("McKennah you messed something up.");//to alert if I messed something up 
	  }

      return;
   }
}