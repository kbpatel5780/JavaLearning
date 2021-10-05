/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 *
 * @author khyati
 */
public class mymethod1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("add="+add(5,6,7));
        System.out.println("add="+add(50,-60,-10));
        
    }
      private static int add(int a, int b, int c){
        
        int add = a+b+c;
           return add;
      }
       
}
   
    

