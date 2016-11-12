/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosk;

/**
 *
 * This is the orderTicket object, each orderTicket contains many objects.  
 * Author: Fan
 */
public class orderTicket {
    
    public static presetOrder[] ordersofComboone = new presetOrder[40]; 
    public static entreeOne [] ordersOfEntreeOnes = new entreeOne[40];
    public static entreeTwo [] ordersOfEntreeTwo = new entreeTwo[40];
    public static entreeThree [] ordersOfEntreeThree = new entreeThree[40];
    public static entreeFour [] ordersOfEntreeFour = new entreeFour[40];
    public static entreeFive [] ordersOfEntreeFive = new entreeFive[40];
    public static sideItemOne [] ordersOfsideItemOne = new sideItemOne[40];
    public static entreeOne entreeOneOrder = new entreeOne();
    public static entreeTwo entreeTwoOrder = new entreeTwo();
    public static entreeThree entreeThreeOrder = new entreeThree();
    public static entreeFour entreeFourOrder = new entreeFour();
    public static entreeFive entreeFiveOrder = new entreeFive();
    public static sideItemOne orderOfFries = new sideItemOne();
    public static int comboOneorders =0;
    public static int entreeOneorders =0;
    public static int entreeTwoorders =0;
    public static int entreeThreeorders =0;


    public static int entreeFourorders = 0;
    public static int entreeFiveorders =0;
  
