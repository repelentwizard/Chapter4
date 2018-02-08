/*
Tyler Smith
Java Per.4
Assignment = edb1
*/
import java.io.*;
import java.util.Scanner;
public class edb1
{
        public static void main(String[] args)
        {
	Scanner s = new Scanner(System.in);
	System.out.println("What year is it?");
	int IntegerNumber = s.nextInt();
	int Final = IntegerNumber - 87;
	System.out.println("Four score and seven years ago was " + Final);
	}
}
