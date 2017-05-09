//***************************************************************
// Paint.java
// Jinhao Chen
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{

    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal

        //declare integers length, width, and height;
        int length, width, height;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
	  //declare and initialize Scanner object
        Scanner scan = new Scanner (System.in);
        //Prompt for and read in the length of the room
        System.out.print ("Enter the number of length:");
        length = scan.nextInt();
        //Prompt for and read in the width of the room
        System.out.print ("Enter the number of width:");
        width = scan.nextInt();
        //Prompt for and read in the height of the room
        System.out.print ("Enter the number of height:");
        height = scan.nextInt();
        int door = 20, window = 15;
        double nD, nW;
        
        System.out.print ("Enter the number of doors:");
        nD = scan.nextInt();       
        System.out.print ("Enter the number of windows:");
        nW = scan.nextInt();
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = 2 * length * height + 2 * width * height - nD * door - nW * window;
        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.print ("paint is needed " + paintNeeded);
    }
}

