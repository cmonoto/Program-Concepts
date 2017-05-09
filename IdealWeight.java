// IdealWeight.java
// Jinhao Chen
// Write a program to compute the ideal weight for both males and females who are over 5 feet tall. 

import java.util.Scanner;

public class IdealWeight
{

    public static void main(String[] args)
    {
    
    int feet, inches;
    
    double total, mweight, fweight;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.print ("Enter the number of feet:");
    feet = scan.nextInt();
    
    System.out.print ("Enter the number of inches:");
    inches = scan.nextInt();
    
    total = 12 * feet - 60 + inches;
    
    mweight = total * 6 + 100;
    
    System.out.println (" the ideal weight for a male is " + mweight);
    
    fweight = total * 5 + 100;
    
    System.out.println (" the ideal weight for a female is " + fweight);
    
    }
    
}
