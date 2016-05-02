/*
 * Copyright(C) 2016 Kelemete Seto
 * All rights reserved.
 */
package CompensationCalculator;

/**
 *
 * @author Kelemete Seto
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Controller 
{
    public static void main(String[] args)
    {
        SalesPerson userInput = new SalesPerson();
        
        int numberOfUsers = userInput.setNumberOfUsers();
        
        ArrayList<String> arrayUserNames = new ArrayList<>();
        ArrayList<Double> arrayUserTotals = new ArrayList<>();
        ArrayList<Double> arrayTotalCompensation = new ArrayList<>();
        ArrayList<String> arrayAllData = new ArrayList<>();
        
        double largestCompensation, smallestCompensation;
        
        for (int i = 0; i < numberOfUsers; i++)
        {            
            String userName = userInput.setName();
            double salesTotal = userInput.setTotalSales();
            System.out.println("\n=======================================================\n");
            
            arrayUserNames.add(userName);
            arrayUserTotals.add(salesTotal);
            arrayTotalCompensation.add(userInput.getCompensation(userName, salesTotal));
            
            System.out.println("\n=======================================================\n");
        }                                
        
        largestCompensation = Collections.max(arrayTotalCompensation);
        smallestCompensation = Collections.min(arrayTotalCompensation);
        
        System.out.println(" Data stored in array:");
        System.out.println("\t + Sales People: " + arrayUserNames);
        System.out.println("\t + Annual Sales: " + arrayUserTotals);
        System.out.println("\t + Total Compensation: " + arrayTotalCompensation);
        System.out.println("\n=======================================================\n");
        
        System.out.println(" Top earner and lowest earner:");        
        System.out.println("\t + Top earner: " + String.format("$%,.2f", largestCompensation));
        System.out.println("\t + Lowest earner: " + String.format("$%,.2f", smallestCompensation));
        System.out.println("\n=======================================================\n");
        
        System.out.println(" Comparison:");   
        arrayTotalCompensation.forEach((Double item) -> 
        {
            if (!Objects.equals(largestCompensation, smallestCompensation))
            {
                System.out.println("\t + " + arrayUserNames + " needs " + String.format("$%,.2f", (largestCompensation - item)) + " in sales");
            }
            else 
            {
                System.out.println("\t + All totals match");
            }
        });
        System.out.println("\n=======================================================\n");
    }
}
