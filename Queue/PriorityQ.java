import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(30, 10, 20, 5));
        System.out.println("Iterating using for-each:");
        for (int num : pq) {
            System.out.println(num); // Order is NOT guaranteed
        }
    }
}
