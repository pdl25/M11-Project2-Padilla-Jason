package com.company;

public class Director extends Crew {
    double royalty;
    Movie movie;

    Director(String name,  int salary, int earnings, String department) {
        super();
        super.name = name;
        super.salary = salary;
        super.earnings = earnings;
        this.department = department;
    }
    Director(String name,  int salary, String department) {
        super();
        super.name = name;
        super.salary = salary;
        super.earnings = 0;
        this.department = department;
    }

    void setRoyalty(Movie movie){
        this.movie = movie;
        this.royalty = movie.profit * 0.01;
    }
}
