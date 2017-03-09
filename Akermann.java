
package akermann;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;


public class Akermann {

    public int akn(int m,int n){
 
    int ans;
    if(m==0){
        ans=n+1;
    }
    else if(n==0){
        ans=akn(m,n-1);
    }
    else{
     ans=akn(m-1,akn(m,n-1));   
    }
    return ans;
    
    }
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        Akermann A= new Akermann();
        
        System.out.print(A.akn(2,90));
       
        
    }    

    
}
