/*
Tyler Smith
Java Per. 4
Assignment = eled3
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class eled3
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	String name = s.nextLine();
	int count = 1;
	while(count <= 11)
	{
		count++;
		if(name.charAt(count) == 'a')
		{
			break;
		}
		else if(name.charAt(count) == 'A')
		{
			break;
		}
	}
			System.out.println(name + " ");	
	
	}
	}
