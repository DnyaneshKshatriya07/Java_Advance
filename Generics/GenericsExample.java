// Generic class
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Generic method
class GenericMethods {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Using generic class
        Box<Integer> integerBox = new Box<>(42);
        System.out.println("Integer value: " + integerBox.getValue());

        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String value: " + stringBox.getValue());

        // Using generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "orange"};

        System.out.print("Integer array: ");
        GenericMethods.printArray(intArray);

        System.out.print("String array: ");
        GenericMethods.printArray(stringArray);
    }
}
