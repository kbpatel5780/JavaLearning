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
public class variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int id;
        id=40;
        System.out.println("id="+id);
        String name;
        name="Bob";
        System.out.println("name="+name);
        double price;
        price=500.99;
        System.out.println("price="+price);
        id=50;
        System.out.println(id);
        id=50+45;
        System.out.println(id);
        System.out.println(45+5);
        System.out.println(3.99+5.51);
        System.out.println(3.99-5.51);
        System.out.println(7000*3);
        System.out.println(10/3);
        System.out.println(10./3);
        System.out.println(10%3);
        System.out.println(10%2);
        int i=5;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(i++);
        int j=++i;//prefix
        System.out.println(j);
        j=i++;//suffix
        System.out.println(j);
        System.out.println(i);
        int a=10;
        int b=3;
        System.out.println(a/b);
        double c=10;
        int d=3;
        System.out.println(c/d);
        
        
        String str="Hello World";//declaration and initialization of string
        System.out.println(str);
        char ch;
        ch='A';
        String str1="Another String";
        String str2=str+str1;//string concatanation--combine strings
        System.out.println(str2);
        String str3=i+str;
        System.out.println(str3);
        
                
        
        
        
    }
    
}
