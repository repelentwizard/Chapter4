/*
Tyler Smith
Java Per.4
Assignment = edb6 
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class edb6
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = s.nextLine();
	System.out.println("What is your favorite color?");
	String color = s.nextLine();
	System.out.println(name + ", did you ever think of dying your hair " + color);


	}
}
