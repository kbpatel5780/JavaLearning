/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import oop.Circle;
import oop.rectangle;



/**
 *
 * @author khyati
 */
public class drawingapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c=new Circle();
        rectangle r1=new rectangle();//creating a new object
        r1.setLength(10);
        r1.setWidth(20);
        System.out.println("Area="+r1.area());
        System.out.println("Length:"+r1.getLength());
        System.out.println("Width:"+r1.getWidth());
    
    }
    
}
