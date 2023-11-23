
/*
@desc :
1. first welcome the employee by displaying message
2. finding employee is part-time or full time by random
3.calculating the attendance for the full month based on the given condition
4. displaying the wages based for daily and monthly based on the type of job
 */
public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("!!! Welcome to Employee Wage computation problem !!!");

        //use case 3
        /*
        checking whether employee is part-time or full time
         */
        int isPartTime = (int) (Math.random()*2);

        /*
        Printing out the employee position
         */
        if (isPartTime == 1) {
            System.out.println("Employee is Part Time");
        } else {
            System.out.println("Employee is Full Time");
        }
        /*
        Declaring all the variables
         */
        int attendance;
        int NoOfHoursWorkedPartTime;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int workingHoursPerDay = 8;
        int wagePerHour = 20;
        int wagePerHourPartTime = 8;

        /*
        generating every-days attendance , if attended how many hours he worked based on the type of job
         */
        for(int i=0;i<=31;i++){
            if(totalWorkingHours >= 100 ){
                System.out.println("Total working hours has crossed 100");
                break;
            }else if(totalWorkingDays == 20){
                System.out.println("Total working days has reached 20");
                break;
            }
            //use case 1
            attendance = (int) (Math.random()*2);
            if(isPartTime == 1){
                if(attendance == 1) {
                    NoOfHoursWorkedPartTime = (int) (Math.random() * 9);
                    totalWorkingDays++;
                    totalWorkingHours += NoOfHoursWorkedPartTime;
                    System.out.println("Day " + i + "( present , " + NoOfHoursWorkedPartTime + "hrs ) ");
                }else{
                    System.out.println("Day " + i + "( Absent , " + 0 + "hrs) ");
                }
            }else{
                if(attendance == 1){
                    totalWorkingDays++;
                    totalWorkingHours += workingHoursPerDay;
                    System.out.println("Day " + i + "( present , " + workingHoursPerDay + "hrs) ");
                }else{
                    System.out.println("Day " + i + "( Absent , " + 0 + "hrs) ");
                }
            }

        }
        if(totalWorkingHours <100 && totalWorkingDays<20){
            System.out.println("Month has completed");
        }
      //displaying daily , monthly wages based on the type of job
        switch(isPartTime){
            case 1 -> {
                System.out.println("\nMonthly wages for partTime working, total working hours are " + totalWorkingHours + "\n Monthly wage is : " + totalWorkingHours*wagePerHourPartTime);
                System.out.println("\nDaily wages for partTime based on working hours : " + (totalWorkingHours*wagePerHourPartTime)/totalWorkingDays);
            }
            case 0 -> {
                System.out.println("\nMonthly wages for full time  working, total working hours are " + totalWorkingHours + "\n Monthly wage is : " + totalWorkingHours*wagePerHour);
                System.out.println("\nDaily wages per month is : " +  wagePerHour * workingHoursPerDay);
            }
            default -> System.out.println("he is not an employee");
        }
    }
}
