import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate{
    public static void main(String[] args) {
        // Create an ArrayList with integers (including duplicates)
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        HashSet<Integer> uniqueNumbers = new HashSet<Integer>(numbers);

        numbers = new ArrayList<>(uniqueNumbers);

        System.out.println("Modified list without duplicates: " + numbers);
    }
}
