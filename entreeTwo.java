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
    
    public entreeTwo(){
        
    }
    
    public static void reest(){
        numberOfEntreeTwoOrdered = 0;
    }
    
    
    public static int getToamto(){
        return tomato;
    }
    
    public static int getLetttuce(){
        return lettuce;
    }
    
    public static int getCheese(){
        return cheese;
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
    
    public static void removeBuns(int n){
        if(buns-n <0){
            //error
        }
        else{
            buns -= (n-buns);
            
        }
    }
    
    public static int getPaddie(){
        return paddie;
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
    
    
    public static int getBunNum(){
        return buns;
    }
}
