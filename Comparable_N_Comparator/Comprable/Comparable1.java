package Comparable_N_Comparator.Comprable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1{
    public static void main(String[] args) {

        ArrayList<Emp> emps=new ArrayList<>();
        emps.add(new Emp("pqr",987654320,"pqr@gmail.com"));
        emps.add(new Emp("abc",123456890,"abc@gmail.com"));
        emps.add(new Emp("xyz",234576112,"xyz@gmail.com"));

        System.out.println(emps);

        Collections.sort(emps);
        System.out.println("AFTER SORTING:- ");

        System.out.println(emps);

    }
}

