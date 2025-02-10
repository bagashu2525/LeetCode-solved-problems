import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        int sum = Integer.parseInt(a,2)+Integer.parseInt(b,2);
        return Integer.toBinaryString(sum);
    }
    public String addBinaryBigInteger(String a, String b) {
        BigInteger a1 = new BigInteger(a,2);
        BigInteger b1 = new BigInteger(b,2);
        BigInteger sum = a1.add(b1);
        return sum.toString(2);
    }
    public static void main(String[] args) {
        AddBinary ob = new AddBinary();
        System.out.println(ob.addBinary("11", "1"));;
        System.out.println(ob.addBinaryBigInteger("11", "1"));;
    }
}
