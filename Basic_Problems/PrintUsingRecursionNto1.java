// PROBLEM: Print numbers 1 to N using recursion
// SOURCE: Striver Sheet - Basics
// APPROACH: Recursion - print first then call
// TIME: O(n)

public class PrintUsingRecursionNto1 {
       public void printNumbers(int n) {
        if (n == 0) return; 
        printNumbers(n - 1);
        System.out.println(n);   
    }
}

