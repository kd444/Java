
import java.util.ArrayList;
import java.util.Collection;

import javax.lang.model.element.Element;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitcollection = new ArrayList<>();
        fruitcollection.add("banana");
        fruitcollection.add("apple");
        fruitcollection.add("mango");
        System.out.println(fruitcollection);

        fruitcollection.remove("banana");
        System.out.println(fruitcollection);

        System.out.println(fruitcollection.contains("apple"));
        fruitcollection.forEach((element) -> System.out.println(element));

        fruitcollection.clear();
        System.out.println(fruitcollection);
    }

}
