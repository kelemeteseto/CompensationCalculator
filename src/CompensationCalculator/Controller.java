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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Controller 
{
    public static void main(String[] args)
    {                                
        Controller userInput = new Controller();
        int numberOfUsers;
        double annualSales;
                
        ArrayList<String> arrayUserNames = new ArrayList<>();
        ArrayList<Double> arrayUserTotals = new ArrayList<>();
        ArrayList<Double> arrayTotalCompensations = new ArrayList<>();              
        
        System.out.print(" Enter number of users to compare: ");
        numberOfUsers = Integer.parseInt(userInput.getScanner());
        for (int count = 1; count <= numberOfUsers; count++)
        {
            annualSales = 0;
            SalesPerson salesInput = new SalesPerson(annualSales);
            
            System.out.print(" Enter name for sales person #" + count + ": ");
            String userName = userInput.getScanner();
            System.out.print(" Enter sales total for " + userName + ": ");
            annualSales = Double.parseDouble(userInput.getScanner());
            
            arrayUserNames.add(userName);
            arrayUserTotals.add(annualSales);
            arrayTotalCompensations.add(salesInput.getCompensation());
        } 
        System.out.println(" Names: " + arrayUserNames);
        System.out.println(" Annual Sales: " + arrayUserTotals);
        System.out.println(" Total Compensation: " + arrayTotalCompensations);
             
          
//        int numberOfUsers = userInput.getNumberOfUsers();
//        
//        ArrayList<String> arrayUserNames = new ArrayList<>();
//        ArrayList<Double> arrayUserTotals = new ArrayList<>();
//        ArrayList<Double> arrayTotalCompensation = new ArrayList<>();
//        ArrayList<String> arrayAllData = new ArrayList<>();
//        
//        double largestCompensation, smallestCompensation;
//        
//        for (int i = 0; i < numberOfUsers; i++)
//        {            
//            String userName = userInput.getUserName();
//            double salesTotal = userInput.getAnnualSales();
//            System.out.println("\n=======================================================\n");
//            
//            arrayUserNames.add(userName);
//            arrayUserTotals.add(salesTotal);
//            arrayTotalCompensation.add(userInput.getCompensation(userName, salesTotal));
//            
//            System.out.println("\n=======================================================\n");
//        }                                
//        
//        largestCompensation = Collections.max(arrayTotalCompensation);
//        smallestCompensation = Collections.min(arrayTotalCompensation);
//        
//        System.out.println(" Data stored in array:");
//        System.out.println("\t + Sales People: " + arrayUserNames);
//        System.out.println("\t + Annual Sales: " + arrayUserTotals);
//        System.out.println("\t + Total Compensation: " + arrayTotalCompensation);
//        System.out.println("\n=======================================================\n");
//        
//        System.out.println(" Top earner and lowest earner:");        
//        System.out.println("\t + Top earner: " + String.format("$%,.2f", largestCompensation));
//        System.out.println("\t + Lowest earner: " + String.format("$%,.2f", smallestCompensation));
//        System.out.println("\n=======================================================\n");
//        
//        System.out.println(" Comparison:");   
//        arrayTotalCompensation.forEach((Double item) -> 
//        {
//            if (!Objects.equals(largestCompensation, smallestCompensation))
//            {
//                System.out.println("\t + " + arrayUserNames + " needs " + String.format("$%,.2f", (largestCompensation - item)) + " in sales");
//            }
//            else 
//            {
//                System.out.println("\t + All totals match");
//            }
//        });
//        System.out.println("\n=======================================================\n");
    }       
    
    public String getScanner() 
    {
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }
}
