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
public class entreeThree {
        public static double cost = 8.00;
    public static int numberOfEntreeThreeOrdered =0;
    public static int buns = 2;
    public static int cheese =4;
    public static int paddie = 0;
    public static int lettuce =3;
    public static int tomato = 2;
    public static double orderCostTotal = 6.99;
    public String orderNumber = "";
    public static int totalNumberOfOrders =0;
    public static int numofOrders=0;
    public String name = "Veggie Burger";
    
  
    
    public static void reest(){
        numberOfEntreeThreeOrdered = 0;
    }
    
   
    
    public double getCostTotal(){
        return orderCostTotal;
    }
    
     public static void setBuns(int n){
        if(n==0){
            orderCostTotal -= buns*0.5;
            buns =0;
        }
        else if(n==2){
            orderCostTotal += 0.50;
            buns = 3;
        }
       
    }
     
     public static int getBuns(){
         return buns;
     }
    
       public static void setPaddie(int n){
           if(n==0){
            orderCostTotal -= paddie*1.5;
            paddie =0;
        }
        else if(n==2){
            orderCostTotal += 1.50;
            paddie =3;
        }
         
           
        }
       public static int getPaddie(){
           return paddie;
       }
       
       public static void setTomato(int n){
           if(n==0){
            orderCostTotal -= tomato*0.20;
            tomato =0;
        }
        else if(n==2){
            orderCostTotal += 0.40;
            tomato = 4;
        }
       }
    
        public static int getTomato(){
            return tomato;
        }
       
    
    public void setLettuce(int n){
        
        if(n==0){
            orderCostTotal -= lettuce*0.15;
            lettuce =0;
        }
        else if(n==2){
            orderCostTotal += 0.30;
            lettuce =3;
        }
       
    }
    public static int getLettuce(){
        return lettuce;
    }
    
    
    public void setCheese(int n){
        
        if(n==0){
            orderCostTotal -= cheese *0.65;
            cheese =0;
        }
        else if(n==2){
            orderCostTotal += 1.30;
            cheese =4;
        }
        
    }
    
    public static int getCheese(){
        return cheese;
    }
}
