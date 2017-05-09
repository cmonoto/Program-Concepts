//*******************************************************
// Nim.java
// Jinhao Chen
// A Nim game that is played by two persons with a row of coins. 
//*******************************************************

public class Nim
{
//instance data
    private int nCoins = 21;
    private int player =  1;
 
  //----------------------------------------------
  //Constructor -- initializes nCoins and player
  //----------------------------------------------

    public Nim(int coins, int starter)
    {
      // add your code here
      
      if ( coins < 7 || coins > 21)
         {
         System.out.println("Invalid input, 21 coins is assigned to your game.");
         coins = 21;
         }
      if ( !(starter ==1 || starter ==2))
         {
         System.out.println("Invalid input, player 1 is assigned to be the first.");
         starter = 1;
         }
      nCoins = coins;
      player = starter;

    }

    

  //----------------------------------------------
  //Removes coins from the row.
  //----------------------------------------------

    public void takeCoins(int remove)
    {
	// add your code here
     
      if ( remove > nCoins)
         {
         System.out.println("You can only remove "+ nCoins + " or less from the row.");
         remove = 0;
         }
      if ( remove<1 || remove > 3)
         {
         System.out.println("You can only remove one, two, or three from the row." );
         remove = 0;
         }
         if ( remove !=0)
         {
            if ( player == 1)
              player = 2;
            else 
              player = 1;
          }
      nCoins -= remove;
    }



  //----------------------------------------------
  // Display the game status.
  //----------------------------------------------
    public void gameStatus()
    {
	System.out.println("Number of coins left: " + nCoins);
	System.out.println();
	System.out.print("Player" + player + ", ");
    }

  //----------------------------------------------
  // Returns nCoins.
  //----------------------------------------------
  
    public int getCoins()
    {
	return nCoins ;
    }

  //----------------------------------------------
  // Returns player.
  //----------------------------------------------
  
    public int getPlayer(){

	return player;
    }

}
    
