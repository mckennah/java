/********************************************/
/*Program: Array  							*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*3/5/2017									*/
/*this is an array program		  	        */
/********************************************/

import java.util.Scanner;
public class Array_Schroeder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
	int arrayLength = 10; //Max amount in array
	int[] userVals = new int[arrayLength]; // User numbers
	int i = 0;
   

   	
	  System.out.println("Enter number of elements you want in array. Please do not exceed 10.");//User inputs amount of integers for the array
		 arrayLength = scnr.nextInt();
	
	System.out.println("Enter " + arrayLength + " integer values...");
    
	//int userVals[] = new int[arrayLength];  
      for (i = 0; i < arrayLength; i++) {
         System.out.print("Value: ");
         userVals[i] = scnr.nextInt();//User inputs all of their integers; array is populated
      }
  
	
		System.out.print("Your array is: ");
		 
		for (i = 0; i< arrayLength; i++) { //for each time of the amount in the array, print the array number stored
			System.out.print(userVals[i] + " "); //prints out the arrays with a space to separate them
		}
		
		
	
           return;
   }
  

   }