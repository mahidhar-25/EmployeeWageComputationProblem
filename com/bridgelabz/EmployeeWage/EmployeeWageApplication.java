package com.bridgelabz.EmployeeWage;

import java.util.Scanner;

/*
@desc : user application for employee wage problem
 */
public class EmployeeWageApplication {

    public static final int CREATE_NEW_COMPANY = 1;
    public static final int ADD_NEW_EMPLOYEE = 2 ;
    public static final int REMOVE_OLD_EMPLOYEE = 3;
    public static final int CALCULATE_WAGE_OF_EMPLOYEE = 5;
    public static final int GENERATE_ATTENDANCE = 4;
    public static final int DISPLAY_WAGES = 7;
    public static final int DISPLAY_COMPANY = 8;
    public static final int DISPLAY_EMPLOYEE = 6;
    public static final int EXIT = 10;


    public static void main(String[] args) {


        System.out.println("1. To initialize a  company");
        System.out.println("2. To add new Employee to existing company");
        System.out.println("3. To remove Employee from existing company");
        System.out.println("4. To Generate Random Attendance of Employee");
        System.out.println("5. To calculate wages of an employee");
        System.out.println("6. To display employee details");
        System.out.println("7. To display wages for the respective company");
        System.out.println("8. To display company details");
        System.out.println("10 . To exit");
        System.out.println("choose an option from the above every time : ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        Company company = null;
        Employee employee = null;
        String companyName , employeeId;
        while(option != EXIT){
            switch(option){
                case CREATE_NEW_COMPANY -> {
                    company = Company.getCompanyDetailsFromUser();
                    System.out.println("Company has created");
                }
                case ADD_NEW_EMPLOYEE -> {
                    if(company != null) {
                        System.out.println("Enter  company name  is : ");
                        companyName = input.next();
                        employee = Employee.getEmployeeDetailsFromUser();
                        company.addEmployeeToCompany(employee);
                    }
                }
                case REMOVE_OLD_EMPLOYEE -> {
                    if (company != null) {
                        System.out.println("Enter  company name  is : ");
                        companyName = input.next();
                        System.out.println("Enter employee id is : ");
                        employeeId = input.next();
                        company.removeEmployeeFromCompany(employeeId);
                    }
                }
                case GENERATE_ATTENDANCE -> {
                    if(company != null) {
                        System.out.println("Enter employee id is : ");
                        employeeId = input.next();
                        employee = company.getEmployeeDetailsFromCompany(employeeId);
                        if (employee != null) {
                            company.generateRandomAttendance(employee);
                        }
                    }
                }
                case CALCULATE_WAGE_OF_EMPLOYEE -> {
                    if(company != null) {
                        System.out.println("Enter employee id is : ");
                        employeeId = input.next();
                        employee = company.getEmployeeDetailsFromCompany(employeeId);
                        if (employee != null) {
                            System.out.println("total wage of employee is " + company.getEmployeeWage(employee));
                        }
                    }
                }
                case DISPLAY_EMPLOYEE -> {
                    if(company != null) {
                        System.out.println("Enter employee id is : ");
                        employeeId = input.next();
                        employee = company.getEmployeeDetailsFromCompany(employeeId);
                        if (employee != null) {
                            System.out.println("Employee details are : \n" + employee);
                        }
                    }
                }
                case DISPLAY_WAGES -> {
                    if(company != null) {
                        System.out.println("Wages details are : \n" + company.getWages());
                    }
                }
                case DISPLAY_COMPANY -> {
                    if(company != null) {
                        System.out.println("company details are : \n" + company);
                    }
                }
                default -> System.out.println("choose the correct option from the above");
            }
            System.out.println("choose an option from the above every time : ");
            option = input.nextInt();
        }

    }
}
