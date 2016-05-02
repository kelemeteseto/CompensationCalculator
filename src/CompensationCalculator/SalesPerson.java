/*
 * Copyright(C) 2016 Kelemete Seto
 * All rights reserved.
 */
package CompensationCalculator;

/**
 *
 * @author Kelemete Seto
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class SalesPerson
{
  private int numberOfUsers;
  private String userName;
  private double salesAmount;
  private final double baseSalary, salesTarget, eightyPercent, baseCommission, acceleratedCommission;

  SalesPerson()
  {
    baseSalary = 50000;
    salesTarget = 120000;
    eightyPercent = 0.80 * salesTarget;
    baseCommission = 0.15;
    acceleratedCommission = baseCommission * 1.25;
  }
  public int setNumberOfUsers()
  {             
    System.out.print("\n Enter number of users to compare: ");
    while(true)
    {
        String input = getScanner();        
        try
        {
            numberOfUsers = Integer.parseInt(input); // Converts String to int
            return numberOfUsers;
        }
        catch (NumberFormatException e)
        {
            System.out.print("\n Please enter a positive whole number: ");
        }
    }  
  }
  public String setName()
  {
    System.out.print(" Enter name here (alpha only): ");
    while(true)
    {
        String input = getScanner();
        Pattern pattern =  Pattern.compile("^[a-zA-Z]+$");
        Matcher match = pattern.matcher(input);

        if (!match.find())
        {
          System.out.print(" Please re-enter a valid name (alpha only): ");
        } 
        else 
        {
          userName = input.substring(0, 1).toUpperCase() + input.substring(1); // Change first letter to upperCase
          return userName;
        }
    }
  }
  public double setTotalSales()
  {        
    System.out.print(" Enter total sales here (numeric only): ");
    while(true)
    {
        String input = getScanner();        
        try
        {
            salesAmount = Double.parseDouble(input); // Converts String to double
            return salesAmount;
        }
        catch (NumberFormatException e)
        {
            System.out.print(" Please re-enter a valid amount (numeric only): ");
        }
    }  
  }
  public double getCompensation(String userName, double salesAmount)
  {
    double compensation, accelerationCompensation;
        
    compensation = baseSalary + (baseCommission * salesAmount);
    accelerationCompensation = baseSalary + (acceleratedCommission * salesAmount);
    
    if (salesAmount == eightyPercent)
    {
      System.out.println("\t + Total sales did not meet profit margin");
      System.out.println("\t + Total compensation for " + userName + ": " + String.format("$%,.2f", baseSalary));
      return baseSalary;
    }
    else if (isBetween(eightyPercent, salesAmount, salesTarget))
    {
      System.out.println("\t + Total sales within profit margin");
      System.out.println("\t + Earned 15% commission");
      System.out.println("\t + Total compensation for " + userName + ": " + String.format("$%,.2f", compensation));
      return compensation;
    }
    else if (salesAmount >= salesTarget)
    {
      System.out.println("\t + Sales exceeded target for the year");
      System.out.println("\t + Earned 18.75% commission");
      System.out.println("\t + Total compensation for " + userName + ": " + String.format("$%,.2f", accelerationCompensation));
      return accelerationCompensation;
    }
    System.out.println("\t + Total sales below profit margin");
    System.out.println("\t + Total compensation for " + userName + ": " + String.format("$%,.2f", baseSalary));
    return baseSalary;
  }
  public String getScanner()
  {
      Scanner scanner = new Scanner(System.in);
      
      return scanner.next();
  }
  boolean isBetween(double low, double mid, double high)
  {
    return low < mid && mid < high;
  }
}
