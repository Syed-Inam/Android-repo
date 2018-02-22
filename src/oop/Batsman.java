/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author user
 */

//implementing Inheritance 
public class Batsman extends Player {
    int runs=0;
    
//implementing Abstraction
    @Override
    public void TotalRuns(int a)
    {
        runs += a;
        System.out.println("Total runs scored: " + runs);
    }     
    
    @Override
    public void TotalWickets(int b)
    {
                
    }
       
// implementing polymorphism by method overloading
    
}
