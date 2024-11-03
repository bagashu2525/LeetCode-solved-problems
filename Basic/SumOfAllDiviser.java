/*Given a positive integer n, The task is to find the value of Σi from 1 to n F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

Examples:

Input: n = 4
Output: 15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
So, F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7 = 15
Input: n = 5
Output: 21
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
F(5) = 1 + 5 = 6
So,  F(1) + F(2) + F(3) + F(4) + F(5)
    = 1 + 3 + 4 + 7 + 6 = 21
Input: n = 1
Output: 1
Explanation:
F(1) = 1
So,  F(1) = 1 
 */
import java.util.Scanner;

public class SumOfAllDiviser {
    /*
    public static long F(int n){
        long sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static long sumOfDivisors(int n) {
        // code here
        int sumDividor=0;
        for(int i=1; i<=n; i++){
            sumDividor+=F(i);
        }
        return sumDividor;
    }
        */
    
        public static long sumOfDivisors(int n) {
            // code here
        long sumDivisors = 0;
    
        // For each number i, add i to all multiples of i
        for (int i = 1; i <= n; i++) {
            // Add i to the sum for each multiple of i up to n
            sumDivisors += i * (n / i);
        }
        
        return sumDivisors;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDivisors(n));
        sc.close();
    }
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 Certainly! The code provided efficiently calculates the sum of all divisors for every integer from \(1\) to \(n\). Here’s a detailed breakdown of the logic and how it improves efficiency.

### Problem Breakdown
For each integer \(i\) from \(1\) to \(n\), we want to calculate the sum of all divisors of \(i\) (all numbers that divide \(i\) without leaving a remainder). This means that if we calculate `sumOfDivisors(6)`, for example, we need to find the sum of divisors of \(1, 2, 3, 4, 5, \) and \(6\).

In the brute-force approach, for each integer \(i\), we check all numbers up to \(i\) to see if they are divisors, leading to an \(O(n^2)\) complexity. This is too slow for large \(n\). The optimized approach reduces this complexity by calculating the divisors' sum in an efficient manner.

### Code Walkthrough
Let’s look at the code line by line:

```java
public static long sumOfDivisors(int n) {
    long sumDivisors = 0;
```
- We initialize `sumDivisors` to store the cumulative sum of divisors for all numbers from \(1\) to \(n\).

```java
    for (int i = 1; i <= n; i++) {
```
- We loop over each integer `i` from \(1\) to \(n\). Here, `i` represents a potential divisor for numbers up to \(n\).

```java
        sumDivisors += i * (n / i);
    }
```
- For each integer `i`, we determine how many times `i` appears as a divisor of any number up to \(n\). This is done by calculating `(n / i)`.
  - `(n / i)` gives the count of multiples of `i` that are less than or equal to \(n\).
  - For example, if `n = 6` and `i = 2`, `(n / i) = 3`, because \(2\) is a divisor for \(2, 4,\) and \(6\).
  
- **Calculation Logic**:
  - Since `i` is a divisor for all its multiples up to \(n\), we multiply `i` by the number of times it divides numbers up to \(n\) (i.e., `n / i`).
  - So `i * (n / i)` gives the total sum contributed by `i` across all its multiples up to \(n\).
  - We then add this value to `sumDivisors`.

### Example Walkthrough

Let's see how this works with an example for `n = 6`:

#### Step-by-Step Calculation:
1. **i = 1**:
   - Multiples of 1 up to 6: \(1, 2, 3, 4, 5, 6\) (6 numbers).
   - Contribution to sum = `1 * 6 = 6`.

2. **i = 2**:
   - Multiples of 2 up to 6: \(2, 4, 6\) (3 numbers).
   - Contribution to sum = `2 * 3 = 6`.

3. **i = 3**:
   - Multiples of 3 up to 6: \(3, 6\) (2 numbers).
   - Contribution to sum = `3 * 2 = 6`.

4. **i = 4**:
   - Multiples of 4 up to 6: \(4\) (1 number).
   - Contribution to sum = `4 * 1 = 4`.

5. **i = 5**:
   - Multiples of 5 up to 6: \(5\) (1 number).
   - Contribution to sum = `5 * 1 = 5`.

6. **i = 6**:
   - Multiples of 6 up to 6: \(6\) (1 number).
   - Contribution to sum = `6 * 1 = 6`.

Adding these contributions together: \(6 + 6 + 6 + 4 + 5 + 6 = 33\).

So, `sumOfDivisors(6) = 33`.

### Efficiency Analysis
- This approach reduces the time complexity to \(O(n \log n)\) because:
  - For each integer `i` from \(1\) to \(n\), we only need to perform one operation rather than looping over all potential divisors.
  - By leveraging `(n / i)`, we efficiently account for all multiples of `i` without nested loops.
  
This is much faster than the original \(O(n^2)\) approach, allowing it to handle larger values of \(n\) within the given time limits.
 */
