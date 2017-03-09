
package question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question_2 {

 
    public static void main(String[] args) {
        
            LinkedList<Service> services = new LinkedList<>();
            
            services.add(new Service("Cut      ",8,15));
            services.add(new Service("Shampoo  ",4,10));
            services.add(new Service("Manicure ",18,30));
            services.add(new Service("Style    ",48,55));
            services.add(new Service("Permanent",18,35));
            services.add(new Service("Trim     ",6,5));
            
            System.out.println("Service Description\tPrice\t\tTime");
            System.out.println("--------------------------------------------");
            for (Service element : services)
            System.out.print(element.display());
            
            
            
            //ascending wrt time
            List<Service> sortedByTime = new ArrayList<Service>(services);
    
                Collections.sort(sortedByTime, new Comparator<Service>() {
            
                public int compare(Service s1, Service s2) {
                return Integer.valueOf(s1.Time).compareTo(s2.Time);
            
                                                            }
                                                                       }
                                    );
                
                
                
                
                
          //ascending order wrt Price
                
                List<Service> sortedByPrice = new ArrayList<Service>(services);
    
            Collections.sort(sortedByPrice, new Comparator<Service>() {
            
                public int compare(Service s1, Service s2) {
                return Integer.valueOf(s1.Price).compareTo(s2.Price);
            
                                                            }
                                                                       }
                                    );
            
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\nPress 1 To print in Ascending order with respect to Time");
            System.out.println("Press 2 To print in Descending order with respect to Time");
            System.out.println("Press 3 To print in Ascending order with respect to Price");
            System.out.println("Press 4 To print in Descending order with respect to Price");
            int choice = scanner.nextInt();
            
            
            
            

        switch (choice) {
            case 1:  
                
            //ascending order with respect to time
                System.out.println("Service Description\tPrice\t\tTime");
                System.out.println("--------------------------------------------");
                sortedByTime.stream().forEach((element) -> {
                    System.out.print(element.display());
            });
            
                break;
                
            case 2: 
                //descending order with respect to time
                System.out.println("Service Description\tPrice\t\tTime");
                System.out.println("--------------------------------------------");
                for(int i=sortedByTime.size()-1;i>-1;i--){
                System.out.print(sortedByTime.get(i).display());
            }
                break;
                
            case 3:  
                
            //ascending order wrt Price
                System.out.println("Service Description\tPrice\t\tTime");
                System.out.println("--------------------------------------------");
                sortedByPrice.stream().forEach((element) -> {
                System.out.print(element.display());
            });
                break;
                
            case 4:
                
                //descending order wrt Price
                System.out.println("Service Description\tPrice\t\tTime");
                System.out.println("--------------------------------------------");
                for(int i=sortedByPrice.size()-1;i>-1;i--){
                System.out.print(sortedByPrice.get(i).display());
            }
                
                break;
                
            default:
                System.out.println("Choose the right option.");
                break;    
    }

            
            
            
            
            
            
            
            
            

            
            
            
            

            
            
            
}
}
