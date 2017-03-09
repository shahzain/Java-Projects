
package yield;


public class Yield {
public static Thread t1;
 
 public static Thread t10;
 
    public static void main(String[] args) {
      demo d=new demo();
      
      ThreadGroup allThreads=new ThreadGroup("All Threads");
      Thread t1=new Thread(allThreads,d,"t1");
      Thread t10=new Thread(allThreads,d,"t10");
    Thread t2=new Thread(allThreads,d,"t2");
      Thread t3=new Thread(allThreads,d,"t3");
      Thread t4=new Thread(allThreads,d,"t4");
      Thread t5=new Thread(allThreads,d,"t5");
      Thread t6=new Thread(allThreads,d,"t6");
      Thread t7=new Thread(allThreads,d,"t7");
      Thread t8=new Thread(allThreads,d,"t8");
      Thread t9=new Thread(allThreads,d,"t9");
   /*    
      public static Thread t2;
 public static Thread t3;
 public static Thread t4;
 public static Thread t5;
 public static Thread t6;
 public static Thread t7;
 public static Thread t8;
 public static Thread t9;
      
      
      t1.setPriority(1);
      t2.setPriority(1);
      t3.setPriority(1);
      t4.setPriority(5);
      t5.setPriority(5);
      t6.setPriority(5);
      t7.setPriority(10);
      t8.setPriority(10);
      t9.setPriority(10);
      
       */
      
      
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
      t7.start();
      t8.start();
      t9.start();
     
      t10.start();
      t1.start();
      
     
      
    }
    
}
