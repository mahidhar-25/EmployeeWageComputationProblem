public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("!!! Welcome to Employee Wage computation problem !!!");
        int attendance = (int) (Math.random() * 2); // 0 for absent, 1 for present

        // Displaying the generated attendance status
        //usecase 1
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        //usecase 2
        int wagePerHour = 20;
        int workingHoursPerDay = 8;
        if (attendance == 1) {
            System.out.println("Daily wages per day is : " + wagePerHour * workingHoursPerDay);
        }
        //use case 3
        boolean partTime = false;
        int wagePerHourInPartTime = 8;
        int noOfHoursWorked = 0;
        if (partTime == true) {
            System.out.println("Daily wages for partTime based on working hours : " + wagePerHourInPartTime * noOfHoursWorked);
        }
    }
}
