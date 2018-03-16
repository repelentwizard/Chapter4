/*
Tyler Smith
Java Per. 4
Assignment = fl7
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class fl7
{
	public static void main(String[] args)
	{
	  Scanner scans = new Scanner(System.in);
	      System.out.println("what is its name");
	       String name=scans.next();
		   System.out.print("How many times do you want it");
		   int times=scans.nextInt();
		    while(times<=0)
		 {
	      System.out.println("Please enter a positive number");	
				 }
		        System.out.println("Would you like it horizontally or vertically (1 or 2)");	
		      int current=1;
		          int type=scans.nextInt();				     
		      if(type==1){
		        	while(current<=times)	
		 	System.out.println(" "+name+"#"+current++);
			       	
		 }
		else{
		while(current<=times)
		System.out.print(" "+name+"#"+current++);							    }
	}
	}

