
package kiosk;
import java.util.*;
import java.math.*;
import java.io.*;

/**
 *
 * @author Fan Chen
 */
public class Kiosk {
    /* So far, adding orders should be good. Removing orders? LOL.
    */
    
public static int ticketNumber = 0;
public static String numberPrefix = "Order #";
public static String inventoryDisplay = ""; //This is to just display how much inventory is there at start of day. Doesn't change
public static String actualInventory = ""; //updates every order.

public static orderTicket[] orders = new orderTicket[1000]; 

public static int totalBuns = 99999;
public static int totalCheese = 99999;
public static int totalPaddies = 99999;
public static int totalLettuce = 9999; //1 means 1 layer
public static int totalTomatoes = 9999;
public static int totalDrinks = 99999;
public static int totalFries = 9999999;


    
  
    public static void main(String[] args) {
        
         int[] inventory = new int[7];
        Scanner fileinput = null;
        File inFile = new File("inventory.txt");
       
        try{
          fileinput = new Scanner(inFile);
          for(int i = 0; i<=inventory.length-1;i++){
              inventory[i] = Integer.parseInt(fileinput.nextLine());
          }
       
          fileinput.close();
        }catch(FileNotFoundException e){
            FileWriter inventorydefault;
           
            try {
                inventorydefault = new FileWriter(inFile);
                inventorydefault.write("0\r\n999\r\n999\r\n999\r\n999\r\n999\r\n999");
                inventorydefault.close();
               
                fileinput = new Scanner(inFile);
                for(int i = 0; i<=inventory.length-1;i++){
                      inventory[i] = Integer.parseInt(fileinput.nextLine());
                  }
                 fileinput.close();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
       
       
        }
       
        ticketNumber = inventory[0];
        totalBuns = inventory[1];
        totalCheese = inventory[2];
        totalPaddies = inventory[3];
        totalLettuce = inventory[4];
        totalTomatoes = inventory[5];
        totalDrinks = inventory[6];
        
        
        //When press start button, creates a new orderTicket object that is put into the orders array.
        orderTicket newOrder = new orderTicket();
        orders[ticketNumber] = newOrder;
        
        
       // when preset order 1 is ordered
       presetOrder presetOrder1 = new presetOrder();
       //when customer is happy with their presetOrder, this preset order is added to the ticket.
       newOrder.addCombo(presetOrder1); 
       presetOrder1.increment();
       
       
       
        //when pressing order drnk button
         int numberOfDrinks =0;
         
         drinkItemOne drinkOrder = new drinkItemOne();
         //if small button is pushed 
         //numberofDrink = number in the box or the number of times the plus button has pressed if originally is zero.
         drinkOrder.addDrink(numberOfDrinks, 1); //the second parameter determines the size 1=small, 2= medium, 3=large
         newOrder.addDrinkItem(drinkOrder);

//if medium button is pushed
         //numberofDrink = number in the box.
         drinkOrder.addDrink(numberOfDrinks, 2);
         //if large button is pushed
         //numberofDrink = number in the box
        drinkOrder.addDrink(numberOfDrinks, 3);
        
        
     
    //when done ordering inventory should be updated.
    totalLettuce -= newOrder.getLettuceTotal();
    totalBuns -= newOrder.getBunsTotal();
    totalCheese -= newOrder.getCheeseTotal();
    totalPaddies -= newOrder.getPaddieTotal();
    totalTomatoes -= newOrder.getTomatoTotal();
    
    
    ticketNumber++;
        
    
    
    }
    
}
