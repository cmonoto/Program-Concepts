//*******************************************************
// FlexibleAccount.java
// Jinhao Chen
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*******************************************************
import java.util.Random;

public class FlexibleAccount
{
  private double balance;
  private String name;
  private long acctNum;

  Random generator = new Random();
  
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public FlexibleAccount(String name)
  {
    this.balance = 0;
    this.name = name;
    this.acctNum = generator.nextInt(3000)+3000;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(int amount, int fee)
  {
    if (balance >= amount)
       {
       balance -= amount;
       balance -= fee;
       }
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }


  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
	return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance; 
  }
}



