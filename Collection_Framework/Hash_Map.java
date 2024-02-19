import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_Map {

    public static void main(String[] args) {

        HashMap<Integer,String> hmObj = new HashMap<>();
        hmObj.put(1,"Item1");
        hmObj.put(2,"Item2");
        hmObj.put(3,"Item3");
        hmObj.put(4,"Item4");
        hmObj.put(5,"Item5");
        System.out.println("hmObj :: "+hmObj);

        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("p1", "Item1");
        hmap.put("p2", "Item2");
        hmap.put("p3", "Item3");
        hmap.put("p4", "Item4");
        hmap.put("p5", "Item5");
        hmap.put("p6", "Item6");
        hmap.put("p7", "Item7");
        hmap.put("p7", "Duplicate Item7"); //it overrides


        System.out.println("hmap :: "+hmap);

        //Iterate using keyset and foreach loop
        for(String str : hmap.keySet())
        {
            System.out.println(str + "  "+hmap.get(str) );
        }
        //Iterate
        for(Integer ir : hmObj.keySet())
        {
            System.out.println(ir + " " +hmObj.get(ir));

        }


        //Iterate using Iterator and entrySet
        System.out.println("Iterate using Iterator and entrySet");
        Iterator<Map.Entry<String,String>> iterate =hmap.entrySet().iterator();
        while(iterate.hasNext())
        {
            Map.Entry<String, String> mapEntry = iterate.next();
            System.out.println(mapEntry.getKey()+"  "+mapEntry.getValue());
        }



        System.out.println(hmap.get("p7"));
        System.out.println(hmap.size());
        System.out.println(hmap.containsKey("p6"));
        System.out.println(hmap.isEmpty());
        hmap.replace("p5","Item number is 05");
        System.out.println(hmap);




    }

}
