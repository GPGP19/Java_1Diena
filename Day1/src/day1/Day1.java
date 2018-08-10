/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author Gita Priede
 */
public class Day1 
{

    
    public static void main(String[] args) {
       Calculation calc = new Calculation ();
       Scanner sc = new Scanner (System.in);
       
      System.out.println  ("Ievadi skaitli 1: ");
      double sk1 = sc.nextDouble();
       
      System.out.println  ("Ievadi skaitli 2: ");
      double sk2 = sc.nextDouble();
       
       double rezultats = calc.Saskaitisana ( sk1, sk2);
       System.out.println ( "Rezultats ir " + rezultats );
        
    }  
}

// system out. isak var sout + tab
// ja ir static, tad objektu nav mainā jānorāda.

   
