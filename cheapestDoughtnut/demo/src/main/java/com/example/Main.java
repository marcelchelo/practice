// Let's say you are shopping for a new doughnut every day. Stores often open with new prices for doughnuts,

// but the prices never change once the store opens. Every day, you want to buy a doughnut from the cheapest store,
// 5 which may have opened recently or not. You only like to contact or shop at a shop once, variety is the spice of
// life.

// 7 You notice that when you call shops, sometimes they are closed, so you need to know not only the lowest price for your doughnut
// 8 but the next lowest priced shop, and the price after that, if need be to the end of the list. Once you have contacted the shop, 9 or shopped at the shop, you won't shop there again.

// 11 How can you best store prices for your doughnuts, so that you can always buy the cheapest possible doughnut.


package com.example;

import java.util.Comparator;
import java.util.PriorityQueue;

//importing the store class
import com.example.Store;

public class Main {
    public static void main(String[] args) {
        
        //create a function to generate x number of sotres 
        //with random prices , and random names 
        
        Store [] myStoresList = generateStores(10);

        //for every store, get the list of prices, and pass it to an 
       for (Store store : myStoresList) {
            System.out.println(store.toString());
            System.out.println(store.getPrice());
       }


        //getTheLowest price among stores in the list 
        Store cheapestStore = getCheapestPrice(myStoresList);

        System.out.println("the cheapest store is " + cheapestStore)  ;
       
        //mark that store as visited
        cheapestStore.markAsVisited();
        System.out.println("the store is now marked as" + cheapestStore.getVisitedStatus());

    }

    static Store getCheapestPrice(Store [] listOfStore){
        //from the list array, get assign each to the priority quee 
        //compare using the price of each store object 
        
        PriorityQueue <Store> minPriceQuee = new PriorityQueue<>(Comparator.comparingDouble(Store :: getPrice));
        
        //the quee is empty, fill the priority quee with list of stores
        for (Store store : listOfStore) {
            minPriceQuee.add(store);
        }

        System.out.println("The quee has populated");

        Store cheapestStore = minPriceQuee.peek();
        
        return cheapestStore;

    }

    //a method that will return an array of stores 
    static Store[] generateStores(int storesToGenerate){
        //instantiate an array of stores of size storesToGenerate
        Store [] mystoreList = new Store[storesToGenerate];

        for (int i =0 ;  i< storesToGenerate ; i++){
            //at evey i create a store object and add it to the i index
            //of the array
            String name = "Store" + (i + 1);
           //generate a random price 
           double price = 1 + (Math.random() * 9);  //random price of an doughnut 
            mystoreList[i] = new Store(name, price);

        }
        return mystoreList;
    }
}