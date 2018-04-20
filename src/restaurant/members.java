
package restaurant;

import java.util.Scanner;


public class members {

    static int id;
    static int passwd;
    static String result;
  
    public void Admin(){
   Scanner input = new Scanner (System.in);
   do{
  System.out.print("Enter admin ID:");
  id = input.nextInt();
  
  System.out.print("Enter admin password:");
  passwd = input.nextInt();
  System.out.println(define(id,passwd));
  //System.out.println(id+" "+passwd);
   }while(result.equals("Invalid ID and Password,Pleas Enter again"));
   }
  
  public String define(int id, int passwd){
      this.id = id;
      this.passwd = passwd;
     
      if(id==123 && passwd==123){
      table t = new table();
      t.selectTable();
      }else{
         
      } 
      return result="Invalid ID and Password,Pleas Enter again";
  }
    
}
