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
public class sideItemOne {
    public static int friesOrdered =0;
    public static double costOfFries = 2.5;
    public String name = "Fries";
    
    public sideItemOne(){
        
    }
    public static double getCostTotal(){
        return costOfFries;
    }
    
    public static int getNumberOfFriesOrdered(){
        return friesOrdered;
    }
    
    public static void setFries(int n){
        switch(n){
            case 0:
                        costOfFries =0;
                        break;
                    case 1:
                        costOfFries =2.5;
                        friesOrdered =1;
                        break;
                    case 2:
                       costOfFries =5;
                        friesOrdered =2;
                        break;
                    case 3:
                        costOfFries =7.5;
                        friesOrdered =3;
                        break;
                    case 4:
                        costOfFries =10;
                        friesOrdered =4;
                        break;
                    case 5:
                       costOfFries =12.5;
                        friesOrdered =5;
                        break;
                    default:
                        break;
        }
    }
    
    public static void addNumberFries(int n){
       
        friesOrdered += n;
        costOfFries = costOfFries + (costOfFries* n);
       
    }
   
    public static void removeFries (int n){
        if((friesOrdered - n) >= 0){
        friesOrdered -=n;
        costOfFries = costOfFries - (costOfFries* friesOrdered);
        }
        else{
            //cannot remove that many fries error
            
        }
    }
    
    public static void reset(){
        friesOrdered =0;
    }
    
}
