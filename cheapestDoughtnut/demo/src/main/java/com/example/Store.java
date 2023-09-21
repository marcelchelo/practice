package com.example;

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

    public String toString(){
       
        return "This is the sore class";
    }
}
