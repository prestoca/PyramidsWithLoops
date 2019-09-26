/*
 * Assignment 04
 * Christa Preston
 * prestoca@ucmail.uc.edu
 * IS4010 007 App Dev with Java
 * Fall 2019
 * Description: Printing pyramids using loops. This one works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 

*Citations: Nicholson Lecture Loops
*Big Java: late objects 2e, Horstmann pg 151
*Other Information:
*"A programmer is heading out to the grocery store, so his wife tells him "get a gallon of milk, and if they have eggs, 
*get a dozen." He returns with 13 gallons of milk."
*/
package main;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) //outer for loop number of rows, this entire loop stops at 5
		{	
			
            for (int j=5-i; j>1; j--)	//counting number of spaces for pyramid shape, total rows - i increment
            {  
                System.out.print(" "); 	
            } 
			for (int j = 0; j <=i*2; j++)	//the amount of numbers in the pyramid, one less than the i increment * 2
			{
				System.out.print(i+1);	//the number in pyramid, i increment +1
			}
			System.out.println(" "); 
		}
	}
}
