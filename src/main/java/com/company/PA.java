package com.company;

public class PA extends Crew {
    int hoursWorked;
    int hourlyPay;

    PA(String name, int earnings, String department, int hoursWorked,  int hourlyPay) {
        super();
        super.name = name;
        super.salary = hoursWorked * hourlyPay;
        super.earnings = earnings;
        super.department = department;
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }
    PA(String name, String department, int hoursWorked, int hourlyPay) {
        super();
        super.name = name;
        super.salary = hoursWorked * hourlyPay;
        super.earnings = 0;
        super.department = department;
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

}
