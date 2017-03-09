
package racedemo;


public class Racer implements Runnable {
    String winner;
    private boolean isRaceWon=false;
    public void race(){
        for(int d=1;d<=100;d++){
            System.out.println("Distance covered by "+Thread.currentThread().getName()+ " is " +d+" meters");
            
            if((d==30)&&(Thread.currentThread().getName().equals("hare"))){
             //   try{
                    System.out.println("hare slept....");
                 //   Thread.sleep(500);
                    Thread.yield();
                   
               }
          //      catch(InterruptedException e){
          //          e.printStackTrace();
         //       }
        //    }
            
         //   boolean isWon=this.isRaceWon(d);
         //   if(isRaceWon){
         //       break;
            }
        }
 //   }
    boolean isRaceWon(int D){
        boolean iaRaceWon=false;
        if((D==100)){
            System.out.println("winner is "+Thread.currentThread().getName());
            isRaceWon=true;
           
        }
        return true;
    }

    @Override
    public void run() {
       this.race();
}
}

       
        
    
        
        
    
