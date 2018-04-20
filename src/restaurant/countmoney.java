/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Komgrit
 */

public class countmoney implements InterfaceMenu {
static double discountAmount,discountAmount1,discountAmount2;
static String[] dessertDiscount,foodDiscount,drinkDiscount;
    @Override
    public void Countmoney() {
       promotion p = new promotion();
       //foodDessert
         dessertDiscount = p.nameFood;
        int priceDiscount = p.price;
        
         discountAmount = 0;
        double discount=0;
        
        if(dessertDiscount.length>2){
            discount = 0.05;
            discountAmount = (priceDiscount)-(priceDiscount*discount);
        }else{
            discountAmount = priceDiscount;
        }
        System.out.println("");
        System.out.println("ราคาของหวาน");
        System.out.println("ส่วนลด: " +discount+"%" );
        for(int i =0 ; i<dessertDiscount.length ; i++){
            System.out.print(dessertDiscount[i]+" ");
        }
        System.out.print(discountAmount);
         System.out.println("");
         System.out.println("---------------------------");
        showmenu  s = new showmenu();
        s.ShowMenu();

        
            
        
        
        
    }

    @Override
    public void Promotion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Promotion1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Promotion2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Countmoney1() {
        promotion p = new promotion();
        //Food
        foodDiscount = p.nameFood1;
        int discountRate = p.price1;
         
         discountAmount1 = 0;
        double discount=0;
       
        if(foodDiscount.length>=2){
            discount = 0.05;
            discountAmount1 = (discountRate)-(discountRate*discount);
        }else{
            discountAmount1 = discountRate;
        }
        System.out.println("");
         System.out.println("ราคาอาหาร");
        System.out.println("ส่วนลด: " +discount+"%");
         for(int i =0 ; i<foodDiscount.length ; i++){
            System.out.print(foodDiscount[i]+" ");
        }
        System.out.println(discountAmount1);
        showmenu  s = new showmenu();
        s.ShowMenu();
    }

    @Override
    public void Countmoney2() {
       //foodDrink
        promotion p = new promotion();
        drinkDiscount = p.nameFood3;
        int drinkRate = p.price3;
         discountAmount2 = 0;
        double discount=0;
         
        if(drinkDiscount.length>=2){
            discount = 0.05;
            discountAmount2 = (drinkRate)-(drinkRate*discount);
        }else{
            discountAmount2 = drinkRate;
        }
        System.out.println("");
        System.out.println("ราคาเครื่องดื่ม");
        System.out.println("ส่วนลด: "+discount);
        
         for(int i =0 ; i<drinkDiscount.length ; i++){
            System.out.print(drinkDiscount[i]+" ");
        }
         
        System.out.print(discountAmount2);
         System.out.println("");
         System.out.println("---------------------------");
        showmenu  s = new showmenu();
        s.ShowMenu();
    }

    @Override
    public void CountAllMoney() {
       
//         promotion p = new promotion();
//         int number[] = p.namePrice;
//         int number1[] = p.namePrice1; 
//         int number2[] = p.namePrice3;
//         
//         System.out.println("---------------------------");
//         if(dessertDiscount.length==0&&foodDiscount.length==0&&drinkDiscount.length==0){ //1
//             
//             System.out.println("No information");
//         
//         }else if(dessertDiscount.length>=0&&foodDiscount.length==0&&drinkDiscount.length==0){ //2
//             
//             for(int j =0 ; j<foodDiscount.length ; j++){
//          
//                  System.out.println(foodDiscount[j]+": "+number1[j]);
//         
//              }
//          for(int k=0 ; k<drinkDiscount.length ; k++){ //3
//             
//              System.out.println(drinkDiscount[k]+": "+number2[k]);
//          
//          }
//          double total =discountAmount1+discountAmount2;
//         System.out.println("Total: "+total);
//         System.out.println("");
//          System.out.println("---------------------------");
//          
//         }else if(dessertDiscount.length>=0&&foodDiscount.length>=0&&drinkDiscount.length>=0){ //4
//             
//          for(int i =0 ; i<dessertDiscount.length; i++){
//              System.out.println(dessertDiscount[i]+": "+number[i]);
//          }        
//              
//          for(int j =0 ; j<foodDiscount.length ; j++){
//              System.out.println(foodDiscount[j]+": "+number1[j]);
//          }
//          for(int k=0 ; k<drinkDiscount.length ; k++){
//              System.out.println(drinkDiscount[k]+": "+number2[k]);
//          }
//          double total =discountAmount+discountAmount1+discountAmount2;
//         System.out.println("Total: "+total);
//         System.out.println("");
//          System.out.println("---------------------------");
//             
//         }else if(dessertDiscount.length>=0&&foodDiscount.length==0&&drinkDiscount.length>=0){ //5
//              
//          for(int i =0 ; i<dessertDiscount.length; i++){
//              System.out.println(dessertDiscount[i]+": "+number[i]);
//          }       
//          for(int k=0 ; k<drinkDiscount.length ; k++){
//              System.out.println(drinkDiscount[k]+": "+number2[k]);
//          }
//           double total =discountAmount+discountAmount2;
//         System.out.println("Total: "+total);
//         System.out.println("");
//          System.out.println("---------------------------");
//             
//         }else if(dessertDiscount.length>=0&&foodDiscount.length>=0&&drinkDiscount.length==0){ //6
//         for(int i =0 ; i<dessertDiscount.length; i++){
//              System.out.println(dessertDiscount[i]+": "+number[i]);
//          }        
//          for(int j =0 ; j<foodDiscount.length ; j++){
//              System.out.println(foodDiscount[j]+": "+number1[j]);
//          }
//           double total =discountAmount+discountAmount1;
//         System.out.println("Total: "+total);
//         System.out.println("");
//          System.out.println("---------------------------");
//    }
         
         
         promotion p = new promotion();
         int number[] = p.namePrice;
         int number1[] = p.namePrice1; 
         int number2[] = p.namePrice3;
          
          for(int i =0 ; i<dessertDiscount.length; i++){
              System.out.println(dessertDiscount[i]+": "+number[i]);
          }        
          for(int j =0 ; j<foodDiscount.length ; j++){
              System.out.println(foodDiscount[j]+": "+number1[j]);
          }
          for(int k=0 ; k<drinkDiscount.length ; k++){
              System.out.println(drinkDiscount[k]+": "+number2[k]);
          }
          double total =discountAmount+discountAmount1+discountAmount2;
          
         System.out.println("---------------------------"); 
         System.out.println("ราคาทั้งหมด: "+total);
         System.out.println("");
          System.out.println("---------------------------");
    }
    
}
