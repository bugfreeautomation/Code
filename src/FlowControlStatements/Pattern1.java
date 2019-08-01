package FlowControlStatements;
/*
 * Write a program in Java to display the pattern like right angle triangle with a number
 * Input number of rows : 10 
 * Output:
1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910

https://www.youtube.com/watch?v=q-D8BKfYKn4 */

import java.util.Scanner;

public class Pattern1 {   

	public static void main(String[] args)

	{
		
     //The scope of this variable extends 
    //from its declaration to the end of the block governed by the for statement,
	 int i,j,n;
	 System.out.print("Input number of rows : ");
	 Scanner in = new Scanner(System.in);
			    n = in.nextInt();

	   for(i=1;i<=n;i++) // this loop runs 10 times
	   {
		for(j=1;j<=i;j++) //j will always restart from 1; because when we exit a for loop it ends		
		{ System.out.print(j);
		}
           System.out.println("");
		  
		 
	   }
	   
	}
}