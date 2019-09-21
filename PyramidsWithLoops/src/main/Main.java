/*
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
*Other Information:
*/
package main;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {	//outer for loop number of rows
			
            for (int j=5-i; j>1; j--)	//creates spaces for pyramid shape
            {  
                System.out.print(" "); 	//prints spaces for shape
            } 
			for (int j = 0; j <=i*2; j++)	//creates numbers in pyramid, one less than the number of rows * 2
			{
				
				System.out.print(i+1);	//prints the numbers in pyramid
			}
			
			System.out.println(" ");
		}
	}
}
