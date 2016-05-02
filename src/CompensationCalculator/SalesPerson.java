/*
 * Copyright(C) 2016 Kelemete Seto
 * All rights reserved.
 */
package CompensationCalculator;

/**
 *
 * @author Kelemete Seto
 */

class SalesPerson 
{

    private int numberOfUsers;
    private String userName;
    private double annualSales;
    private final double baseSalary, salesTarget, eightyPercent, 
            baseCommission, acceleratedCommission;

    SalesPerson(double annualSales) 
    {
        this.baseSalary(50000);
        this.salesTarget(120000);
        this.eightyPercent(0.80 * salesTarget);
        this.baseCommission(0.15);
        this.acceleratedCommission(1.25 * baseCommission);
    }

    public void setNumberOfUsers(int numberOfUsers) 
    {
        this.numberOfUsers = numberOfUsers;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public void setAnnualSales(double annualSales) 
    {
        this.annualSales = annualSales;
    }

    public int getNumberOfUsers() 
    {
        return numberOfUsers;
    }

    public String getUserName() 
    {
        return userName;
    }

    public double getAnnualSales() 
    {
        return annualSales;
    }

    public double getBaseSalary() 
    {
        return baseSalary;
    }

    public double getSalesTarget() 
    {
        return salesTarget;
    }

    public double getEightyPercent() 
    {
        return eightyPercent;
    }

    public double getBaseCommission() 
    {
        return baseCommission;
    }

    public double getAcceleratedCommission() 
    {
        return acceleratedCommission;
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
