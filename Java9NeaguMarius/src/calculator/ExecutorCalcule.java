/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class ExecutorCalcule {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator unCalculator = new Calculator();
        
        System.out.println("Please introduce your first number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        
        System.out.println("Please introduce operator:");        
        Scanner op = new Scanner(System.in);
        String o = op.next();
        
        
        
        
        System.out.println("Please introduce your second number:");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();
        
        System.out.println("Please introduce '=': ");
        Scanner sc2 = new Scanner(System.in);
        String eq = sc2.next();
        
        if(!"=".equals(eq)){
            
          System.out.println("Sorry, you introduced wrong data. I quit :)"); 
          System.exit(1);
           
        }
        
        
       
        if ("+".equals(o)){        
           int iesireAdunare = unCalculator.aduna(i, j);
           System.out.println("Rsult is: " + iesireAdunare);            
        }   
        else{        
            if ("-".equals(o)){        
                int iesireScadere = unCalculator.scade(i, j);
                System.out.println("Result is: " + iesireScadere);            
            } 
            else{                
                if ("*".equals(o)){        
                    int iesireInmultire = unCalculator.inmulteste(i, j);
                    System.out.println("Result is: " + iesireInmultire);            
                }
                else{        
                    if ("/".equals(o)){        
                        int iesireImpartire = unCalculator.imparteste(i, j);
                        System.out.println("Result is: " + iesireImpartire);            
                    } 
                    else{
                        System.out.println("Sorry, you introduced wrong data. I quit :)");
                        System.exit(1);
                    }
                }
            }
        }
    }    
    
   
    
}
