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
public class table {
private int numX;
private int numY;
    public void selectTable(){
        
        int x = 4;
        int y =3;
        int tableLoca[][]= new int[y][x]; 
       int number=1; 
       
       System.out.println("เลือกโต๊ะ:");
       int add0= 0; 
       for(int i=0 ; i<y ; i++){
            for(int j=0 ; j<x; j++){
                if(add0<9){
                    System.out.print("0");
                System.out.print(number);    
                System.out.print("         ");
                }else{
                   
                System.out.print(number);    
                System.out.print("         ");
                }
                tableLoca[i][j]=number;
                number++;
                add0++;
            }
            System.out.println();
        }
      
        System.out.print("เลือกโต๊ะ:");
        Scanner input = new Scanner (System.in);
        int numTable = input.nextInt();
  
        switch(numTable){
            case 1 :
                numX =0;
                numY =0;
              break  ;
            case 2 :
                numX =0;
                numY =1;
              break  ; 
            case 3 :
                numX =0;
                numY =2;
              break  ;  
            case 4 :
                numX =0;
                numY =3;
              break  ;
            case 5 :
                numX =1;
                numY =0;
              break  ;
            case 6 :
                numX =1;
                numY =1;
              break  ;
            case 7 :
                numX =1;
                numY =2;
              break  ;
            case 8 :
                numX =1;
                numY =3;
              break  ;
            case 9 :
                numX =2;
                numY =0;
              break  ;
            case 10 :
                numX =2;
                numY =1;
              break  ;
            case 11 :
                numX =2;
                numY =2;
              break  ;
            case 12 :
                numX =2;
                numY =3;
              break  ;
                
                default:numX =2; numY =3;
                    break  ;
        }
        add0 = 0;
        for(int i=0 ; i<y ; i++){
            for(int j=0 ; j<x; j++){
                
                if(tableLoca[i][j]==tableLoca[numX][numY]){
                    tableLoca[i][j]=0;
                }
               if(add0<9){
                    System.out.print("0");
                System.out.print(tableLoca[i][j]);    
                System.out.print("         ");
                }else{
                   
                System.out.print(tableLoca[i][j]);    
                System.out.print("         ");
                }
                
                number++;
                add0++;
                
            }
            System.out.println();
        }
        
      
            showmenu show = new showmenu();
            show.ShowMenu();
        }
        
        
        
        
    
    
}
