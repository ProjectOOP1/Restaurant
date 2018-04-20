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
public class drinks extends Menu{
public static Map<String, String> m2;
    @Override
    void Food() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Dessert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Drinks() {
        Scanner Sc = new Scanner(System.in);
      
            int m;
            m2 = new HashMap<String, String>();
            do {
                String strI = null;
                StringBuilder sb = new StringBuilder();
        System.out.println("");       
        System.out.println("******เมนูเครื่องดื่ม******");
        System.out.println("1.น้ำผลไม้ 50 ฿");
        System.out.println("2.น้ำอัดลม 30 ฿");
        System.out.println("3.น้ำหวาน 30 ฿");
        System.out.println("0. ออก");
        System.out.print("เลือกเมนูเครื่องดื่ม : ");
             m =Sc.nextInt ();
              if(m==0){
                 break;
             }else if (m>3){
          System.out.println("");       
         System.out.println("กรูณาเลือกเมนูเครื่องดื่มใหม่");
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
                  m2.put("น้ำผลไม้", strI);
              break;
              case 2:amount =30*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m2.put("น้ำอัดลม", strI);
              break;
              case 3:amount =30*y;
                   sb.append(amount);
                    strI = sb.toString(); 
                  m2.put("น้ำหวาน", strI);
              break;
             
              default:
                  break;
          }
          System.out.println(m2);
        
            }while( m!=0 );
            showmenu s = new showmenu();
            s.ShowMenu();
    }

   
    @Override
    void ShowMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
