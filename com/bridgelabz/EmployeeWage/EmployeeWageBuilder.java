package com.bridgelabz.EmployeeWage;

import java.util.Scanner;



/*
desc : EmployeeWageBuilder class takes care of the wages that will be given by company to the employee
       it takes some final limits like max working hours per day , in a month , what are wages for full time employee,
       and for part-time employee and has method to take inputs from user and create an instance of employee wage builder,
       and it also calculates the amount of wage for a particular employee based on the company info and working hours
 */


public class EmployeeWageBuilder implements WageBuilder {
    private final int WORKING_HOURS_PER_DAY ;
    private final int WORKING_DAYS_IN_MONTH ;
    private final int WAGES_PER_HOUR_FULL_TIME ;
    private final int WAGES_PER_HOUR_PART_TIME ;
    private final int MAX_WORKING_HOURS_IN_MONTH ;
    /*
     @desc : Constructs an instance of EmployeeWageBuilder with the provided parameters.

      @param WORKING_HOURS_PER_DAY The number of working hours per day.
      @param WORKING_DAYS_IN_MONTH The number of working days in a month.
      @param WAGES_PER_HOUR_FULL_TIME The wages per hour for full-time employees.
      @param WAGES_PER_HOUR_PART_TIME The wages per hour for part-time employees.
      @param MAX_WORKING_HOURS_IN_MONTH The maximum working hours allowed in a month.
      @return : no return
     */
    public EmployeeWageBuilder(int WORKING_HOURS_PER_DAY, int WORKING_DAYS_IN_MONTH, int WAGES_PER_HOUR_FULL_TIME, int WAGES_PER_HOUR_PART_TIME, int MAX_WORKING_HOURS_IN_MONTH) {
        this.WORKING_HOURS_PER_DAY = WORKING_HOURS_PER_DAY;
        this.WORKING_DAYS_IN_MONTH = WORKING_DAYS_IN_MONTH;
        this.WAGES_PER_HOUR_FULL_TIME = WAGES_PER_HOUR_FULL_TIME;
        this.WAGES_PER_HOUR_PART_TIME = WAGES_PER_HOUR_PART_TIME;
        this.MAX_WORKING_HOURS_IN_MONTH = MAX_WORKING_HOURS_IN_MONTH;
    }

    /*
@desc : this function takes the series of inputs required to create an instance of employeeWageBuilder from user
@params : no params
@return : return an employee wage builder instance by initializing
 */
    public static EmployeeWageBuilder getWageDetailsFromCompany(){
        int workingHoursPerDay , workingDaysInMonth , wagesPerHourFullTime , wagePerHourPartTime , maxWorkingHoursInMonth;
        Scanner input = new Scanner(System.in);
        System.out.println("enter working hours per day : ");
        workingHoursPerDay = input.nextInt();
        System.out.println("enter working days in month : ");
        workingDaysInMonth = input.nextInt();
        System.out.println("enter wages per hour for full time : ");
        wagesPerHourFullTime = input.nextInt();
        System.out.println("enter wages per hour for part time  : ");
        wagePerHourPartTime = input.nextInt();
        System.out.println("enter max working hours in month : ");
        maxWorkingHoursInMonth = input.nextInt();
        return new EmployeeWageBuilder(workingHoursPerDay , workingDaysInMonth , wagesPerHourFullTime , wagePerHourPartTime , maxWorkingHoursInMonth);
    }

    /*
     @desc:  Retrieves the constant representing the working hours per day.
     @param : no params
      @return The constant value representing working hours per day.
     */
    public int getWORKING_HOURS_PER_DAY() {
        return WORKING_HOURS_PER_DAY;
    }
    /*
     @desc:  Retrieves the constant representing the number of working days in a month.
     @param : no params
      @return The constant value representing working days in a month.
     */

    public int getWORKING_DAYS_IN_MONTH() {
        return WORKING_DAYS_IN_MONTH;
    }
    /*
     @desc:  Retrieves the constant representing wages per hour for full-time employees.
     @param : no params
      @return The constant value representing wages per hour for full-time employees.
     */
    public int getWAGES_PER_HOUR_FULL_TIME() {
        return WAGES_PER_HOUR_FULL_TIME;
    }
    /*
     @desc:  Retrieves the constant representing wages per hour for part-time employees.
     @param : no params
      @return The constant value representing wages per hour for part-time employees.
     */
    public int getWAGES_PER_HOUR_PART_TIME() {
        return WAGES_PER_HOUR_PART_TIME;
    }
    /*
     @desc:  Retrieves the constant representing the maximum working hours allowed in a month.
     @param : no params
      @return The constant value representing the maximum working hours in a month.
     */
    public int getMAX_WORKING_HOURS_IN_MONTH() {
        return MAX_WORKING_HOURS_IN_MONTH;
    }

    /*
    @desc :  this function calculate the wages of an employee based on the working hours
             and based on part-time / full time and return the total amount
     @params : boolean - whether an employee is a full time or part-time
     @return : double - calculate the total amount
     */

    public double calculatgeWagesBasedHours(boolean isFullTime , int workingHours){
        if(isFullTime){
            return (double)workingHours * WAGES_PER_HOUR_FULL_TIME;
        }

        return (double)workingHours * WAGES_PER_HOUR_PART_TIME;

    }

       /*
     @desc :Returns a string representation of the EmployeeWageBuilder object.
     @params : no params
     @return A string containing the formatted details of the EmployeeWage.
     */

    @Override
    public String toString() {
        return "EmployeeWage = \n" +
                "{" +
                "   WORKING_HOURS_PER_DAY=" + WORKING_HOURS_PER_DAY + ",\n" +
                "   WORKING_DAYS_IN_MONTH=" + WORKING_DAYS_IN_MONTH + ",\n" +
                "   WAGES_PER_HOUR_FULL_TIME=" + WAGES_PER_HOUR_FULL_TIME + ",\n" +
                "   WAGES_PER_HOUR_PART_TIME=" + WAGES_PER_HOUR_PART_TIME + ",\n" +
                "   MAX_WORKING_HOURS_IN_MONTH=" + MAX_WORKING_HOURS_IN_MONTH + ",\n" +
                '}';
    }
}
