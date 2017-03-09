package genericmethods;

public class GenericMethods {

    static <T> void Display(T[] Array){
        for(int i=0;i<Array.length;i++){
            if(Array[i]!=null){
            System.out.print(Array[i]+" ");
        }
           
        } System.out.println();
    }
 
    public static void main(String[] args) { 
        String[] StringNames=new String[10];
        StringNames[0]="Ali";
        StringNames[1]="Ali2";
        StringNames[2]="Ali3";
        StringNames[3]="Ali4";
        StringNames[4]="Ali5";
        
        Display(StringNames);
        
        Integer[] IntegerNames=new Integer[10];
        IntegerNames[0]=0;
        IntegerNames[1]=1;
        IntegerNames[2]=2;
        IntegerNames[3]=3;
        IntegerNames[4]=4;
        Display(IntegerNames);
    }
    
}
