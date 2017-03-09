
package yield;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import static yield.Yield.t10;


public class demo implements Runnable {
    public void run(){
        System.out.println("Entering " +Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
        Thread.yield();
        System.out.println("Leaving " +Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
   
        try{
        if(Thread.currentThread().getName().equals("t1")){
       System.out.println("inside join condition");
       t10.start();
       Yield.t10.join();
        }
        }
        catch(NullPointerException e){
          System.out.println("!! Exception");
        } catch (InterruptedException ex) {
            Logger.getLogger(demo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        if(Thread.currentThread().getName().equals("t10")){
       System.out.println("inside 10");
      
        }
        }
       
        } 
       /*
        try{
        if(Thread.currentThread().getName().equals("t3")){
       System.out.println("inside join condition");
       Yield.t8.start();
       Yield.t8.join();
        }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        try{
        if(Thread.currentThread().getName().equals("t4")){
       System.out.println("inside join condition");
       Yield.t7.start();
       Yield.t7.join();
        }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        try{
        if(Thread.currentThread().getName().equals("t5")){
       System.out.println("inside join condition");
       Yield.t6.start();
       Yield.t6.join();
        }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
      
        
       */
        
        
        
        
        
   
