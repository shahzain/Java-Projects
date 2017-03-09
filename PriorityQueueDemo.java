package priority_queue;

import java.util.*;

public class PriorityQueueDemo {
   public static void main(String args[]) {
   // create priority queue
   PriorityQueue < Integer >  prq = new PriorityQueue <  > (); 
       
   // insert values in the queue
   for ( int i = 0; i  <  10; i++ ){   
   prq.add (new Integer (i)) ; 
   }
      
   System.out.println ( "Priority queue values are: " + prq);
      
   // clear the queue
   prq.clear();
      
   System.out.println ( "Priority queue values after clear: " + prq);
   }
}