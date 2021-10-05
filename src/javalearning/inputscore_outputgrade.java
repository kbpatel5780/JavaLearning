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
public class inputscore_outputgrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double score=82;
        double grade;
        if(score<60){
            grade=0.0;
        }else if(score<63.0){
            grade=0.7;
        }else if(score<95.0) {
           grade=0.7+(score-62)*0.1;
        }else{
            grade=4.0;
        System.out.println("grade:"+grade);
    }
    
        
    }
        
    }
    

