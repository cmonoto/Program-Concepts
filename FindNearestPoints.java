//**************************************************************************************************************************************
// FindNearestPoints.java
// Jinhao Chen
// Write a program that computes the distances between all pair of points and find the one with the minimum distance
//**************************************************************************************************************************************
import java.util.Scanner;

public class FindNearestPoints
{
    public static void main(String[] args)
    {
    int numpoints;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of the points :");
    numpoints = scan.nextInt();
    
    int [][] x = new int[numpoints][2];
    int [][] y = new int[numpoints][2];
    
    for ( int i = 0; i < numpoints ; i++)
      {
      System.out.print("Please enter the x of point " +(i+1)+ " :");
      x[i][0] = scan.nextInt();
      System.out.print("Please enter the y of point " +(i+1)+ " :");
      y[i][1] = scan.nextInt();
      }
    int p1 = 0,  p2= 1;
    double shortestDistance =Math.sqrt(((x[p1][0] - x[p2][0]) * (x[p1][0] - x[p2][0])) + ((y[p1][1] - y[p2][1]) * (y[p1][1] - y[p2][1])));
        
        for (int i = 0; i < numpoints; i++) 
        {
        for (int j = i + 1; j < numpoints; j++)
         {
            double distance = Math.sqrt(((x[i][0] - x[j][0]) * (x[i][0] - x[j][0])) + ((y[i][1] - y[j][1]) * (y[i][1] - y[j][1])));

            if (shortestDistance > distance) 
               {
                p1 = i;
                p2 = j;
                shortestDistance = distance;
                }
         }
        }
      System.out.println("The closest points are " + "(" + x[p1][0] + "," + y[p1][1] + ") and (" + x[p2][0] + "," + y[p2][1] + ")");
      System.out.println("The shortest distance is " + shortestDistance);

    
    }
}