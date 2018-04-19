/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Komgrit
 */
public class dessert extends Menu {
public Map<String, String> m1;


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
        System.out.println("เมนูของหวาน");
        System.out.println("1.ขนมเปียกปูน 50 ฿");
        System.out.println("2.กล้วยบวชชี 50 ฿");
        System.out.println("3.ไอศครีม 50 ฿");
        System.out.println("0. ออก");
        System.out.println("เลือกเมนูเครื่องดื่ม : ");
             m =Sc.nextInt ();
             System.out.println("จำนวน ?");
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
             
              default:m1.put(" "," ");           
          }
         // System.out.println(strI);
        System.out.println(m1);
            }while( m!=0 );
            
         
            
            showmenu s = new showmenu();
            s.ShowMenu();
        
    }
    public Map value(){
    return m1;
    }

    @Override
    void Drinks() {
        
    }
    @Override
    void ShowMenu() {
      
    }

  
    
}
