package com.company;

import java.util.ArrayList;

public class Movie {
    String title;
    String genre;
    Director director;
    String length;
    int budget;
    int moneySpent;
    int moneyEarned;
    int profit;
    ArrayList<Actor> actors = new ArrayList<Actor>();
    ArrayList<Crew> crew = new ArrayList<Crew>();

    Movie(String title, String genre, String length, int budget, int moneyEarned) {
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.budget = budget;
        this.moneySpent = moneySpent;
        this.moneyEarned = moneyEarned;
    }
     void setDirector(Director director) {
        this.director = director;
     }

     void addActor(Actor actor) {
        this.actors.add(actor);
     }

     void addCrewMember(Crew crewMember) {
        this.crew.add(crewMember);
     }

     void Payday() {
        int currentMoney = 0;
        for (Actor actor: this.actors) {
            actor.getPaid();
            currentMoney +=  actor.salary;
        }
        for (Crew crew: this.crew) {
             crew.getPaid();
             currentMoney +=  crew.salary;
        }
        this.director.getPaid();
        currentMoney += this.director.salary;
        this.moneySpent = currentMoney;
     }

     void calculateProfit() {
         this.profit = this.moneyEarned - this.moneySpent;
     }
}
