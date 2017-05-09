// ****************************************************************
// Sales.java
// Jinhao Chen
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
   
	
	int sum, max, min,value,sumP,numbers;

	Scanner scan = new Scanner(System.in);
   System.out.print("How many people your want to read?");
   numbers = scan.nextInt();
   
   int[] sales = new int[numbers];
	for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();
	    }

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;
   max= min = sales[0];
   
	for (int i=0; i<sales.length; i++)
	    {
		if (sales[i] > max)
         max = sales[i];
      if (sales[i] < min)
         min = sales[i];
       sum += sales[i];
	    }
    for (int i=0; i<sales.length; i++)
       {
       if ( max == sales[i])
       System.out.println("Salesperson " + (i+1) + " had the highest sale with $" + sales[i]);
       if ( min == sales[i])
       System.out.println("Salesperson " + (i+1) + " had the lowest sale with $" + sales[i]);
       }
       int averageSale = sum / 5;
   
	System.out.println("\nTotal sales: " + sum);
   System.out.println("\nAverage sales: " + averageSale);
   System.out.print("Please Enter a value: ");
   value = scan.nextInt();
   sumP=0;
   for (int i=0; i<sales.length; i++)
   {
      if ( sales[i] > value)
      {
      System.out.println("Salesperson " + (i+1) + " exceeeded the amount " + value + " who had the sale with $" + sales[i]);
      sumP++;
      }
   }
   System.out.println(" There are " +sumP + " salespeople whose sales exceeded the value entered");
    }
}
