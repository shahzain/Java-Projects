
package question_1;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class TestGrade {

  
    public static void main(String[] args) throws GradeException, InterruptedException {
           
        LinkedList<student> Students = new LinkedList<>();
        try{
            
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many records do you want to enter? ");
        int amount = scanner.nextInt();
            
        while(amount>0){
            
        System.out.print("Enter roll number: ");
        int roll_no = scanner.nextInt();
        
        
        System.out.print("Enter Grade ");
        String grade = scanner.next();
        
        Students.add(new student(roll_no,grade));
        
        amount--;
        
        System.out.println("");
        
        }
        
        //adding spaces
        for (int i = 0; i < 50; ++i) System.out.println();
                
        }catch(GradeException E){
         
        }
        catch(InputMismatchException E){
            
            System.out.println("Enter valid data.");
            Students.clear();
            
            Thread.sleep(2000);
            
            for (int i = 0; i < 50; ++i) System.out.println();
            
            main( new String[0]);
        }
        System.out.println("-------Student Data---------\n\n");
         for (student element : Students)
         System.out.print(element.print());
        
        
        

        
       
        
        
    }
    
}
