package com.bridgelabz.EmployeeWage;

/*
@desc :
1. first welcome the employee by displaying message
2. finding employee is part-time or full time by random
3.calculating the attendance for the full month based on the given condition
4. displaying the wages based for daily and monthly based on the type of job
 */
public class EmployeeWageProblem {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 0;
    public static final int WORKING_HOURS_PER_DAY = 8;
    public static final int WORKING_DAYS_IN_MONTH = 20;
    public static final int WAGES_PER_HOUR_FULL_TIME = 20;
    public static final int WAGES_PER_HOUR_PART_TIME = 8;
    public static final int MAX_WORKING_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("!!! Welcome to Employee Wage computation problem !!!");

        //use case 3

        //checking whether employee is part-time or full time

        int isPartTime = (int) (Math.random() * 2);

        /*
        Printing out the employee position
         */
        switch(isPartTime){
            case IS_PART_TIME -> System.out.println("Employee is Part Time");
            case IS_FULL_TIME -> System.out.println("Employee is Full Time");
            default -> System.out.println("he is not an employee");

        }

        // Declaring all the variables

        int attendance;
        int NoOfHoursWorkedPartTime;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;


        //generating every-days attendance , if attended how many hours he worked based on the type of job

        for (int i = 0; i <= 31; i++) {
            if (totalWorkingHours >= MAX_WORKING_HOURS_IN_MONTH) {
                System.out.println("Total working hours has crossed 100");
                break;
            } else if (totalWorkingDays == WORKING_DAYS_IN_MONTH) {
                System.out.println("Total working days has reached 20");
                break;
            }
            //use case 1
            attendance = (int) (Math.random() * 2);
            switch (isPartTime) {
                case IS_PART_TIME -> {
                    if (attendance == 1) {
                        NoOfHoursWorkedPartTime = (int) (Math.random() * 9);
                        totalWorkingDays++;
                        totalWorkingHours += NoOfHoursWorkedPartTime;
                        System.out.println("Day " + i + "( present , " + NoOfHoursWorkedPartTime + "hrs ) ");
                    } else {
                        System.out.println("Day " + i + "( Absent , " + 0 + "hrs) ");
                    }

                }
                case IS_FULL_TIME -> {
                    if (attendance == 1) {
                        totalWorkingDays++;
                        totalWorkingHours += WORKING_HOURS_PER_DAY;
                        System.out.println("Day " + i + "( present , " + WORKING_HOURS_PER_DAY + "hrs) ");
                    } else {
                        System.out.println("Day " + i + "( Absent , " + 0 + "hrs) ");
                    }
                }
                default -> System.out.println("he is not an employee");

            }
        }
        if (totalWorkingHours < MAX_WORKING_HOURS_IN_MONTH && totalWorkingDays < WORKING_DAYS_IN_MONTH) {
            System.out.println("Month has completed");
        }
        //displaying daily , monthly wages based on the type of job
        switch (isPartTime) {
            case IS_PART_TIME -> {
                System.out.println("\nMonthly wages for partTime working, total working hours are " + totalWorkingHours + "\n Monthly wage is : " + totalWorkingHours * WAGES_PER_HOUR_PART_TIME);
                System.out.println("\nDaily wages for partTime based on working hours : " + (totalWorkingHours * WAGES_PER_HOUR_PART_TIME) / totalWorkingDays);
            }
            case IS_FULL_TIME -> {
                System.out.println("\nMonthly wages for full time  working, total working hours are " + totalWorkingHours + "\n Monthly wage is : " + totalWorkingHours * WAGES_PER_HOUR_FULL_TIME);
                System.out.println("\nDaily wages per month is : " + WAGES_PER_HOUR_FULL_TIME * WORKING_HOURS_PER_DAY);
            }
            default -> System.out.println("he is not an employee");
        }
    }
}
