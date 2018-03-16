/*
Tyler Smith
Java Per. 4
Assignment = dw5
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.util.Random;
public class dw5
{
	public static void main(String[] args)
	{
	Random rand = new Random();
	int numtoguess = rand.nextInt(100);
	int numoftries = 0;
	Scanner input = new Scanner(System.in);
	int guess;
	boolean win = false;
	do
	{
		System.out.println("Guess a number between 1 and 100:");
		guess = input.nextInt();
		numoftries++;
		if(guess == numtoguess)
		{
		win = true;
		}
		else if(guess < numtoguess)
		{
		System.out.println("Your guess is too low");
		}
		else if(guess > numtoguess)
		{
		System.out.println("Your guess is too high");
		}
	}
	while(win == false);
	System.out.println("You win!");
	System.out.println("The number was " + numtoguess);
	System.out.println("It took you " + numoftries + " tries");
	

	}
}
