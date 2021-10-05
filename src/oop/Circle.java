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
public class Circle {
    double radius;//instance variable-attached to obect not to any method
    int centerX,centerY;
    
    double area(){
        double area=3.14*radius*radius;
        return area;
    }
    
    double circumferance(){
        double ciircumferance;
        return 2*3.14*radius;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;//declaration
        i=10; //initialization
        Circle c1;//declaration
       c1= new Circle();//initialization
       c1.centerX=0;
       c1.centerY=0;
       c1.radius=15.0;
        System.out.println("Circle c1's circle radius="+c1.radius);
        System.out.println("Circle c1's center=("+c1.centerX+","+c1.centerY+")");
        double a=c1.area();
        System.out.println("Circle c1's area ="+c1.area());
        System.out.println("Circle c1's circumferance ="+c1.circumferance());
        
        Circle c2;
        c2= new Circle();
        c2.radius=28.2;
        c2.centerX=10;
        c2.centerY=10;
        System.out.println("Circle c2's circle radius="+c2.radius);
        System.out.println("Circle c2's center=("+c2.centerX+","+c2.centerY+")");
        System.out.println("Circle c2's area ="+c2.area());       
        System.out.println("Circle c2's circumferance ="+c2.circumferance());
        
        
    }
    
}
