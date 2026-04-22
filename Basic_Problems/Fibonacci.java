// PROBLEM: Find Nth Fibonacci number using recursion
// SOURCE: Striver Sheet - Basics | LeetCode #509
// APPROACH: Recursion - fib(n) = fib(n-1) + fib(n-2)
// TIME: O(2^n) - exponential

class Fibonacci {
    public int fib(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}