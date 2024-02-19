import java.util.TreeMap;

public class Tree_Map {

    public static void main(String[] args) {
        TreeMap<Integer,String> trMap = new TreeMap<>();
        trMap.put(0, "Item0");
        trMap.put(1, "Item1");
        trMap.put(2, "Item2");
        trMap.put(3, "Item3");
        trMap.put(4, "Item4");
        trMap.put(5, "Item5");
        trMap.put(6, "Item6");
        trMap.put(6, "Duplicate Item6"); //it overrides
        trMap.put(9, "Item9");
        trMap.put(8, "Item8");
        trMap.put(7, "Item7");

        System.out.println(trMap);

        //iterate
        for(Integer it : trMap.keySet())
        {
            System.out.println(it+"  "+trMap.get(it));
        }


        System.out.println(trMap.size());
        System.out.println(trMap.subMap(1, 5));
        System.out.println(trMap.subMap(1, true, 5, true));
        System.out.println(trMap.firstEntry());
        System.out.println(trMap.firstKey());
    }

}
