public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("!!! Welcome to Employee Wage computation problem !!!");
        int attendance = (int) (Math.random() * 2); // 0 for absent, 1 for present


        // Displaying the generated attendance status
        //use case 1
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        //use case 2
        int wagePerHour = 20;
        int workingHoursPerDay = 8;
        //use case 3
        int isPartTime = (int) (Math.random()*2);
        
        int wagePerHourInPartTime = 8;
        int noOfHoursWorked = 1;
        //use case 5
        int workingDays = 20;
        //use case 4
        switch(isPartTime){
            case 1 -> System.out.println("Daily wages for partTime based on working hours : " + workingDays * wagePerHourInPartTime * noOfHoursWorked);
            case 0 -> System.out.println("Daily wages per month is : " + workingDays * wagePerHour * workingHoursPerDay);
            default -> System.out.println("he is not an employee");
        }
    }
}
