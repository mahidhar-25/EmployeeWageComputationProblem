package com.bridgelabz.EmployeeWage;


import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    public static final int PRESENT = 1;
    private String companyName;
    public ArrayList<Employee> employees;
    private EmployeeWageBuilder wages;
    private double totalWagesOfCompany;

    /*
    @desc : it calculate the total wages given in a company for all the employees and return in double value
    @params : no params
    @return : double - total wages of a company
    */


    public double getTotalWagesOfCompany(){
        for(Employee user : employees){
            totalWagesOfCompany += getWages().calculatgeWagesBasedHours(user.isFullTime() , user.getTotalWorkingHours());
        }
        return totalWagesOfCompany;
    }

        /*
    @desc : it calculate the total wages given in a company for the employees and return in double value
    @params : Employee - employee instance
    @return : double - total wages of a employee
    */

    public double getEmployeeWage(Employee employee){
          return getWages().calculatgeWagesBasedHours(employee.isFullTime() , employee.getTotalWorkingHours());
    }

    /*
    @desc : constructor initializes the company instance
    @params - string : company name
    @params - EmployeeWageBuilder : wages standards of a company
    @return : no return
     */
    public Company(String companyName, EmployeeWageBuilder wages) {
        this.companyName = companyName;
        this.wages = wages;
        employees = new ArrayList<>();
    }

    /*
@desc : this function takes the series of inputs required to create an instance of company from user
@params : no params
@return : return an company instance by initializing
     */
    public static Company getCompanyDetailsFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter company name : ");
        String companyName = input.next();
        EmployeeWageBuilder wages = EmployeeWageBuilder.getWageDetailsFromCompany();
        return new Company(companyName , wages);
    }

    /*
    @desc : new employee will added to the collect of employee inside a company
    @params -  Employee : new employee with initializing
    @return : no return
     */
    public void addEmployeeToCompany(Employee newEmployee){
        employees.add(newEmployee);
        System.out.println("Employee is added to the company");
    }

/*
@desc :  this function will find out the employee by taking employee id
         as a param in the collection of employee inside a company
@params - String : employee id
@return - Employee - returns an matching instance of employee otherwise return a null

 */
    public Employee getEmployeeDetailsFromCompany(String employeeId){
        for(Employee user : employees){
            if(user.getEmployeeId().equals(employeeId)){

                return user;
            }
        }
        return null;
    }
 /*
@desc :  this function will remove the employee by taking employee id
         as a param in the collection of employee inside a company
@params - String : employee id
@return - void - no return

 */

    public void removeEmployeeFromCompany(String employeeId){
        for(Employee user : employees){
            if(user.getEmployeeId().equals(employeeId)){
                System.out.println("Employee is removed from the company");
                employees.remove(user);
                return;
            }
        }
    }

    /*
    @desc : it generates random attence and random working hours for a part time and updates the database
    @params :Employee - an employee instance
    @return : no return;
     */

    public void generateRandomAttendance(Employee employee){
        for(int i=0;i<31;i++){
            if (employee.getTotalWorkingDays() >= getWages().getWORKING_DAYS_IN_MONTH()) {
                System.out.println("Total working days has reached ");
                break;
            } else if (employee.getTotalWorkingHours() == getWages().getMAX_WORKING_HOURS_IN_MONTH()) {
                System.out.println("Total working hours has crossed");
                break;
            }

            int attendance = (int)(Math.random()*2);

            if(attendance == PRESENT){
                if(employee.isFullTime()){
                    employee.markAttendance(getWages().getWORKING_HOURS_PER_DAY());
                }else{
                    int workingPartTimeHours = (int)(Math.random()*getWages().getWORKING_HOURS_PER_DAY());
                    employee.markAttendance(workingPartTimeHours);
                }
            }
        }
    }

/*
@desc : it gives the company name
@param : no params
@return - String : company name
 */

    public String getCompanyName() {
        return companyName;
    }
    /*
    @desc : it sets/updates the company name
    @param -String : company name
    @return - no return
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    /*
    @desc : it sets/updates the wages inside the company
    @param -EmployeeWageBuilder : wages standard of a company
    @return - no return
     */
    public void setWages(EmployeeWageBuilder wages) {
        this.wages = wages;
    }

    /*
@desc : it gives the collection of all employees
@param : no params
@return - ArrayList<Employee> : returns the collection of employees
 */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    /*
@desc : it gives the wages of a company for employees
@param : no params
@return - ArrayList<EmployeeWageBuilder> : returns wages of employees
 */
    public EmployeeWageBuilder getWages() {
        return wages;
    }

    /*
@desc :Returns a string representation of the company object.
@params : no params
@return A string containing the formatted details of the company.
*/
    @Override
    public String toString() {
        return "Company = \n" +
                "{" +
                "   companyName = " + companyName + ",\n" +
                "   employees = " + employees + ",\n" +
                "   wages = " + wages + "\n" +
                '}';
    }
}
