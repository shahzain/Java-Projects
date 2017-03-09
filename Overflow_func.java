
package hard;

import java.util.Stack;

public class hard1 {

  public int hard1(int a,int b){
      
     
      int ans;
      if(a==0){
          ans=b+1;
      }
      else if(b==0){
          ans=hard1(a-1,1);
      }
      else{
          ans=hard1(a-1,hard1(b,b-1));
      }
      return ans;
  }
  
}

