package com.tnsif.Hierarchical;

 class Restaurant {
    void welcome()
    {
        System.out.println("Welcome to our Restaurant!");
    }
 }


  class Starters extends Restaurant {
    void vegStarters()
    {
        System.out.println("Veg Starters: Paneer Tikka, Veg Spring Rolls, Gobi Manchurian");
    }
    void nonVegStarters()
    {
        System.out.println("Non-Veg Starters: Chicken Wings, Fish Fingers, Mutton Kebab");
    }
    void soups() 
    {
        System.out.println("Soups: Tomato Soup, Sweet Corn Soup, Chicken Soup");
    }
}


  class MainMenu extends Restaurant {
    void vegMenu()
    {
        System.out.println("Veg Main Menu: Paneer Butter Masala, Veg Biryani, Dal Tadka, Veg Pulao");
    }
    void nonVegMenu() 
    {
        System.out.println("Non-Veg Main Menu: Chicken Curry, Mutton Rogan Josh, Prawn Biryani");
    }
    void riceVarieties() 
    {
        System.out.println("Rice Varieties: Jeera Rice, Fried Rice, Veg Biryani, Chicken Biryani");
    }
    void curries()
    {
        System.out.println("Curries: Palak Paneer, Butter Chicken, Kadai Veg");
    }
}


 class Desserts extends Restaurant {
    void iceCreams()
    {
        System.out.println("Ice Creams: Vanilla, Chocolate, Butterscotch");
    }
    void cakes() 
    {
        System.out.println("Cakes: Black Forest, Red Velvet, Cheesecake");
    }
    void smoothies()
    {
        System.out.println("Smoothies: Mango Smoothie, Strawberry Smoothie, Banana Smoothie");
    }
    void shakes()
    {
        System.out.println("Shakes: Chocolate Shake, Oreo Shake, Vanilla Shake");
    }
}