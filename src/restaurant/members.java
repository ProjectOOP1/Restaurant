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
public class members {

    static int id;
    static int passwd;
    static String result;
    String a;
  public void Admin(){
   Scanner input = new Scanner (System.in);
   do{
  System.out.print("กรุณากรอกไอดี:");
  id = input.nextInt();
  
  System.out.print("กรุณากรอกรหัส:");
  passwd = input.nextInt();
    a = define(id,passwd);
  //System.out.println(id+" "+passwd);
   }while(result.equals(a));
   
   }
  
  public String define(int id, int passwd){
      this.id = id;
      this.passwd = passwd;
     
      if(id==123 && passwd==123){
      table t = new table();
      t.selectTable();
      
      }else{
         System.out.println("กรุณากรอกใหม่!!!!");
        
      } 
      return result="ขอบคุณครับ";
  }
    
}
