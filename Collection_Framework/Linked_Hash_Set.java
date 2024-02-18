import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set{

    public static void main(String[] args) {

        Set<String> lhsetObj = new LinkedHashSet<String>();
        lhsetObj.add("Item1");
        lhsetObj.add("Item2");
        lhsetObj.add("Item3");
        lhsetObj.add("Item4");
        lhsetObj.add("Item5");
        lhsetObj.add("Item6");
        lhsetObj.add("Item6"); //add duplicate

        //Print
        System.out.println(lhsetObj);

        //Iterate using for each loop
        System.out.println();
        for(String str: lhsetObj)
        {
            System.out.print(str+" ");
        }
        System.out.println();

        System.out.println("Size of LinkedHashSet is :: "+lhsetObj.size());
        System.out.println("Is LinkedHashSet empty :: "+lhsetObj.isEmpty());
        System.out.println("Does it contain Item4 :: "+lhsetObj.contains("Item4"));
        System.out.println("Removing Item2 :: "+lhsetObj.remove("Item2"));
        System.out.println(lhsetObj);

        //Iterate using iterator
        System.out.println("Using Iterator");
        Iterator<String> itrs=lhsetObj.iterator();
        while(itrs.hasNext())
        {
            System.out.print(itrs.next()+" ");
        }
        System.out.println();

    }

}
