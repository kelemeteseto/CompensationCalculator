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
    
    /** 
     * Constructor for SalesPerson that passes annualSales as an argument
     * @param annualSales 
     */
    SalesPerson(double annualSales) 
    {
        this.baseSalary(50000);
        this.salesTarget(120000);
        this.eightyPercent(0.80 * salesTarget);
        this.baseCommission(0.15);
        this.acceleratedCommission(1.25 * baseCommission);
    }
    
    /**
     * Number of users to compare
     * @param numberOfUsers 
     */
    public void setNumberOfUsers(int numberOfUsers) 
    {
        this.numberOfUsers = numberOfUsers;
    }
    
    /**
     * Username passed in from input
     * @param userName 
     */
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }
    
    /**
     * Annual sales passed in from input
     * @param annualSales 
     */
    public void setAnnualSales(double annualSales) 
    {
        this.annualSales = annualSales;
    }
    
    /**
     * Get method to return number of users
     * @return numberOfUsers
     */
    public int getNumberOfUsers() 
    {
        return numberOfUsers;
    }
    
    /**
     * Get method to return username from input
     * @return userName
     */
    public String getUserName() 
    {
        return userName;
    }
    
    /**
     * Get method to return annual sales from input
     * @return annualSales
     */
    public double getAnnualSales() 
    {
        return annualSales;
    }
    
    /**
     * Get method to return base salary 
     * @return baseSalary
     */
    public double getBaseSalary() 
    {
        return baseSalary;
    }
    
    /**
     * Get method to return the sales target
     * @return salesTarget
     */
    public double getSalesTarget() 
    {
        return salesTarget;
    }
    
    /**
     * Get method to return eighty percent of annual sales
     * @return eightyPercent
     */
    public double getEightyPercent() 
    {
        return eightyPercent;
    }
    
    /**
     * Get method to return base commission 
     * @return baseCommission
     */
    public double getBaseCommission() 
    {
        return baseCommission;
    }
    
    /**
     * Get method to return the accelerated commission
     * @return acceleratedCommission
     */
    public double getAcceleratedCommission() 
    {
        return acceleratedCommission;
    }
    
    /**
     * Get method to return scanner
     * @return scanner.next()
     */
    public String getScanner() 
    {
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }
    
    /**
     * Boolean method to test conditional between statements
     * @param low
     * @param mid
     * @param high
     * @return 
     */
    boolean isBetween(double low, double mid, double high) 
    {
        return low < mid && mid < high;
    }

}
