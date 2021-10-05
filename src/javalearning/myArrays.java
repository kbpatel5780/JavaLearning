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
public class myArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        System.out.println("1st Element:"+a[0]);
        System.out.println("2nd Element:"+a[1]);
        System.out.println("3rd Element:"+a[2]);
        a[2]=30;
        System.out.println("3rd Element:"+a[2]);
        System.out.println("4th Element:"+a[3]);
        System.out.println("5th Element:"+a[4]);
        for(int i=0;i<=4; i++){//insted of writing <=4;u canwrite <a.length
            System.out.println(" Element "+i+":"+a[i]);
        }
        System.out.println("size of array is:"+a.length);
        for(int i:a){
            System.out.println(i);
        }
    }
    
}
