/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Komgrit
 */
public class promotion implements InterfaceMenu  {
public static String[] nameFood = null;
public static int[] namePrice;
public static int price;


public static String[] nameFood1 = null;
public static int[] namePrice1;
public static int price1;

public static String[] nameFood3 = null;
public static int[] namePrice3;
public static int price3;
    @Override
    public void Countmoney() {
      
    }

    
    @Override
    public void Promotion() {
        
         dessert d = new dessert ();
         Map valueDessert = d.m1;
         
    String[] arr1 = new String[valueDessert.size()];
    String[] arr2 = new String[valueDessert.size()];
    Set entries = valueDessert.entrySet();
    Iterator entriesIterator = entries.iterator();

    int i = 0;
    nameFood = new String[arr1.length];
    namePrice = new int[arr2.length];
     price =0;
     System.out.println("------------------------");
    while(entriesIterator.hasNext()){

        Map.Entry mapping = (Map.Entry) entriesIterator.next();

        arr1[i] = mapping.getKey().toString();
        arr2[i] = mapping.getValue().toString();
        nameFood[i] = arr1[i];
        namePrice[i] = Integer.valueOf(arr2[i]);
        price+=namePrice[i];
        
        System.out.print(nameFood[i]+" ");
        i++;
    }
        System.out.print(": "+price);
    System.out.println();
    System.out.println("------------------------");
    countmoney s = new countmoney();
     s.Countmoney();
     
//         String[] valueDessertKey = (String[]) valueDessert.keySet().toArray(new String[0]);
//         String[] valueDessertMoney = (String[]) valueDessert.values().toArray(new String[0]);
//         System.out.println(Arrays.toString(valueDessertKey)+" "+Arrays.toString(valueDessertMoney));
         
    
        
//         
//         
//         
      
    
    
//         
//       
//    }
   
    }

    @Override
    public void Promotion1() {
        food f = new food();
         Map valueFood = f.m3;
        String[] arr3 = new String[valueFood.size()];
        String[] arr4 = new String[valueFood.size()];
        Set entries1 = valueFood.entrySet();
        Iterator entriesIterator1 = entries1.iterator();

        int j = 0;
        nameFood1 = new String[arr3.length];
        namePrice1 = new int[arr4.length];
         price1 =0;
         System.out.println("--------------------------");
    while(entriesIterator1.hasNext()){

        Map.Entry mapping1 = (Map.Entry) entriesIterator1.next();

        arr3[j] = mapping1.getKey().toString();
        arr4[j] = mapping1.getValue().toString();
        nameFood1[j] = arr3[j];
        namePrice1[j] = Integer.valueOf(arr4[j]);
        price1+=namePrice1[j];
        
        System.out.print(nameFood1[j]+" ");
        j++;
    }
    System.out.print(": "+price1);
     System.out.println();
    System.out.println("------------------------");
     countmoney s = new countmoney();
     s.Countmoney1();
        
    }

    @Override
    public void Promotion2() {
          drinks dr = new drinks();
         Map valueDrink = dr.m2;
    String[] arr5 = new String[valueDrink.size()];
    String[] arr6 = new String[valueDrink.size()];
    Set entries3 = valueDrink.entrySet();
    Iterator entriesIterator3 = entries3.iterator();

    int k = 0;
    nameFood3 = new String[arr5.length];
    namePrice3 = new int[arr6.length];
     price3 =0;
     //System.out.println(price3);
     System.out.println("--------------------------");
    while(entriesIterator3.hasNext()){

        Map.Entry mapping3 = (Map.Entry) entriesIterator3.next();

        arr5[k] = mapping3.getKey().toString();
        arr6[k] = mapping3.getValue().toString();
        nameFood3[k] = arr5[k];
        namePrice3[k] = Integer.valueOf(arr6[k]);
        price3+=namePrice3[k];
        
       System.out.print(nameFood3[k]+" ");
        k++;
    }
    System.out.print(": "+price3);
    System.out.println();
    System.out.println("------------------------");
    countmoney s = new countmoney();
     s.Countmoney2();
    }

    @Override
    public void Countmoney1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Countmoney2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CountAllMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
