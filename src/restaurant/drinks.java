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
public Map<String, String> m1;
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
            m1 = new HashMap<String, String>();
            do {
                String strI = null;
                StringBuilder sb = new StringBuilder();
        System.out.println("เมนูเครื่องดื่ม");
        System.out.println("1.น้ำผลไม้ 50 ฿");
        System.out.println("2.น้ำอัดลม 30 ฿");
        System.out.println("3.น้ำหวาน 30 ฿");
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
                  m1.put("น้ำผลไม้", "50");
              break;
              case 2:amount =30*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("น้ำอัดลม", "30");
              break;
              case 3:amount =30*y;
                   sb.append(amount);
                    strI = sb.toString(); 
                  m1.put("น้ำหวาน", "30");
              break;
             
              default:m1.put(" "," ");           
          }
          //System.out.println(strI);
        
            }while( m!=0 );
            showmenu s = new showmenu();
            s.ShowMenu();
    }

   
    @Override
    void ShowMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
