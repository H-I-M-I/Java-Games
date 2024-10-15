
package h;

import java.util.Random;
import java.util.Scanner;

public class Rock_P_S {
    
    public static void main (String[]args)
    {
        /*
        0 for Rock
        1 for papper 
        2 for Scissor
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Papper, 2 for scissor");
        int userInput = sc.nextInt();
        
        Random random = new Random();
        int computerInput = random.nextInt(3);
        
        if(userInput == computerInput)
        {
            System.out.println("It's a draw");
        }
        
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
        {
            System.out.println("You won!");
        }
        
        else
        {
            System.out.println("Computer won!");
        }
        
        
        System.out.println("Computer choice : "+computerInput);
        
        if(computerInput == 0)
        {
            System.out.println("Computer's choice is : Rock");
        }
        if(computerInput == 1)
        {
            System.out.println("Computer's choice is : Paper");
        }
        if(computerInput == 2)
        {
            System.out.println("Computer's choice is : Scissor");
        }
        
    }
    
}
