package com.bridgelabz.EmployeeWage;

import java.util.ArrayList;
import java.util.Scanner;

/*
@desc : Employee class takes care about the employee individual details , type of job in the company
        employee name and employee id , and keep track of total working days and working hours and it has
        multiple methods as getters and setters to update these above details
        and a function for user input to create an instance of employee class
 */
public class Employee {
    private boolean isFullTime;
    private String employeeName;
    private String employeeId;
    private int totalWorkingDays;
    private int totalWorkingHours;
    private ArrayList<Integer> dailyWorkingHours;


/*
    @desc : markAttendance function will mark the attendance by increase the working hours and working days
    @params : logging hours - integer no of hours worked in a day
    @return : void - no return
     */

    public void markAttendance(int loggingHours){
        totalWorkingHours += loggingHours;
        if(loggingHours > 0) {
            totalWorkingDays++;
        }
        dailyWorkingHours.add(loggingHours);
    }

    /*
    @desc : getTotalWorkingHours , this function return the total working hours of an employee of daily
    @params : no params
    @return : Arraylist<integer> - total working hours of an employee daily
     */

    public ArrayList<Integer> getDailyWorkingHours() {
        return dailyWorkingHours;
    }
    /*
    @desc : getTotalWorkingHours , this function return the total working hours of an employee
    @params : no params
    @return : integer - total working hours of an employee
     */

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    /*
    @desc : getTotalWorkingDays , this function return the total working days of an employee
    @params : no params
    @return : integer - total working days of an employee
     */


    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    /*
    @desc : getEmployeeId , this function return the employee id of an employee
    @params : no params
    @return : string - it will return an employee id
     */

    public String getEmployeeId() {
        return employeeId;
    }

    /*
    @desc : setEmployeeId , sets / updates the employee id
    @params : String - employeeId
    @return : no return
     */

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /*
     @desc : Initializes an Employee object.

     @param employeeId   The unique identifier for the employee.
     @param employeeName The name of the employee.
     @param isFullTime    A boolean indicating whether the employee is full-time.

     @return The newly created Employee object.
     */

    Employee(String employeeId , String employeeName, boolean isFullTime  ) {
        this.isFullTime = isFullTime;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.totalWorkingDays = 0;
        dailyWorkingHours = new ArrayList<>();
    }

    /*
    @desc : this function takes the series of inputs required to create an instance of employee from user
    @params : no params
    @return : return an employee instance by initializing
     */

    public static Employee getEmployeeDetailsFromUser(){
        String employeeId , employeeName ;
        boolean isFullTime;
        Scanner input = new Scanner(System.in);
        System.out.println("enter employee id : ");
        employeeId = input.next();
        System.out.println("enter employee name in single line : ");
        input.nextLine();
        employeeName = input.nextLine();
        System.out.println("is employee full time type(true / false)");
        isFullTime = input.nextBoolean();
        return new Employee(employeeId , employeeName , isFullTime);
    }


    /*
@desc : isFullTime , this function return that employee is an full time or not
@params : no params
@return : boolean - whether full time employee or not
 */
    public boolean isFullTime() {
        return isFullTime;
    }

/*
@desc : setFullTime , this function sets/updates the employee role in company
@params : boolean - isFullTime
@return : no return
 */

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }
/*
@desc : getEmployeeName , this function return that employee name
@params : no params
@return : string - returns the employee name
 */

    public String getEmployeeName() {
        return employeeName;
    }


    /*
    @desc : setEmployeeName , this function sets/updates the employee name
    @params : String - employee name
    @return : no return
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    /*
     @desc :Returns a string representation of the Employee object.
     @params : no params
     @return A string containing the formatted details of the Employee.
     */
    @Override
    public String toString() {
        return "Employee = \n" +
                "{" +
                "   isFullTime = " + isFullTime + ",\n" +
                "   employeeName = " + employeeName + ",\n" +
                "   employeeId = " + employeeId + ",\n" +
                "   totalWorkingDays = " + totalWorkingDays +",\n" +
                '}';
    }
}
