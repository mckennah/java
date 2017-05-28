/********************************************/
/*Program: Readng and Writing 				*/
/*CIS163AC									*/
/*McKennah Schroeder						*/
/*4/2/2017									*/
/*this is a reading and writing file        */
/********************************************/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ReadingWriting_Schroeder {
public  static void main(String[] args) throws IOException {
    FileReader filereader = new FileReader("names.txt"); //read from text file
	BufferedReader inputStream = new BufferedReader(filereader);
    FileWriter filewriter = new FileWriter("dest.txt"); //write to the destination file
	BufferedWriter outputStream = new BufferedWriter(filewriter);
	
	
	String count;
		while ((count = inputStream.readLine()) != null) {
			outputStream.write(count + "\t" + "\n");
			
		}
	outputStream.flush(); //makes it work
	outputStream.close();
	inputStream.close();
	
return;
}
}