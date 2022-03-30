package com.company;

public class Actor extends Person{
    String role;
    Actor(String name,  int salary, int earnings, String role) {
        super();
        super.name = name;
        super.salary = salary;
        super.earnings = earnings;
        this.role = role;
    }
    Actor(String name,  int salary, String role) {
        super();
        super.name = name;
        super.salary = salary;
        super.earnings = 0;
        this.role = role;
    }
}
