/********************************************/
/*Program: Hello World						*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*2/21/2017									*/
/*this is a branching program		        */
/********************************************/

import java.util.Scanner;
public class Branching_Schroeder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int priceOver65 = 5; //price for senior citizens
      int priceOver18 = 15; //price for adults that aren't senior citizens
      int inputAge = 0; //Age of movie-goers

      System.out.print("Enter age: ");
      inputAge = scnr.nextInt();

      if (inputAge < 18) {
         System.out.println("You cannot see this movie"); //anyone under 18 is not allowed
      } 
      else if (inputAge >= 65) {
         
         System.out.println("Your price is $" + priceOver65); //anyone 65 and older gets a discount
      }
	  
	  else {
		  System.out.println("Your price is $" + priceOver18); //everyone else pays the normal price
	  }

      return;
   }
}