package Java_Advance.Enum;
import Comparable_N_Comparator.Comparator.Stud;

enum Status{
    Running,Failed,Pending,Success;
}

public class Enum1{
    public static void main(String[] args) {
        Status s= Status.Running;
        System.out.println(s); 
        Status s1= Status.Failed;
        System.out.println(s1.ordinal()); 


        Status[] ss= Status.values();
        for(Status s3:ss){
            System.out.println(s3+" : "+s3.ordinal(
                
            );
        }
    }
}