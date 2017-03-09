package question_1;

import java.util.LinkedList;


public class student  {
     int roll_no;
     String grade;
    
    student(int roll_no,String grade) throws GradeException 
    {
        
        this.roll_no=roll_no;
        this.grade= grade;
        
        
        if(!grade.equalsIgnoreCase("A") && !grade.equalsIgnoreCase("B") && !grade.equalsIgnoreCase("C") &&
           !grade.equalsIgnoreCase("D") && !grade.equalsIgnoreCase("E") && !grade.equalsIgnoreCase("F")){
           setGrade("I");
           //throw new GradeException();     
        }
        
        
        
    }
    
    String getGrade(){
        return grade;
    }
    
    void setGrade(String I){
        this.grade=I;
    }
    
    public String print() throws GradeException
    {
        
        return "Roll number "+roll_no+" "+" Grade: "+grade+"\n";
    }
}