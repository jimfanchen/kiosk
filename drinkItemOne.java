/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

/**
 *
 * @author Jim
 */
public class drinkItemOne {
    public static int drinksOrdered = 0;
    public static double totalCostSmall = 1.50;
    public static double totalCostMedium = 2.50;
    public static double totalCostLarge = 3.50;
    public static double totalCost = 0;
    
    public drinkItemOne(){
        
    }
    //All combos come with medium drink
    public drinkItemOne(int amount, int option){
        drinksOrdered+=amount;
        totalCost += totalCostMedium*amount;
    }
    
    public static void addDrink(int n, int o){
        switch(o){
            case 0:
                drinksOrdered += n;
                totalCost += n*totalCostSmall;
                break;
            case 1:
                drinksOrdered +=n;
                totalCost += n*totalCostMedium;
                break;
            case 2:
                drinksOrdered += n;
                totalCost += n*totalCostLarge;
                break;
                
        }
    }
    
    
    
}