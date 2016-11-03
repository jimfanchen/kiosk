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
    public static double costOfFries = 4.99;
    public String name = "Fries";
    
    public sideItemOne(){
        
    }
    
    public static int getNumberOfFriesOrdered(){
        return friesOrdered;
    }
    
    public static void addNumberFries(int n){
       if(friesOrdered == 0){
        friesOrdered += n;
        costOfFries = costOfFries + (costOfFries* n);
       }
       else{
          costOfFries = costOfFries + (costOfFries * (n- friesOrdered));
          friesOrdered = friesOrdered + (n-friesOrdered);
       }
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
