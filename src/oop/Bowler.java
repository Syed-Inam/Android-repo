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
class Bowler extends Player
{
    int wickets  = 0;
    
    @Override
    public void TotalWickets(int b)
    {
         
        wickets += b;
        System.out.println("Total wickets bowled: " + wickets);
    }
    
    @Override
    public void TotalRuns(int a)
    {
        
    }
}

