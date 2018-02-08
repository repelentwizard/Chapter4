/*
Tyler Smith
Java Per.4
Assignment = edb5 
*/
import java.io.*;
import java.util.Scanner;
import java.text.*;
public class edb5
{
        public static void main(String[] args)
        {
	int bond = 007;
	DecimalFormat fbond = new DecimalFormat ("000.");
	DecimalFormat ftenbond = new DecimalFormat ("00.0");
 	DecimalFormat fcubedbond = new DecimalFormat ("000.");
	int tenbond = bond * 10;
	int cubedbond = bond * bond * bond;
	System.out.println("bond equals " + fbond.format(bond));
	System.out.println("bond times 10 eqauls " + ftenbond.format(tenbond));
	System.out.println("bond cubed equals " + fcubedbond.format(cubedbond));
	}
}
