/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author khyati
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    //class method-don't need object to call method
    public static int add(int n1, int n2){
        System.out.println("Adding two integers");
        return n1+n2;
    }
    public static int add(int n1, int n2,int n3){
        System.out.println("Adding three integers");
        return  n1+n2+n3;
    }
    public static double add(int n1, double n2){
        System.out.println("Adding one integer and one double");
        return n1+n2;
    }
     public static double add(double n1, double n2){
         System.out.println("Adding two double numbers");
        return n1+n2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
       int result = Calculator.add(10, 10);
        System.out.println("Result:"+result);
        //Caluculator c1= new Calculator();
       // c1.add(10, 10);
       double r = Calculator.add(10.2,10.3);
        System.out.println("Result:"+r);
        int r1 = Calculator.add(10,20,30);
        System.out.println("Result:"+r1);
        double r2 = Calculator.add(10,20.2);
        System.out.println("Result:"+r2);
        
        
    }
    
}
