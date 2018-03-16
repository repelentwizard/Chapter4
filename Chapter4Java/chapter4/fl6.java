/*
Tyler Smith
Java Per. 4
Assignment = fl6
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class fl6
{
	public static void main(String[] args)
	{
	double num = 5;
	double num1 = 0;
	double num2;
	Scanner s = new Scanner(System.in);
        for (num2 = 0; num2 < num; num2++) {
          System.out.print("Inserts a number: ");
	  num1 += s.nextInt();
          }
	  System.out.println("The sum is " + num1);
          System.out.println("average is " + (num1 / num2));			    
	}}




