// Let's say you are shopping for a new doughnut every day. Stores often open with new prices for doughnuts,

// but the prices never change once the store opens. Every day, you want to buy a doughnut from the cheapest store,
// 5 which may have opened recently or not. You only like to contact or shop at a shop once, variety is the spice of
// life.

// 7 You notice that when you call shops, sometimes they are closed, so you need to know not only the lowest price for your doughnut
// 8 but the next lowest priced shop, and the price after that, if need be to the end of the list. Once you have contacted the shop, 9 or shopped at the shop, you won't shop there again.

// 11 How can you best store prices for your doughnuts, so that you can always buy the cheapest possible doughnut.


package com.example;

import com.example.Store;

public class Main {
    public static void main(String[] args) {
    

        Store myStore = new Store("Mars Store", 3.24);

        System.out.print(myStore.toString());
        
    }
}