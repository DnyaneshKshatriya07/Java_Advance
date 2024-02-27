package Comparable_N_Comparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator1{
    public static void main(String[] args) {

        ArrayList<Stud> studs=new ArrayList<>();
        studs.add(new Stud("pqr",987654320,"pqr@gmail.com"));
        studs.add(new Stud("abc",123456890,"abc@gmail.com"));
        studs.add(new Stud("xyz",234576112,"xyz@gmail.com"));

        System.out.println(studs);

        Collections.sort(studs, new phoneCompare());
        System.out.println("AFTER SORTING:- ");

        System.out.println(studs);

    }
}

