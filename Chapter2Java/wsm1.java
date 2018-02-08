/*
Tyler Smith
Java Per.4
Assignment = wsm1
*/
import java.io.*;
import java.util.Scanner;
public class wsm1 
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("How many players?");
	int players = s.nextInt();
	int teams = players / 7;
	int leftover = players % 7;
	System.out.println("There will be " + teams + " teams with " + leftover + " players left over.");	


	}
}
