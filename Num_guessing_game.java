
package h;

//import java.util.Scanner;
import java.util.Random;


class Game{
    
    public int number;
    public int numberOfGuessing;
    public int inputNumber;

    public int getNumberOfGuessing() {
        return numberOfGuessing;
    }

    public void setNumberOfGuessing(int numberOfGuessing) {
        this.numberOfGuessing = numberOfGuessing;
    }
    
    public void givenNumber(int n)
    {
        numberOfGuessing++;
        this.inputNumber = n;
    }
    
    Game(){
        
        Random random = new Random();
        number = random.nextInt(100);
        
    }
    
    boolean isCorrect(){
        
        if(inputNumber == number){
            
            System.out.format("Yes...it was a right guess, the number was %d\n"
                    + "The number was guessed in %d attempts\n", number, numberOfGuessing);
            return true;
        }
        else if(inputNumber > number){
            System.out.println("Wrong guess...Your given number is larger than the mysterious number!!!");
        }
        else if(inputNumber < number){
            System.out.println("Wrong guess...Your given number is smaller than the mysterious number!!!");
        }
        return false;
    }
}

public class Num_guessing_game {
    
    public static void main (String[] args)
    {
        Game g = new Game();
        boolean b = false;
        
        while(!b)
        {
            System.out.print("Guess the number :");
            //Scanner sc = new Scanner(System.in);
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int N = sc.nextInt();
            g.givenNumber(N);
            
            b = g.isCorrect();
            
        }
    }
}
