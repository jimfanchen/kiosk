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
public class sideItemTwo {
    public static int onionRingsOrdered =0;
    public static double costTotal = 1.5;
    public String name = "Onion Rings";
    
    public sideItemTwo(){
        
    }
    public static double getCostTotal(){
        return costTotal;
    }
    
    public static int getNumberOfFriesOrdered(){
        return onionRingsOrdered;
    }
    
    public static void setFries(int n){
        switch(n){
            case 0:
                        costTotal =0;
                        break;
                    case 1:
                        costTotal =1.5;
                        onionRingsOrdered =1;
                        break;
                    case 2:
                       costTotal =3;
                        onionRingsOrdered =2;
                        break;
                    case 3:
                        costTotal =4.5;
                        onionRingsOrdered =3;
                        break;
                    case 4:
                        costTotal =6;
                        onionRingsOrdered =4;
                        break;
                    case 5:
                       costTotal =7.5;
                        onionRingsOrdered =5;
                        break;
                    default:
                        break;
        }
    }
    
    public static void addNumberFries(int n){
       
       onionRingsOrdered += n;
        costTotal = costTotal + (costTotal* n);
       
    }
   
    public static void removeFries (int n){
        if((onionRingsOrdered - n) >= 0){
        onionRingsOrdered -=n;
        costTotal = costTotal - (costTotal* onionRingsOrdered);
        }
        else{
            //cannot remove that many fries error
            
        }
    }
    
    public static void reset(){
        onionRingsOrdered =0;
    }
    
}