    public static int sideItemOneordered =0;
    public static int drinksOrdered =0;
    public static int lettuce =0;
    public static int tomato =0;
    public static int bun =0;
    public static int cheese =0;
    public static int paddie =0;  
    public static drinkItemOne [] ordersOfdrinkItemsordered = new drinkItemOne[40];
    public static int combos = 0;
    
    
    public orderTicket(){
        
    }
    public static int getEntreeOneLettuce(){
        int entreeOneLettuces =0;
        if(ordersOfEntreeOnes.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeOneorders; i++){
                entreeOneLettuces += ordersOfEntreeOnes[i].getLettuce();
            }
            return entreeOneLettuces;
        }
    }
    
      public static int getEntreeTwoLettuce(){
        int entreeTwoLettuces =0;
        if(ordersOfEntreeTwo.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeTwoorders; i++){
                entreeTwoLettuces += ordersOfEntreeTwo[i].getLettuce();
            }
            return entreeTwoLettuces;
        }
    }
      
      public static int getEntreeThreeLettuce(){
        int entreeThreeLettuces =0;
        if(ordersOfEntreeThree.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeTwoorders; i++){
                entreeThreeLettuces += ordersOfEntreeThree[i].getLettuce();
            }
            return entreeThreeLettuces;
        }
    }
      
       public static int getEntreeFourLettuce(){
        int entreeFourLettuces =0;
        if(ordersOfEntreeFour.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeFour.length; i++){
                entreeFourLettuces += ordersOfEntreeFour[i].getLettuce();
            }
            return entreeFourLettuces;
        }
    }
          public static int getEntreeFiveLettuce(){
        int entreeFiveLettuces =0;
        if(ordersOfEntreeFive.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeFour.length; i++){
                entreeFiveLettuces += ordersOfEntreeFour[i].getLettuce();
            }
            return entreeFiveLettuces;
        }
    }
        public static int getPresetLettuce(){
        int presetLettuces =0;
        if(ordersofComboone.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersofComboone.length; i++){
                presetLettuces += ordersofComboone[i].theBurger.getLettuce();
            }
            return presetLettuces;
        }
    }
   
    public static int getEntreeOneBuns(){
        int entreeOneBuns =0;
        if(ordersOfEntreeOnes.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeOnes.length; i++){
                entreeOneBuns += ordersOfEntreeOnes[i].getBuns();
            }
            return entreeOneBuns;
        }
    }
    
      public static int getEntreeTwoBuns(){
        int entreeTwoBuns =0;
        if(ordersOfEntreeTwo.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeTwo.length; i++){
                entreeTwoBuns += ordersOfEntreeTwo[i].getBuns();
            }
            return entreeTwoBuns;
        }
    }
      
      public static int getEntreeThreeBuns(){
        int entreeThreeBuns =0;
        if(ordersOfEntreeThree.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeThree.length; i++){
                entreeThreeBuns += ordersOfEntreeThree[i].getBuns();
            }
            return entreeThreeBuns;
        }
    }
      
        public static int getPresetBuns(){
        int presetBuns =0;
        if(ordersofComboone.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersofComboone.length; i++){
                presetBuns += ordersofComboone[i].theBurger.getBuns();
            }
            return presetBuns;
        }
    }
   
   
        public static int getEntreeOneCheese(){
        int entreeOneCheese =0;
        if(ordersOfEntreeOnes.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeOnes.length; i++){
                entreeOneCheese += ordersOfEntreeOnes[i].getCheese();
            }
            return entreeOneCheese;
        }
    }
    
      public static int getEntreeTwoCheese(){
        int entreeTwoCheese =0;
        if(ordersOfEntreeTwo.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeTwo.length; i++){
                entreeTwoCheese += ordersOfEntreeTwo[i].getCheese();
            }
            return entreeTwoCheese;
        }
    }
      
      public static int getEntreeThreeCheese(){
        int entreeThreeCheese =0;
        if(ordersOfEntreeThree.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeThree.length; i++){
                entreeThreeCheese += ordersOfEntreeThree[i].getCheese();
            }
            return entreeThreeCheese;
        }
    }
      
      public static int getEntreeFourCheese(){
          int entreeFourCheese =0;
        if(ordersOfEntreeFour.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeFour.length; i++){
                entreeFourCheese += ordersOfEntreeFour[i].getCheese();
            }
            return entreeFourCheese;
        }
      }
      
        public static int getPresetCheese(){
        int presetCheese =0;
        if(ordersofComboone.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersofComboone.length; i++){
                presetCheese += ordersofComboone[i].theBurger.getCheese();
            }
            return presetCheese;
        }
    }
   
        
         public static int getEntreeOnePaddie(){
        int entreeOnePaddie =0;
        if(ordersOfEntreeOnes.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeOnes.length; i++){
                entreeOnePaddie += ordersOfEntreeOnes[i].getPaddie();
            }
            return entreeOnePaddie;
        }
    }
    
      public static int getEntreeTwoPaddie(){
        int entreeTwoPaddie =0;
        if(ordersOfEntreeTwo.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeTwo.length; i++){
                entreeTwoPaddie += ordersOfEntreeTwo[i].getPaddie();
            }
            return entreeTwoPaddie;
        }
    }
      
      public static int getEntreeThreePaddie(){
        int entreeThreePaddie =0;
        if(ordersOfEntreeThree.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeThree.length; i++){
                entreeThreePaddie += ordersOfEntreeThree[i].getPaddie();
            }
            return entreeThreePaddie;
        }
    }
      
        public static int getPresetPaddie(){
        int presetPaddie =0;
        if(ordersofComboone.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersofComboone.length; i++){
                presetPaddie += ordersofComboone[i].theBurger.getPaddie();
            }
            return presetPaddie;
        }
    }
        
        
         public static int getEntreeOneTomato(){
        int entreeOneTomato =0;
        if(ordersOfEntreeOnes.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeOnes.length; i++){
                entreeOneTomato += ordersOfEntreeOnes[i].getTomato();
            }
            return entreeOneTomato;
        }
    }
         
          public static double getEntreeOneTotal(){
        int entreeOneTotal =0;
        if(entreeOneorders == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeOneorders; i++){
                entreeOneTotal += ordersOfEntreeOnes[i].getCostTotal();
            }
            return entreeOneTotal;
        }
    }
          public static double getEntreeTwoTotal(){
        int entreeTwoTotal =0;
        if(entreeTwoorders == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeTwoorders; i++){
                entreeTwoTotal += ordersOfEntreeTwo[i].getCostTotal();
            }
            return entreeTwoTotal;
        }
    }
        public static double getEntreeThreeTotal(){
        int entreeThreeTotal =0;
        if(entreeThreeorders == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeThreeorders; i++){
                entreeThreeTotal += ordersOfEntreeThree[i].getCostTotal();
            }
            return entreeThreeTotal;
        }
    }
           
             public static double getEntreeFourTotal(){
        int entreeFourTotal =0;
        if(entreeFourorders == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeFourorders; i++){
                entreeFourTotal += ordersOfEntreeFour[i].getCostTotal();
            }
            return entreeFourTotal;
        }
    }
              public static double getEntreeFiveTotal(){
        int entreeFiveTotal =0;
        if(entreeFiveorders == 0){
            return 0;
        }
        else{
            for(int i=0; i<entreeFiveorders; i++){
                entreeFiveTotal += ordersOfEntreeFive[i].getCostTotal();
            }
            return entreeFiveTotal;
        }
    }
              
              public static double getDrinkTotal(){
        int drinkTotal =0;
        if(drinksOrdered == 0){
            return 0;
        }
        else{
            for(int i=0; i<drinksOrdered; i++){
                drinkTotal += ordersOfdrinkItemsordered[i].getCostTotal();
            }
            return drinkTotal;
        }
    }
              public static double getFriesTotal(){
        int friesTotal =0;
        if(sideItemOneordered == 0){
            return 0;
        }
        else{
            for(int i=0; i<sideItemOneordered; i++){
                friesTotal += ordersOfsideItemOne[i].getCostTotal();
            }
            return friesTotal;
        }
    }
          
    
      public static int getEntreeTwoTomato(){
        int entreeTwoTomato =0;
        if(ordersOfEntreeTwo.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeTwo.length; i++){
                entreeTwoTomato += ordersOfEntreeTwo[i].getTomato();
            }
            return entreeTwoTomato;
        }
    }
      
      public static int getEntreeThreeTomato(){
        int entreeThreeTomato =0;
        if(ordersOfEntreeThree.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfEntreeThree.length; i++){
                entreeThreeTomato += ordersOfEntreeThree[i].getTomato();
            }
            return entreeThreeTomato;
        }
    }
      
        public static int getPresetTomato(){
        int presetTomato =0;
        if(ordersofComboone.length == 0){
            return 0;
        }
        else{
            for(int i=0; i<ordersofComboone.length; i++){
                presetTomato += ordersofComboone[i].theBurger.getTomato();
            }
            return presetTomato;
        }
    }
        
    
    public static void addEntreeOne(entreeOne e1){
        ordersOfEntreeOnes[entreeOneorders]=e1 ;
        entreeOneorders++;       
    }
    
    public static void addCombo (presetOrder o1){
        ordersofComboone[combos]= o1;
        combos++;
    }
    
    public static void addEntreeTwo(entreeTwo e2){
        ordersOfEntreeTwo[entreeTwoorders]=e2;
        entreeTwoorders++;
    }
    
    public static void addEntreeThree(entreeThree e3){
        ordersOfEntreeThree[entreeThreeorders] =e3;
        entreeThreeorders++;
    }
    
    public static void addEntreeFour(entreeFour e4){
        ordersOfEntreeFour[entreeFourorders]= e4;
        entreeFourorders++;
    }
    
     public static void addEntreeFive(entreeFive e5){
        ordersOfEntreeFive[entreeFiveorders]= e5;
        entreeFiveorders++;
    }
    
    public static void addSideItems(sideItemOne s1){
        ordersOfsideItemOne[sideItemOneordered] = s1;
        sideItemOneordered++;
    }
    
    public static void addDrinkItem(drinkItemOne d1){
        ordersOfdrinkItemsordered[drinksOrdered]= d1;
        drinksOrdered++;
    }
    
    public static int getLettuceTotal(){
        return getEntreeOneLettuce() + getEntreeTwoLettuce() + getEntreeThreeLettuce()+ getEntreeFourLettuce()+ getEntreeFiveLettuce()+getPresetLettuce();
    }
    
    public static double getCostTotal(){
        return getEntreeOneTotal() + getEntreeTwoTotal() + getEntreeThreeTotal() + getEntreeFourTotal() + getEntreeFiveTotal() + getDrinkTotal() + getFriesTotal();
    }
    
    public static int getBunsTotal(){
        return getEntreeOneBuns() + getEntreeTwoBuns() + getEntreeThreeBuns()+ getPresetBuns();
    }
    
    public static int getCheeseTotal(){
        return getEntreeOneCheese() + getEntreeTwoCheese() + getEntreeThreeCheese()+ getPresetCheese();
    }
    
    public static int getPaddieTotal(){
        return getEntreeOnePaddie() + getEntreeTwoPaddie() + getEntreeThreePaddie()+ getPresetPaddie();
    }
    
    public static int getTomatoTotal(){
        return getEntreeOneTomato() + getEntreeTwoTomato() + getEntreeThreeTomato()+ getPresetTomato();
    }
    
    public static int getTotalFries(){
        int totalFries=0;
        if (ordersOfsideItemOne.length ==0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfsideItemOne.length; i++){
                totalFries +=ordersOfsideItemOne[i].getNumberOfFriesOrdered();
                
            }
            return totalFries;
        }
    }
    public static int getTotalDrinks(){
        int totalDrinks=0;
        if (ordersOfdrinkItemsordered.length ==0){
            return 0;
        }
        else{
            for(int i=0; i<ordersOfdrinkItemsordered.length; i++){
                totalDrinks +=ordersOfdrinkItemsordered[i].returnDrinksTotal();
                
            }
            return totalDrinks;
        }
    }
}
    
    

