import java.util.HashSet;
import java.util.Set;

public class Set_or_HashSet {
    public static void main(String[] args) {
        //there are two ways to initialize the set.
        //Set<String> c=new HashSet<>();
        HashSet<String> c=new HashSet<>();

        c.add("chandwad");
        c.add("chandwad");//can't print duplicate values.
        c.add("Nashik");
        c.add("Maharashtra");


        System.out.println(c);

        //iteration
        for(String str: c){
            System.out.println(str+" ");
        }

        //union
        HashSet<String> c1=new HashSet<>();
        c1.add("Yeola");
        c1.add("Maharashtra");

        c.addAll(c1);
        System.out.println("union:- "+c);

        //intersection
        HashSet<String> c2=new HashSet<>();
        c2.add("Yeola");
        c2.add("Maharashtra");

        c.retainAll(c2);
        System.out.println("intersection:- "+c);

        //difference
        HashSet<String> c3=new HashSet<>();
        c3.add("Yeola");
        c3.add("Maharashtra");

        c.removeAll(c3);
        System.out.println("difference:- "+c);
    }
}
