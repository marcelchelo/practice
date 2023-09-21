package com.example;

import java.util.Random;

public class Store {
    boolean visited =false;
    String name = "";
    double price = 0.00;
    //constructor

    Store(String name, double price){
        this.name = name;
        this.price = price;

    }

    //fuction to mark a store as visited
    public void markAsVisited(){
        this.visited = true;
    }
    
    public void updatePrice(){
        this.price = 1.00;
        //make this better by getting a random number.  from 1 -10
        //apply the new price value
    }

    public String toString(){
       
        return "This is the sore class";
    }
}
