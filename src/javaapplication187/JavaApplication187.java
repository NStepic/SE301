/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication187;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication187 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner sc = new Scanner (System.in);
        System.out.println("Unesite koliko brojeva zelite");
        int brojocena = sc.nextInt();
        int zbir =0;
        int max = 0;
        for (int i=0; i<brojocena; i++){
            System.out.println("Unesite ocenu");
            int ocena;
            ocena  = sc.nextInt();
            zbir += ocena; 
            if (ocena>max){
             ocena= max ;
            }
        }
            System.out.println("Prosek ocena="+(zbir)/brojocena);
            
            
            
            
          
        
       
          
      
      
     
         
         
     
       
}
}


    