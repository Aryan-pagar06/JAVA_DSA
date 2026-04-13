// PROBLEM: Print numbers 1 to N using recursion
// SOURCE: Striver Sheet - Basics
// APPROACH: Recursion - call first then print
// TIME: O(n)

public class PrintUsingRecursion1toN {
       public void printNumbers(int n) {
        if (n == 0) return; 
        printNumbers(n - 1);
        System.out.println(n);   
    }
}
