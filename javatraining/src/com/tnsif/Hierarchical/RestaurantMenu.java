package com.tnsif.Hierarchical;

public class RestaurantMenu {
    public static void main(String[] args) {
   
        Starters s = new Starters();
        s.welcome();
        s.vegStarters();
        s.nonVegStarters();
        s.soups();
        System.out.println();

       
        MainMenu m = new MainMenu();
        m.vegMenu();
        m.nonVegMenu();
        m.riceVarieties();
        m.curries();
        System.out.println();

        
        Desserts d = new Desserts();
        d.iceCreams();
        d.cakes();
        d.smoothies();
        d.shakes();
    }
}