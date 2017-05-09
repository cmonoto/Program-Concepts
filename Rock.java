// ****************************************************************
//   Rock.java
//   Jinhao Chen
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay="";  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine
	                      //computer's play

    Scanner scan = new Scanner(System.in);
	Random generator = new Random();




	//Generate computer's play (0,1,2) 
   
   computerInt = generator.nextInt(3);
   
//Translate computer's randomly generated play to string using if //statements
	if (computerInt == 0)
      computerPlay = ("R");
   else 
    {
      if (computerInt == 1)
      computerPlay =("P");
      else 
      computerPlay = ("S");
     }

//Get player's play from input-- note that this is stored as a string
     System.out.print ("Enter your play (R,P,S,r,p,s): ");
      personPlay = scan.next();


	//Make player's play uppercase for ease of comparison
     
      personPlay = personPlay.toUpperCase();
 

	//Print computer's play

     System.out.println(" Computer's play is : " + computerPlay);

	//See who won.  Use nested ifs 
	if (personPlay.equals(computerPlay))  
	    System.out.println("It's a tie!");
	else 
   { 
     if (personPlay.equals("R"))
	     { 
         if (computerPlay.equals("S"))
		      System.out.println("Rock crushes scissors.  You win!!");
	      else
            System.out.println("Paper covers rock.  Computer win!!");
         }
       else
       {
          if (personPlay.equals("P"))
          { 
            if (computerPlay.equals("S"))
		         System.out.println("Scissors cuts paper.  Computer win!!");
	         else
               System.out.println("Paper covers rock.  You win!!");
           }
           else 
            {
               if (computerPlay.equals("P"))
                  System.out.println("Scissors cuts paper.  You win!!");
               else
                  System.out.println("Rock crushes scissors. Computer win!!");
             }
         }
      }
                  


		//...  Fill in rest of code
   }
}