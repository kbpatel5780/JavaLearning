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
public class rectangle {
    private double length;//privaate double length=10;
    private double width;//private double width =10;
    public void setLength(double l){
       
      if(l>0){
         length =l;  
      }
    }
    public double getLength(){
        return length;
    }//public rectangle{
    public void setWidth(double w){
        if(w>0){
            width =w;
        }
    }
    public double getWidth(){
        return width;
    }
            
    
    public double area(){
        return length*width;
        
    }
    public double perimeter(){
        return 2*(length+width);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       rectangle r1;
       r1= new rectangle();
       r1.length=10;
       r1.width=20;
        System.out.println("Area="+r1.area());
        System.out.println("Perimeter="+r1.perimeter());
        
        
        rectangle r2= new rectangle();
       r2.length=20;
       r2.width=50;
        System.out.println("Area="+r2.area());
        System.out.println("Perimeter="+r2.perimeter());
        
        
        
    }
    
    
}
