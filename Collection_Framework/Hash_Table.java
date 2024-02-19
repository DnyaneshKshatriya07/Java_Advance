import java.util.Hashtable;

public class Hash_Table {

    public static void main(String[] args) {

        Hashtable<Integer,String> htable = new Hashtable<>();
        htable.put(0,"Item0");
        htable.put(1,"Item1");
        htable.put(2,"Item2");
        htable.put(3,"Item33");

        System.out.println(htable);

        //iterate
        for(Integer it : htable.keySet())
        {
            System.out.println(it+"  "+htable.get(it));
        }

        System.out.println(htable.hashCode());
        System.out.println(htable);
        System.out.println("Item at index  is :: "+htable.get(3));
        System.out.println(htable.size());
        System.out.println(htable.contains("Item21"));
        htable.remove(3); //removed key and corres[onding value as well
        System.out.println(htable);







    }

}
