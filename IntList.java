// An (unsorted) integer list class with a method to add an
// integer to the list and a toString method that returns the contents
// of the list with indices.
// Jinhao Chen
// ****************************************************************
public class IntList
{
   private int[] list;
   private int numElements = 0;
   //-------------------------------------------------------------
   // Constructor -- creates an integer list of a given size.
   //-------------------------------------------------------------
   public IntList(int size)
   {
      list = new int[size];
   }
   //------------------------------------------------------------
   // Adds an integer to the list. If the list is full,
   // prints a message and does nothing.
   //------------------------------------------------------------
   public void add(int value)
   {
      if (numElements == list.length)
      System.out.println("Can't add, list is full");
      else
      {
         list[numElements] = value;
         int x;
         for ( int i = 0; i <numElements; i++)
             {
               if (list[i] > list [numElements])
                  {  
                     x = list[numElements];
                     list[numElements] = list[i];
                     list[i] = x;
                   } 
             }
             numElements++;
      }
      
   }
   
   //-------------------------------------------------------------
   // Returns a string containing the elements of the list with their
   // indices.
   //-------------------------------------------------------------
   public String toString()
   {
      String returnString = "";
      for (int i=0; i<numElements; i++)
         returnString += i + ": " + list[i] + "\n";
      return returnString;
   }
}

