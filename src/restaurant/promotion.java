/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Komgrit
 */
public class promotion implements InterfaceMenu  {

    @Override
    public void Countmoney() {
      
    }

    @Override
    public void Promotion() {
         dessert d = new dessert ();
         System.out.println(d.value());
         
       Set<Entry<String, String>> entrySet = d.value().entrySet();
	ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String,String>>(entrySet);
        for (Entry<String, String> entry : listOfEntry) 
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}    
    }
    
}
