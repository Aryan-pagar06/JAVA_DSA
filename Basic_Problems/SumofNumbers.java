// PROBLEM: Find sum of first N numbers using recursion
// SOURCE: Striver Sheet - Basics
// APPROACH: Recursion - N + sum(N-1), base case N==0
// TIME: O(n)

public class SumofNumbers {
    public int NnumbersSum(int N) { 
        if (N==0) return 0; 
        return N + NnumbersSum(N-1); 
    }
}