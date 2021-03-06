// ****************************************************************
//   Critter.java
//   Jinhao Chen
//   Define a Critter class. 
// ****************************************************************

public class Critter
{
    //declare instance data 

    private int hunger = 0;
    private int boredom = 0;
    
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------

    public Critter()
    {
	System.out.println("A new critter has been born!");
     	
    }

    //-----------------------------------------------
    //greet: print a greeting message with the hunger level and 
	// the boredom level.
    //-----------------------------------------------
    public void greet()
    {
	System.out.println("Hi, I'm a critter. My hunger level is " + hunger + " and my boredom level is " + boredom + ".");
    }
 
    //-----------------------------------------------
    //getBoredom: return the boredom level
    //-----------------------------------------------

   public int getBoredom()
    {
	return boredom;
    }



    //-----------------------------------------------
    //getHunger: return the hunger level
    //-----------------------------------------------
    //add header for getHunger
    public int getHunger()
    {
  	//add body of getHunger
      return hunger;
    }

    //-----------------------------------------------
    //getMood: return the mood as the addition of hunger
    // level and the boredom level
    //-----------------------------------------------

    public int getMood()
    {
	return hunger + boredom;
    }

    //-----------------------------------------------
    //passTime: increase the hunger level and the boredom
	// level by 1
    //-----------------------------------------------

    public void passTime()
    {
        hunger++;
        boredom++;
    }

    //-----------------------------------------------
    //eat: decrease the hunger level by 3 and set it to 0 if
  	// it is less than 0
    //-----------------------------------------------

    public void eat()
    {
    	System.out.println("Brruppp");
	
	// add your code here
      hunger-=3;
      if ( hunger < 0)
         hunger = 0;
	
    }

	
    //-----------------------------------------------
    //play: decrease the boredom level by 3 and set it to 0 if
  	// it is less than 0
    //-----------------------------------------------
    //add header for play
    public void play()
    {
	//add body of play
      System.out.println("playing");
      boredom -= 3;
      if (boredom < 0)
         boredom = 0;
    }

    //-----------------------------------------------
   // talk: print how the critter feel, which can be mad (if mood > 15), 
   // frustrated (if mood > 10 and mood <= 15), ok (if mood > 5 and mood 
   // <= 10), or happy (if mood <= 5). 
   //-----------------------------------------------
   public void talk()
    {
    int mood = getMood();
    if ( mood > 15)
        System.out.println("I am so mad!!!!");
    else 
    if (mood > 10 )
        System.out.println("Frustrated");
    else
    if (mood > 5)
         System.out.println(" I am feel ok");
     else
         System.out.println("I am so happy!!!!!");
    

    }
}
