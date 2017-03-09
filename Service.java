
package question_2;


public class Service {
    String Description;
    int Price;
    int Time;
    
    public  Service(String Description,int Price,int Time){

        this.Description=Description;
        this.Price=Price;
        this.Time=Time;
    }
    
    
    //setters
    void setTime(int Time){
        this.Time=Time;
    }
    
    void setPrice(int Price){
        this.Price=Price;
    }
    
    void setDescription(String Description){
        this.Description=Description;
    }
    
    //getters
    
    int getTime(){
        return Time;
    }
    
    int getPrice(){
        return Price;
    }
    
    String getDescription(){
        return Description;
    }
    
    //display
    
    String display(){
        
        return getDescription().toString()+"\t\t"+String.valueOf(Price)+"\t\t"+String.valueOf(getTime()+"\n");
    }
    
}


