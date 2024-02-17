import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Array_List {
    public static void main(String args[])
    {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(1);
        System.out.println(arr1);


        ArrayList<String> arrObj = new ArrayList<String>();
        arrObj.add("City1");
        arrObj.add("City2");
        arrObj.add("City3");
        arrObj.add("City4");
        arrObj.add("City5");
        arrObj.add("City5");
        arrObj.add("City5");//array may contain duplicate elements

        //ArrayList may contain null elements
        arrObj.add(null);
        arrObj.add(null);
        arrObj.add(null);

        //Print
        System.out.println(arrObj);

        //Iterate
        for(String str : arrObj)
        {
            System.out.print(str+" ");
        }
        System.out.println();

        //size of ArrayList
        System.out.println("Size of array list is :: "+arrObj.size());

        //get
        System.out.println("Element present at index 1 is :: "+arrObj.get(1));

        //indexOf
        System.out.println(arrObj.indexOf("City5")); //if not present returns -1

        System.out.println(arrObj.lastIndexOf("City5"));

        //set at index 7
        arrObj.set(7, "City6");
        System.out.println(arrObj);

        //listIterator in ArrayList
        ListIterator<String> lIterator=arrObj.listIterator();
        while(lIterator.hasNext())
        {
            System.out.print(lIterator.next() +" ");
        }

        //synch arraylist
        ArrayList<String> synchObj = new ArrayList<String>();
        synchObj.add("list1");
        synchObj.add("list2");
        List<String> listSynchObj =Collections.synchronizedList(synchObj);
        //now listSynchObj is synchronized
        System.out.println();
        System.out.println("listSynchObj :: "+listSynchObj);


    }

}
