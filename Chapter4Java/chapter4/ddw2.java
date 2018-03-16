/*
Tyler Smith
Java Per. 4
Assignment = ddw2
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class ddw2
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	double total = 0;         
	int counter = 0;          
	double average = 0; 
	int grade;                
	do
	{
	System.out.println("Enter the grade scored.\n Enter -999 to quit. ");        
	grade = s.nextInt();
	if (grade != -999)                 
	{                                 
	total += grade;          
	counter++;
	}}
	while (grade != -999);
	average = total / counter;
	System.out.println("The average of your " + counter + " grades is "+ average +".");
	}
	}
