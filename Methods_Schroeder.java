/********************************************/
/*Program: Methods  						*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*3/12/2017									*/
/*this is an updated calculator program	    */
/********************************************/

import java.util.Scanner;

public class Methods_Schroeder { 

//methods
public static int findMultiply(int num1, int num2){ //multiplication method
	int findMultiply = 0;
	findMultiply = num1 * num2;
	return(findMultiply);
}
public static int findDivide(int num1, int num2){ //division method
	int findDivide = 0;
	if (num2 != 0){
	findDivide = num1 / num2;
	} else {
		System.out.println("Do not try to divide by 0 please");
	}
	return(findDivide);
}
public static int findAdd(int num1, int num2) { //addition method
	int findAdd = 0;
	findAdd = num1 + num2;
	return(findAdd);
}
public static int findSubtract(int num1, int num2) { //subtraction method
	int findSubtract = 0;
	findSubtract = num1 - num2;
	return(findSubtract);
}
//main
	public static void main(String[] args) { 
		String usrInput = "";
		String Num1Input = "";
		String Num2Input = "";
		int Num1Int = 0;
		int Num2Int = 0;
		Scanner scnr = new Scanner(System.in);

		
		
		System.out.println("Please Enter (M)ultiplication, (D)ivision, (A)ddition, or (S)ubtraction"); //getting which math to do
			usrInput = scnr.next();
		System.out.println(usrInput);
			if (usrInput.equals("M")|| usrInput.equals("m")||
					usrInput.equals("D")|| usrInput.equals("d")||
					usrInput.equals("A")|| usrInput.equals("a")||
					usrInput.equals("S")|| usrInput.equals("s")
			)
			{
				System.out.println("");
			}
			else { 
				System.out.println("Please enter m, d, a, or s");//verify correct letter is entered 
				return; //ends program if user doesn't follow instructions
			}
			
		System.out.println("What is your first number?");//getting numbers
			Num1Input = scnr.next();
			Num1Int = Integer.parseInt(Num1Input);
		System.out.println("What is your second number?");
			Num2Input = scnr.next();
			Num2Int = Integer.parseInt(Num2Input);

			//original if statement below	
			if (usrInput.equals("M")|| usrInput.equals("m")||
				usrInput.equals("D")|| usrInput.equals("d")||
				usrInput.equals("A")|| usrInput.equals("a")||
				usrInput.equals("S")|| usrInput.equals("s")
			)

			
          { //If Bracket
           switch (usrInput) {//Switch Bracket
            case "M":
			case "m":
				System.out.println("The Answer to " + Num1Input + " * " + Num2Input + " Equals " + findMultiply(Num1Int, Num2Int)); //calls multiplication method
            break;
			
            case "D":
			case "d":
				System.out.println("The Answer to " + Num1Input + " / " + Num2Input + " Equals " + findDivide(Num1Int, Num2Int)); //calls division method
            break;

            case "A":
			case "a":
				System.out.println("The Answer to " + Num1Input + " + " + Num2Input + " Equals " + findAdd(Num1Int, Num2Int)); //calls addition method
            break;

            case "S":
			case "s":
				System.out.println("The Answer to " + Num1Input + " - " + Num2Input + " Equals " + findSubtract(Num1Int, Num2Int)); //calls subtraction method
            break;

            default: 
            System.out.println("Error: Default statement");
             break;
             }}else{
           System.out.println("Error: the first else statement didn't catch the wrong letter input");

          }
          
   }//Main Bracket
}//Class Bracket

