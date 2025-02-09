public class MultiplyString {
    public String multiply(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0) {
            return "0";
        }
        int[] total = new int[num1.length() + num2.length()];
        int p1, p2;
        for (int i = num1.length() - 1; i >= 0; i--) {

            for (int j = num2.length() - 1; j >= 0; j--) {
                p1 = i + j;
                p2 = i + j + 1;
                int c1 = num1.charAt(i) - '0';
                int c2 = num2.charAt(j) - '0';
                int mul = c1 * c2;
                int sum = mul + total[p2];
                total[p1] += sum / 10;
                total[p2] = sum % 10;

            }
        }
        String s = "";
        for (int i : total) {
            if (s.length() == 0 && i == 0)
                ;
            else
                s += i;
        }
        return s;
        /*
         * Convert array to string, skipping leading zeros
         * StringBuilder sb = new StringBuilder();
         * for (int num : result) {
         * if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
         * sb.append(num);
         * }
         * }
         */
    }

    public static void main(String[] args) {
        MultiplyString m = new MultiplyString();
        System.out.println(m.multiply("123", "456"));
        ;
    }
    /*
     * Why use StringBuilder rather than String?
     * In Java, String is immutable, meaning every time you modify a string (e.g., s
     * += i;), a new string object is created, and the old one is discarded.
     * This leads to O(n²) time complexity in worst-case scenarios due to repeated
     * memory allocations and copies.
     * 
     * On the other hand, StringBuilder is mutable, meaning it modifies the existing
     * object instead of creating a new one every time.
     * This makes it much faster, reducing the complexity of appending operations to
     * O(1) amortized time.
     * 
     * Key Advantages of StringBuilder
     * Efficient String Concatenation (Avoids O(n²) complexity)
     * 
     * Using s += i; creates a new String each time, leading to unnecessary
     * overhead.
     * StringBuilder.append(i); modifies the existing object in place, making it
     * much more efficient.
     * Reduces Memory Overhead
     * 
     * Since String is immutable, Java internally creates a new object every time
     * you modify it.
     * StringBuilder only expands its internal buffer when necessary, reducing
     * memory waste.
     * Faster Execution
     * 
     * StringBuilder.append() is O(1) amortized, while s += i; can be O(n) in the
     * worst case.
     * This results in significant performance improvements, especially for large
     * numbers.
     */
}
