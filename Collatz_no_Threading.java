/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatz_no_threading;

/**
 *
 * @author Toshiba
 */
public class Collatz_no_Threading {
    
    public static void collatz(int n) {
        
        System.out.print(n + " ");
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(3*n + 1);
        
    }

    public static void main(String[] args) {
        
        for(int i=1;i<200;i++){
        System.out.println("");
        System.out.print("For "+ i+" : ");
        collatz(i);  
    }
}
}