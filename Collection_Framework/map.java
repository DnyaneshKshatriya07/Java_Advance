import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {

        Map cars= new HashMap();
        cars.put("Audi",3);
        cars.put("BMW",4);
        cars.put("sedun",2);
        cars.put("Maruti",7);

        System.out.println(cars);

        cars.remove("BMW");
        System.out.println(cars);

        System.out.println(cars.size());
        System.out.println(cars.get("Maruti"));
    }
}