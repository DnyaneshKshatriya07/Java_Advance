import java.sql.Struct;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList cars= new ArrayList();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("sedun");//for add items
        cars.add("Maruti");

        System.out.println(cars);

        cars.remove("BMW");//for delete
        System.out.println(cars);

        System.out.println(cars.size());//for size

        String place= (String) cars.get(1);//for getting the the value with name
        System.out.println(place);

        cars.set(1,"Mahendra");//for replace
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
    }
}