import java.util.LinkedHashMap;

public class Linked_Hash_Map {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkHMap =  new LinkedHashMap<>();
        linkHMap.put(0, "Item0");
        linkHMap.put(1, "Item1");
        linkHMap.put(2, "Item2");
        linkHMap.put(3, "Item3");
        linkHMap.put(4, "Item4");
        linkHMap.put(5, "Item5");
        linkHMap.put(6, "Item6");

        System.out.println(linkHMap);

        //iterate
        for(Integer it : linkHMap.keySet())
        {
            System.out.println(it +"  " + linkHMap.get(it));
        }

        System.out.println(linkHMap.containsValue("Item31"));
        System.out.println(linkHMap.containsKey(31));
        System.out.println(linkHMap.values());
        System.out.println(linkHMap.isEmpty());


    }

}
