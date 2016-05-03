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
    private double annualSales, baseSalary, salesTarget, percentOfTarget, 
            baseCommission, acceleratedCommission, compensation;
    
    /** 
     * Constructor for SalesPerson that passes annualSales as an argument
     * @param annualSales 
     */
    SalesPerson(Double annualSales) 
    {
        this.setBaseSalary(50000);        
        this.setSalesTarget(120000);
        this.setPercentOfTarget(0.80 * salesTarget);
        this.setBaseCommission(0.15);
        this.setAcceleratedCommission(1.25 * baseCommission);
        this.setCompensation(baseSalary, annualSales, salesTarget, 
                percentOfTarget, baseCommission, acceleratedCommission);
    }
    
    /**
     * Base salary as defined in the constructor
     * @param baseSalary
     */
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }
    /**
     * Get method to return the base salary
     * @return baseSalary;
     */
    public double getBaseSalary()
    {
        return baseSalary;
    }     
        
    /**
     * Sales target as defined in the constructor
     * @param salesTarget
     */
    public void setSalesTarget(double salesTarget)
    {
        this.salesTarget = salesTarget;
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
     * Eighty percent of target sales as defined in constructor
     * @param percentOfTarget
     */
    public void setPercentOfTarget(double percentOfTarget)
    {
        this.percentOfTarget = percentOfTarget;
    }
    /**
     * Get method to return eighty percent of annual sales
     * @return percentOfTarget
     */
    public double getPercentOfTarget() 
    {
        return percentOfTarget;
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
     * Get method to return number of users
     * @return numberOfUsers
     */
    public int getNumberOfUsers() 
    {
        return numberOfUsers;
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
     * Get method to return username from input
     * @return userName
     */
    public String getUserName() 
    {
        return userName;
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
     * Get method to return annual sales from input
     * @return annualSales
     */
    public double getAnnualSales() 
    {
        return annualSales;
    }
    
    /**
     * Base commission as defined in constructor
     * @param baseCommission
     */
    public void setBaseCommission(double baseCommission)
    {
        this.baseCommission = baseCommission;
    }
    /**
     * Get method to return baseCommission
     * @return baseCommission
     */
    public double getBaseCommission() 
    {
        return baseCommission;
    }
    
    /**
     * Accelerated commission as defined in constructor
     * @param acceleratedCommission
     */
    public void setAcceleratedCommission(double acceleratedCommission) 
    {
        this.acceleratedCommission = acceleratedCommission;
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
     * Setter for compensation
     * @param baseSalary
     * @param annualSales
     * @param salesTarget
     * @param eightyPercent
     * @param baseCommission
     * @param acceleratedCommission 
     */
    public void setCompensation(
            double baseSalary,
            double annualSales,
            double salesTarget,
            double percentOfTarget,
            double baseCommission,
            double acceleratedCommission) 
    {
        
        this.compensation = baseSalary + (baseCommission * annualSales);
    }
    /**
     * Get method to return compensation
     * 
     * if annualSales less than or equal to 80% of salesTarget, 
     * return compensation = baseSalary
     * 
     * if annualSales greater than 80% of salesTarget and less than salesTarget, 
     * return compensation = baseSalary + (baseCommission * annualSales)
     * 
     * if annualSales greater than or equal to salesTarget, 
     * return compensation = baseSalary + (acceleratedCommission * annualSales)
     * 
     * @return compensation
     */
    public double getCompensation() 
    {   
        if (annualSales <= percentOfTarget)
        {
            baseCommission = 0;            
            return compensation;
        }
        else if (isBetween(percentOfTarget, annualSales, salesTarget))
        {            
            return compensation;
        }
        else
        {
            compensation = baseSalary + (acceleratedCommission * annualSales);
            return compensation;
        }
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
