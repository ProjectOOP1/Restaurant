/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static restaurant.food.m3;

/**
 *
 * @author Komgrit
 */
public class dessert extends Menu {
public static Map<String, String> m1;


    @Override
    void Food() {
        
    }

    @Override
    void Dessert() {
        Scanner Sc = new Scanner(System.in);
      
            int m;
              m1 = new HashMap<String, String>();
            do {
                String strI = null;
                StringBuilder sb = new StringBuilder();
        System.out.print("");     
        System.out.println("*****เมนูของหวาน******");
        System.out.println("1.ขนมเปียกปูน 50 ฿");
        System.out.println("2.กล้วยบวชชี 50 ฿");
        System.out.println("3.ไอศครีม 50 ฿");
        System.out.println("0. ออก");
        System.out.print("เลือกเมนูของหวาน : ");
             m =Sc.nextInt ();
             if(m==0){
                 break;
             }else if (m>3){
         System.out.println("");        
         System.out.println("กรูณาเลือกเมนูของหวานใหม่");
         System.out.println("");
         continue;
         
             }    
             System.out.print("จำนวน:");
             int y = Sc.nextInt();
              String value = null;
              int amount = 0;
          switch(m){
              
              case 1:amount =50*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("ขนมเปียกปูน", strI);
              break;
              case 2:amount =50*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("กล้วยบวชชี", strI);
              break;
              case 3:amount =50*y;
                   sb.append(amount);
                    strI = sb.toString(); 
                  m1.put("ไอศครีม", strI);
              break;
             
              default:
                  break;
          }
            System.out.println(m1);
            }while( m!=0 );
            
         
            
            showmenu s = new showmenu();
            s.ShowMenu();
        
    }


    @Override
    void Drinks() {
        
    }
    @Override
    void ShowMenu() {
      
    }

  
    
}
