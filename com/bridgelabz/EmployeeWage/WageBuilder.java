package com.bridgelabz.EmployeeWage;

public interface WageBuilder {
      int getWORKING_HOURS_PER_DAY() ;
     int getWORKING_DAYS_IN_MONTH();
     int getWAGES_PER_HOUR_FULL_TIME();
     int getWAGES_PER_HOUR_PART_TIME();
     int getMAX_WORKING_HOURS_IN_MONTH();
     double calculatgeWagesBasedHours(boolean isFullTime , int workingHours);
     String toString();
}
