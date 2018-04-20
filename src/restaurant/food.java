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
public class food extends Menu {
public int id;
public String FoodName;
public int price;
public Map<String, String> m1;


    @Override
    void Food() {
       
        
        Scanner Sc = new Scanner(System.in);
      
            int m;
            m1 = new HashMap<String, String>();
            
            do {
                String strI = null;
                StringBuilder sb = new StringBuilder();
        System.out.println("==================");        
        System.out.println("เมนูอาหาร");
        System.out.println("1.ต้มยำกุ้ง 300 ฿");
        System.out.println("2.ผัดผักบุ้ง 200 ฿");
        System.out.println("3.ไก่ทอดน้ำปลา 90 ฿");
        System.out.println("4.ไก่อบสมุนไพร 99 ฿");
        System.out.println("0. ออก");
        System.out.print("เลือกอาหาร : ");
             m =Sc.nextInt ();
             
            System.out.print("จำนวน:");
             int y = Sc.nextInt();
              String value = null;
              int amount = 0;
          switch(m){
              
              case 1:  amount =300*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("ต้มยำกุ้ง", strI);
              break;
              case 2: amount =80*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("ผัดผักบุ้ง", "80");
              break;
              case 3: amount =90*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("ไก่ทอดน้ำปลา", "90");
              break;
              
              case 4:amount =99*y;
                   sb.append(amount);
                    strI = sb.toString();
                  m1.put("ไก่อบสมุนไพร", "99");
              break;
              default:m1.put(" "," "); 
              break;
              
              
             
             
          }
        //
          
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
