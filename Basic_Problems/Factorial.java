// PROBLEM: Find factorial of N using recursion
// SOURCE: Striver Sheet - Basics
// APPROACH: Recursion - n * factorial(n-1), base case n==0
// TIME: O(n)

public class Factorial {
    public int factorial(int n) {
        if(n ==1) return 1;
        return n * factorial(n-1);
    }
}