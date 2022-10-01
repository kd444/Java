import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(9);
        System.out.println(firstFivePrimeNumbers);

        // How to create an ArrayList from another collection using the
        // ArrayList(Collection c) constructor.
        // How to add all the elements from an existing collection to the new
        // ArrayList using the addAll() method.
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();

        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);

        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

    }
}
