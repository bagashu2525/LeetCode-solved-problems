import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sum);
    }
    /*
     * Integer.parseInt() only supports values up to 2^31 - 1 (for positive
     * numbers). If the binary strings are large, this will cause an overflow.
     */

    public String addBinaryBigInteger(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        return sum.toString(2);
    }
    /*
     * new BigInteger(a, 2) converts a binary string to BigInteger.
     * num1.add(num2) performs the binary addition safely.
     * .toString(2) converts the sum back to a binary string.
     */

    public String addBinaryWithoutWrapperAndBigInteger(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int base = 2;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            if (sum >= base) {
                carry = 1;
                sum -= base;
            } else {
                carry = 0;
            }
            result.append(sum);
        }
        if (carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary ob = new AddBinary();
        System.out.println(ob.addBinary("11", "1"));
        ;
        System.out.println(ob.addBinaryBigInteger("11", "1"));
        ;
        System.out.println(ob.addBinaryWithoutWrapperAndBigInteger("110", "101"));
    }
}
