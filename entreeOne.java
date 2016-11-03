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
public class entreeOne {

  
    public static int numberOfEntreeOneOrdered =0;
   
    public static int buns = 2;
    public static int cheese =2;
    public static int paddie = 1;
    public static int lettuce =3;
    public static int tomato = 2;
    public static double orderCostTotal = 6.99;
    public String orderNumber = "";
    public static int totalNumberOfOrders =0;
    public static int numofOrders=0;
    
    
    public entreeOne(){
        
    }
    
    public static void reest(){
        numberOfEntreeOneOrdered = 0;
    }
    
    public static int getLetttuce(){
        return lettuce;
    }
    
    public static int getBuns(){
        return buns;
    }
    
    public double getCostTotal(){
        return orderCostTotal;
    }
    
    public void addCheese(int n){
        cheese += n;
        //each slice of cheese extra say is 0.5 cents
        orderCostTotal += n*0.5;
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
