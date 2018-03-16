/*
Tyler Smith
Java Per. 4
Assignment = dw4 
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class dw4
{
	public static void main(String[] args)
	{
	int count = 2;
	do
	{
	if(count % 2 == 0)
	{
	System.out.print(count + " ");
		count++;
	}
	else
	{
	count++;
	}
	}
	while(count <= 40);
	}
}
