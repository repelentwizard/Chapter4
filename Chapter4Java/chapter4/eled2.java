/*
Tyler Smith
Java Per. 4
Assignment = eled2
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class eled2
{
	public static void main(String[] args)
	{
	String puppy="DipStick"; 
	int count = -1; 
	while (count < 7)
	{
	count++;
	if ( puppy.charAt(count) =='c')
	continue; 
	System.out.println(puppy.charAt(count));
	}
	System.out.println("Isn't this puppy a cutie!!"); 
	}
}
