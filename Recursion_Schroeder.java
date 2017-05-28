/********************************************/
/*Program: Recursion  						*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*4/16/2017									*/
/*this is a recursion program		        */
/********************************************/

import java.util.Scanner;
import java.util.Random;
public class Recursion_Schroeder {
   public static void randInt() {}
      


 public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int myNumber;
	int guess;
	
	Random rnd = new Random();
	myNumber = rnd.nextInt((100 - 0) + 1);
	
	do {
		System.out.println("Enter a number between 0 and 100.");
			guess = scnr.nextInt();
		if (guess == myNumber) {
			System.out.println("Correct!");
		} else if (guess < myNumber) {
			System.out.println("The number is greater. Try again.");
		} else if (guess > myNumber) {
			System.out.println("The number is smaller. Try again.");
		}
	} while (guess != myNumber);
	
	return;
 }
}