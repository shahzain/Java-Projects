/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package join;

import java.lang.Thread.State;


public class Join extends demo {
public static Thread t1;
public static Thread t2;

    
    public static void main(String[] args) {
        demo d1=new demo();
        demo d2=new demo();
        
        
        t1=new Thread(d1);
        t2=new Thread(d2);
        t1.start();
        
        while(true){
            State s1=t1.getState();
            State s2=t2.getState();
            
            System.out.println(System.nanoTime()+" first thread status "+s1);
           
            System.out.println(System.nanoTime()+" second thread status "+s2);
            
            if(( s1.equals(State.TERMINATED)) && (s2.equals(State.TERMINATED))) {
                break;
            }
        }
        
    }
    
}
