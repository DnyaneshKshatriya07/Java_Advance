
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {

        Set<String> tobj1 = new java.util.TreeSet<>();
        tobj1.add("Item1");
        tobj1.add("Item2");
        tobj1.add("Item4");
        tobj1.add("Item3");
        tobj1.add("Item5");
        tobj1.add("Item6");
        tobj1.add("Item6"); //try to add duplicate items

        System.out.println(tobj1); //order is based on their values.
        System.out.println("Size of treeset is :: "+tobj1.size());

        //Iterate
        System.out.println();
        for(String str : tobj1)
        {
            System.out.print(str+" ");
        }
        System.out.println();

        System.out.println(((TreeSet<String>) tobj1).first());
        System.out.println(((TreeSet<String>) tobj1).last());

        boolean checkIfEmpty = tobj1.isEmpty();
        System.out.println("checkIfEmpty :: "+checkIfEmpty);

        tobj1.remove("Item1");
        System.out.println("After removing item1"+tobj1);


        //clear
        tobj1.clear();
        System.out.println("After performing clear operation:: "+tobj1);

        boolean checkIfEmpty1 = tobj1.isEmpty();
        System.out.println("checkIfEmpty1 :: "+checkIfEmpty1);

    }

}
