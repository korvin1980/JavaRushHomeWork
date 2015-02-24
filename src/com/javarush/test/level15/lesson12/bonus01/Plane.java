package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by svaranovich on 24/02/2015.
 */
public class Plane implements Flyable
{
    private int numPassengers;

    public Plane(int numPassengers){
        this.numPassengers = numPassengers;
    }

    public void fly(){
        System.out.println("I'm flying");
    }


}
