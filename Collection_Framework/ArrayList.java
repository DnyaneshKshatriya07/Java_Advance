import java.util.Collection;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        Collection<String> c=new java.util.ArrayList<>();

        c.add("chandwad");
        c.add("Nashik");
        c.add("Maharashtra");


        System.out.println(c);

        c.remove("Nashik");
        for(String str: c){
            System.out.print(str+" ");
        }
    }
}
