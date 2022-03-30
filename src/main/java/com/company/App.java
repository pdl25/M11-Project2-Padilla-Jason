package com.company;

public class App {
    static String addSpaces(int size) {
        String result = "";
        int num = 40 - size+6;
        for (int i = 0; i < num; i++) {
            result += " ";
        }
        result += "*";

        return result;
    }
    public static void main(String[] args) {
        Person person1 = new Person("John Smith", 75000, 10000);
        Person person2 = new Person("Jane Doe", 75000, 20000);

        Movie theBatmanMovie = new Movie("The Batman", "Action", "2h 56m", 100000000, 486000000 );

        Actor maleHero = new Actor("Robert Pattinson", 3000000, 10000000,"Batman");
        Actor femaleHero = new Actor("Zoe Kravitz", 2000000, 5000000, "Catwoman");
        Actor leadVillain = new Actor("Paul Dano", 1000000, 1000000, "Riddler");
        Actor supportingVillain = new Actor("Collin Farrell", 500000, "Penguin");
        Actor leadDetective = new Actor("Jeffrey Wright", 500000, "Detective");

        Crew c1 = new Crew("Kat Ali", 200000, 10000, "Makeup");
        Crew c2 = new Crew("Sally Abbott", 100000, 5000, "Art");
        Crew c3 = new Crew("Bobbi Banks", 250000, 30000, "Sound");
        Crew c4 = new Crew("Katie Brydon", 300000, 70000, "Casting");
        Crew c5 = new Crew("Jennifer Alford", 150000, 20000, "Costumes");
        Crew c6 = new Crew("Janet Kellock", 200000, 40000, "Script");

        Director director = new Director("Matt Reeves",5000000, 10000000, "Director");

        PA p1 = new PA("Emra Papila", "VFX", 2567, 150);
        PA p2 = new PA("Ross Jenkins", "Set", 2872, 125);

        theBatmanMovie.setDirector(director);
        theBatmanMovie.addActor(maleHero);
        theBatmanMovie.addActor(femaleHero);
        theBatmanMovie.addActor(leadVillain);
        theBatmanMovie.addActor(supportingVillain);
        theBatmanMovie.addActor(leadDetective);

        theBatmanMovie.addCrewMember(c1);
        theBatmanMovie.addCrewMember(c2);
        theBatmanMovie.addCrewMember(c3);
        theBatmanMovie.addCrewMember(c4);
        theBatmanMovie.addCrewMember(c5);
        theBatmanMovie.addCrewMember(c6);

        theBatmanMovie.addCrewMember(p1);
        theBatmanMovie.addCrewMember(p2);

        theBatmanMovie.Payday();
        theBatmanMovie.calculateProfit();
        director.setRoyalty(theBatmanMovie);

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                                     *");
        System.out.println("*                       MOVIE                         *");
        System.out.println("*                     " + theBatmanMovie.title + "                      *");
        System.out.println("*                                                     *");
        System.out.println("*    Genre: " + theBatmanMovie.genre + "              Length: " + theBatmanMovie.length + "        *");
        System.out.println("*                                                     *");
        System.out.println("*                      Starring                       *");
        System.out.println("*    " + maleHero.name + "     &     " + femaleHero.name +"           *");
        System.out.println("*                                                     *");
        System.out.println("*                     Directed By                     *");
        System.out.println("*                     " + director.name + "                     *");
        System.out.println("*                                                     *");
        System.out.println("*        Actors                                       *");
        for(Actor actor: theBatmanMovie.actors){
            System.out.println("*    " + actor.name + " - " + actor.role + addSpaces(actor.name.length() + actor.role.length()));
        }
        System.out.println("*                                                     *");
        System.out.println("*          Crew                                       *");
        for(Crew crew: theBatmanMovie.crew){
            System.out.println("*    " + crew.name + " - " + crew.department + addSpaces(crew.name.length() + crew.department.length()));
        }
        System.out.println("*                                                     *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("");
        System.out.println("                        INFO                          ");
        System.out.println("PA1 Earnings: " + p1.salary);
        System.out.println("PA2 Earnings: " + p2.salary);
        System.out.println("Budget: " + theBatmanMovie.budget);
        System.out.println("Money Earned: " + theBatmanMovie.moneyEarned);
        System.out.println("Money Spent: " + theBatmanMovie.moneySpent);
        System.out.println("Profits: " + theBatmanMovie.profit);
        System.out.println("Director Royalties: " + director.royalty);
    }

}
