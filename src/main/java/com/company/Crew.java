package com.company;

public class Crew extends Person {
    String department;
    Crew() {

    }
    Crew(String name,  int salary, int earnings, String department) {
        super();
        super.name = name;
        super.salary = salary;
        super.earnings = earnings;
        this.department = department;
    }
    Crew(String name,  int salary, String department) {
        super();
        super.name = name;
        super.salary = salary;
        super.earnings = 0;
        this.department = department;
    }
}
