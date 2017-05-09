//***********************************************************************
// distance.java
// Jinhao Chen
//a program to compute the distance between two points
//***********************************************************************


import java.util.Scanner;
import java.text.DecimalFormat;


public class distance
{

    public static void main (String[] args)
    {
      double x1,x2,y1,y2;
      double distance;
      
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter x1:");
	   x1 = scan.nextDouble();
      System.out.println("Please enter y1:");
	   y1 = scan.nextDouble();
      System.out.println("Please enter x2:");
	   x2 = scan.nextDouble();
      System.out.println("Please enter y2:");
	   y2 = scan.nextDouble();
      
      distance = Math.sqrt(Math.pow(x1 - x2 , 2) + Math.pow( y1 - y2 , 2));
      
      DecimalFormat fmt = new DecimalFormat ("0.###");
      
      System.out.println("The distance is: " + fmt.format(distance));
      
      }
      
}




