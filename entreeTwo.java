/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

import static kiosk.entreeOne.lettuce;
import static kiosk.entreeOne.orderCostTotal;
import static kiosk.entreeOne.paddie;

/**
 *
 * @author Jim
 */
public class entreeTwo {

    public static double cost = 7.50;
    public static int numberOfEntreeTwoOrdered =0;
    public static int buns = 3;
    public static int cheese =4;
    public static int paddie = 2;
    public static int lettuce =3;
    public static int tomato = 2;
    public static double orderCostTotal = 6.99;
    public String orderNumber = "";
    public static int totalNumberOfOrders =0;
    public static int numofOrders=0;
    public String name = "Double Burger";
    
    public entreeTwo(){
        
    }
    
    public static void reest(){
        numberOfEntreeTwoOrdered = 0;
    }
    
    public static int getLetttuce(){
        return lettuce;
    }
    
    public static int getBuns(){
        return buns;
    }
    
    public static int getPaddie(){
        return paddie;
    }
    
    public static int getTomato(){
        return tomato;
    }
    
    public static int getCheese(){
        return cheese;
    }
    
    public double getCostTotal(){
        return orderCostTotal;
    }
    
     public static void addBuns(int n){
        if(buns==0){
            orderCostTotal += n*0.25;
            buns =n;
        }
        else{
            buns = buns + (n-buns);
            orderCostTotal += ((n-buns)* 0.25);
        }
    }
    
       public static void addPaddie(int n){
        if(paddie==0){
            orderCostTotal += n*1.5;
            paddie =n;
        }
        else{
            paddie = paddie + (n-paddie);
            orderCostTotal += ((n-paddie)* 0.25);
        }
    }
     
    
    public void addLettuce(int n){
        if (lettuce ==0){
         lettuce += n;
        //each slice of cheese extra say is 0.5 cents
        orderCostTotal += (n*0.15);
        }
        else{
          lettuce += (n-lettuce);
          orderCostTotal += ((n-lettuce)*0.15);
        }
    }
    
    
    
    public void addCheese(int n){
        if(cheese==0){
        cheese += n;
        //each slice of cheese extra say is 0.5 cents
        orderCostTotal += n*0.5;
        }
        else{
            cheese+= (n-cheese);
            orderCostTotal += ((n-cheese)*0.5);
        }
    }
    
    public void removeCheese (int n){
        if(cheese-n < 0){
            //print illegal operation
        }
        else{
            orderCostTotal -= n*0.5;
        }
        
    }
    
    public void removeBuns(int n){
         if(buns-n < 0){
            //print illegal operation
        }
        else{
            orderCostTotal -= n*0.25;
        }
    }
    
    public static int getBunNum(){
        return buns;
    }
}
