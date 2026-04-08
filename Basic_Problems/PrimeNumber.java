// PROBLEM: Check if a number is prime
// SOURCE: Striver Sheet - Basics
// APPROACH: Count divisors till √n, prime has exactly 2 divisors
// TIME: O(√n)

public class PrimeNumber {
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) count++;
            }
        }
        return count == 2;
    }
}