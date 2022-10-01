
import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("element1");
        myList.add("element1");
        myList.add("element2");
        myList.add("element2");
        System.out.println(myList);
        myList.add(null);
        System.out.println(myList);
        myList.add("element3");
        myList.add("element4");
        myList.add("element5");

        System.out.println(myList.get(0));

    }

}
