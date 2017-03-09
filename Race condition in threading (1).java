package racedemo;

public class RaceDemo {

    
    public static void main(String[] args) {
       Racer race=new Racer();
       Thread hare=new Thread(race,"hare");
       Thread tortoise=new Thread(race,"tortoise");
    //   hare.setPriority(1);
    //   tortoise.setPriority(10);
       hare.start();
       tortoise.start();
       
       
    }
    
}
