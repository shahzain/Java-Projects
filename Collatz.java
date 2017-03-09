package collatz_conjecture;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Collatz implements Runnable {
 public static Thread t1;
 public static Thread t2;
 public static Thread t3;
 public static Thread t4;
 
    public synchronized  void collatz(int n) {
        System.out.print(n + " ");
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(3*n + 1);
    }

    public static void main(String[] args) {
        
        Collatz c=new Collatz();

        
      ThreadGroup allThreads=new ThreadGroup("All Threads");
      Thread t1=new Thread(allThreads,c,"c1");
      Thread t2=new Thread(allThreads,c,"c2");
      Thread t3=new Thread(allThreads,c,"c3");
      Thread t4=new Thread(allThreads,c,"c4");
      
      t1.start();
    //  t2.start();
    //  t3.start();
    //  t4.start();

    }
       
    

    @Override
    public void run()
{
          try{
       if(Thread.currentThread().getName().equals("c1")){
        for(int i=1;i<5000;i++){
        System.out.println("");
        System.out.print("For "+ i+" : ");
        collatz(i); 
    }
       t2.start();
        
        }
        }
        catch(NullPointerException e){
          System.out.println("!! Exception");
          t2.start();
        }
          
          
                    try{
       if(Thread.currentThread().getName().equals("c2")){
        for(int i=5000;i<10000;i++){
        System.out.println("");
        System.out.print("For "+ i+" : ");
        collatz(i); 
        
       t3.start();
       
    }
        }
        }
        catch(NullPointerException e){
          System.out.println("!! Exception");
        }
                    
                    
                              try{
       if(Thread.currentThread().getName().equals("c3")){
        for(int i=10000;i<15000;i++){
        System.out.println("");
        System.out.print("For "+ i+" : ");
        collatz(i); 
         t4.start();
     //  Collatz.t4.join();
    }
        }
        }
        catch(NullPointerException e){
          System.out.println("!! Exception");
        }

                              
                              
                                                          try{
       if(Thread.currentThread().getName().equals("c4")){
        for(int i=15000;i<20000;i++){
        System.out.println("");
        System.out.print("For "+ i+" : ");
        collatz(i); 
    }
        }
        }
        catch(NullPointerException e){
          System.out.println("!! Exception");
        } 
}
}