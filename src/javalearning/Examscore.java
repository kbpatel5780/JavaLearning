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
public class Examscore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b;
        b=true;
        int score;
        score=85;
        System.out.println(10<23);//true
        System.out.println(55>=55);//true
        System.out.println(100>101);//false
        System.out.println(200<=305);//true
        
        if(score<50){
            System.out.println("Grade is F");
        }
        else if(score>=60 && score<70){
            System.out.println("Grade is D");
         }else if(score>=70 && score<80){
              System.out.println("Grade is C");
         }else if(score>=80 && score<90){
             System.out.println("Grade is B");
         }else if(score>=90 && score<=100 ){
             System.out.println("Grade is A");
         }
             
             System.out.println("Program Ends");
         }
        
    }
    

