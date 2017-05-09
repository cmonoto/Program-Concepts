//********************************************************************************************************************************************
// Quizzes.java
// Jinhao Chen
// Write a program that grades arithmetic quizzes
//********************************************************************************************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Quizzes
{
    public static void main(String[] args)
    {
    String phrase;
    int questions,correct;
    double correctP;
    Scanner scan = new Scanner(System.in);
    
    System.out.print(" Enter the number of questions in this quiz : ");
    questions = scan.nextInt();
    
    int [] key = new int[questions];
    int []answers= new int[questions];
    correct = 0;
    
        for ( int i = 0; i < questions; i++)
      {
         System.out.print(" Enter the correct answer " + (i+1) + " : ");
         key[i] = scan.nextInt();
        

      }
      for ( int i = 0; i < questions; i++)
      {
          System.out.print(" Enter the answer " + (i+1) + " for the quiz to be graded : ");
          answers[i] = scan.nextInt();
          if ( key[i] == answers[i])
              correct++;
      }
      
      NumberFormat fmt = NumberFormat.getPercentInstance();
      
      correctP = correct;
      
      correctP = correctP / questions;
      
      System.out.println(" There are " + correct + " correct answers, and correct percent is " + fmt.format(correctP));
      
      System.out.print("Grade another quiz?(y/n).");
      phrase = scan.next();
      
      
      
      while ( phrase.equals("y"))
      {
      correct = 0;
      for ( int i = 0; i < questions; i++)
      {
          System.out.print(" Enter the answer " + (i+1) + " for the quiz to be graded : ");
          answers[i] = scan.nextInt();
          if ( key[i] == answers[i])
              correct++;
      }
      
      
      
      correctP = correct;
      
      correctP = correctP / questions;
      
      System.out.println(" There are " + correct + " correct answers, and correct percent is " + fmt.format(correctP));
      System.out.print("Grade another quiz?(y/n).");
      phrase = scan.next();
      
      }
      
      
      
      
      
      }
}