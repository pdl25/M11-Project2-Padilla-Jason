package com.company;

public class Person {
    String name;
    int salary;
    int earnings = 0;
    Person() {}
    Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    Person(String name, int salary, int earnings) {
        this.name = name;
        this.salary = salary;
        this.earnings = earnings;
    }

    void getPaid() {
        this.earnings += this.salary;
    }
}
