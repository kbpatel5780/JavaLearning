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
public class example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int HoursWorked=40;
        double PayRate=10.0;
        double TaxRate=0.1;
        double amount=PayRate*HoursWorked;
        double tax=amount*TaxRate;
        System.out.println("Total Amount:"+amount);
        System.out.println("Tax:"+tax);
    }
    
}
