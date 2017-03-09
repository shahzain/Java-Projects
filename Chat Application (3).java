
package ChatApplication;


public class ChatApplication {


    public static void main(String[] args) throws InterruptedException {
      ChatWindowServer ServerWindow= new ChatWindowServer();
      ServerWindow.show(true);
      
      ChatWindowClient ClientWindow=new ChatWindowClient();
      ClientWindow.show(true);
     
     
    }
    
}
