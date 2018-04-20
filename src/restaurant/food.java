/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static restaurant.dessert.m1;

/**
 *
 * @author Komgrit
 */
public class food extends Menu {
public int id;
public String FoodName;
public int price;
public static Map<String, String> m3;


    @Override
    void Food() {
       
        
        Scanner Sc = new Scanner(System.in);
      
            int m;
            m3 = new HashMap<String, String>();
            
            do {
                String strI = null;
                StringBuilder sb = new StringBuilder();
        System.out.println("");        
        System.out.println("******เมนูอาหาร******");
        System.out.println("1.ต้มยำกุ้ง 300 ฿");
        System.out.println("2.ผัดผักบุ้ง 150 ฿");
        System.out.println("3.ไก่ทอดน้ำปลา 90 ฿");
        System.out.println("4.ไก่อบสมุนไพร 99 ฿");
        System.out.println("0. ออก");
        System.out.print("เลือกเมนูอาหาร : ");
             m =Sc.nextInt ();
             if(m==0){
                 break;
             }else if (m>4){
          System.out.println("");       
         System.out.println("กรูณาเลือกเมนูอาหารใหม่");
         System.out.println("");
         continue;
             }    
             System.out.print("จำนวน:");
             int y = Sc.nextInt();
              String value = null;
              int amount = 0;
          switch(m){
              
              case 1:  amount =300*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m3.put("ต้มยำกุ้ง", strI);
              break;
              case 2: amount =150*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m3.put("ผัดผักบุ้ง", strI);
              break;
              case 3: amount =90*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m3.put("ไก่ทอดน้ำปลา", strI);
              break;
              
              case 4:amount =99*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m3.put("ไก่อบสมุนไพร", strI);
              break;
              default:
                  
                  
                  break;
          }
        //
          System.out.println(m3);
            }while( m!=0 );
            showmenu s = new showmenu();
            s.ShowMenu();
    }

    @Override
    void Dessert() {
        
    }

    @Override
    void Drinks() {
        
    }

   

    @Override
    void ShowMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
