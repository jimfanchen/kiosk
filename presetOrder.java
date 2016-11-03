/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

/*
 * This is defines methods related to an Order object. An order is defined from the pressing of the start ordering
 * button to the pressing of the Pay now button for a custom order. 
 * This allows for better inventory managment. Idk how yet. I came up with this idea in the shower.
 * Literally.
 * All functions (methods) related to a custom burger
 * getTotalPrice();
 * addCheese();
 * removeCheese(); [i mean i could make it to where I can condense all these ingredient adding and removing)
 * but the major ones:
 * all custom burgers will start at 2 buns, 2 cheese, 1 paddie, 1 lettuce, 1 tomato and 6.99.
 *  Fan Chen
 */
public class presetOrder {
   
    public static double orderCostTotal = 11.99;
    public String orderNumber = "";
    public static int totalNumberOfOrders =0;
    public String name = "combo 1";
    public static entreeOne theBurger = new entreeOne();
    public static drinkItemOne theDrink = new drinkItemOne();
    public static sideItemOne theFries = new sideItemOne();
    
    
    
    public presetOrder(){
        
    }
    
    
    
    public presetOrder(String orderNum){
        orderNumber = orderNum;
    }
    
    public double getCostTotal(){
        return orderCostTotal;
    }
    
   
    
    public static void increment(){
       totalNumberOfOrders++;
    }
}