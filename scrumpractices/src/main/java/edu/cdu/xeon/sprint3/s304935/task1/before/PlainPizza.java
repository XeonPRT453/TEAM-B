package edu.cdu.xeon.sprint3.s304935.task1.before;


public class PlainPizza implements Pizza {

    public String getDescription() {

        return "Thin dough";

    }

    public double getCost() {

        System.out.println("Cost of Dough: " + 4.00);

        return 4.00;

    }

    public String addMozzarella(){

        return getDescription() + ", mozzarella";

    }

    public String addTomatoSauce(){
        return getDescription() + ", TomatoSauce";
    }

}