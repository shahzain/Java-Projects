
package join;




public class demo implements Runnable {
   
   public void run(){
      
       System.out.println(System.nanoTime()+" Current thread "+Thread.currentThread().getName()+" is at start");
      
      
      
      if(Thread.currentThread().getName().equals("t1")){
          System.out.println(System.nanoTime()+" inside join");
      }
      
      
      
    }
}
