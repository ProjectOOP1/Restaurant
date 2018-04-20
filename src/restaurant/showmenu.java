/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.Scanner;

/**
 *
 * @author Komgrit
 */
public class showmenu extends Menu{

    @Override
    void Food() {
        
    }

    @Override
    void Dessert() {
        
    }

    @Override
    void Drinks() {
        
    }

    

    @Override
    void ShowMenu() {
       
        // int num[]={70,80,90,99,100,1100};
        int total=0;
        System.out.println("");
         System.out.println("*****เลือกการทำงาน*****");
        System.out.println("1.อาหาร ");
        System.out.println("2.เครื่องดื่ม ");
        System.out.println("3.ของหวาน ");
        System.out.println("4.คิดราคาของหวาน ");
        System.out.println("5.คิดราคาอาหาร");
        System.out.println("6.คิดราคาเครื่องดื่ม");
        System.out.println("7.รวมเงินทั้งหมด ");
        
        
        Scanner Sc = new Scanner(System.in );
            System.out.print("เลือกเมนู :");
         int m=Sc.nextInt ();
        switch(m){
            
            case 1 :food f = new food();
                               f.Food();
                                break;
            case 2 :drinks d = new drinks();
                               d.Drinks();
                                break; 
            case 3 :dessert de = new dessert();
                                de.Dessert();
                                break;
            case 4 :promotion p = new promotion();
                                p.Promotion();
                                break;
            case 5 :promotion p1 = new promotion();
                                p1.Promotion1();
                                break;
            case 6 :promotion p2 = new promotion();
                                p2.Promotion2();
                                break;
            case 7 :countmoney mo = new countmoney();
                                mo.CountAllMoney();
                                break;
            default : showmenu me = new showmenu();
                                me.ShowMenu();
                                break;
                                        
                
        }
    }
    }
    

