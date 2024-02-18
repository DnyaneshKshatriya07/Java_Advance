import java.util.LinkedList;

public class Linked_List {

    public static void main(String[] args) {

        LinkedList<Integer> linklistObj = new LinkedList<>();
        linklistObj.add(1);
        linklistObj.add(2);
        linklistObj.add(3);

        System.out.println(linklistObj);

        LinkedList<String> linkObj = new  LinkedList<String>();
        linkObj.add("City1");
        linkObj.add("City2");
        linkObj.add("City3");
        linkObj.add("City4");
        linkObj.add("City5");

        System.out.println(linkObj);
        System.out.println("Size is :: "+linkObj.size());
        //Iterate
        for(String str:linkObj)
        {
            System.out.print(str+" ");
        }
        System.out.println();
        linkObj.addFirst("City0");
        linkObj.addLast("City6");
        System.out.println(linkObj);
        System.out.println(linkObj.getFirst());
        System.out.println(linkObj.getLast());
        linkObj.removeFirst();
        linkObj.removeLast();
        System.out.println(linkObj);

        linkObj.set(1, "CityInserted");
        System.out.println(linkObj);
        linkObj.clear();
        System.out.println(linkObj);

    }

}
