public class SumOfNumbers {
    int sumOfSeries(int n) {
        // code here
        if (n == 0) {
            return 0; // Base case: sum of 0 is 0
        } else {
            return (n*n*n)+ sumOfSeries(n - 1); // Recursive case
        }
    }
    public static void main(String []args){
        SumOfNumbers ob = new SumOfNumbers();
        System.out.println(ob.sumOfSeries(5));;
    }
}
