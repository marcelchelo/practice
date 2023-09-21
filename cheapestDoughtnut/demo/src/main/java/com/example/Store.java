package com.example;



//every store must:
//have a name
//have a price
//a visited status
//update the visited status

public class Store {
    private boolean visited =false;
    private String name = "";
    private double price = 0.00;
    private boolean open = true;
    //constructor

    Store(String name, double price){
        this.name = name;
        this.price = price;
    }

    //fuction to mark a store as visited
    public void markAsVisited(){
        this.visited = true;
    }


    public String getVisitedStatus(){
        if(this.visited == true){
            return "Visited";
        }else{
            return "Not Bisited";
        }
    }
    

    public void updatePrice(){
        double min = 1.0;
        double max = 10.0;
        double randomDouble = Math.random() * (max - min) + min;
        this.price = randomDouble;
 
    }
    @Override
    public String toString(){
        String status = "";
        if(this.open == false){
            status = "closed";
        }else{
            status = "open";
        }

        return " " + this.name + "and is " + status ;
    }

    //implpement getters and setters for required fields

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
}
