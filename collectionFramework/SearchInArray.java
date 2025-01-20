import java.util.Arrays;
import java.util.List;

public class SearchInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;

        // Convert array to List
        List<Integer> numberList = Arrays.stream(numbers).boxed().toList();
        //var numberList = Arrays.stream(numbers).boxed().toList();

        // Check if the target is present in the list
        if (numberList.contains(target)) {
            System.out.println("Target found!");
        } else {
            System.out.println("Target not found.");
        }
    }
}
