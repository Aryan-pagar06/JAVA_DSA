// PROBLEM: Print numbers 1 to N using recursion
// SOURCE: Striver Sheet - Basics
// APPROACH: Recursion - print then call next
// TIME: O(n)

public class PrintUsingRecursion {
       public void printNumbers(int n) {
        if (n == 0) return; 
        printNumbers(n - 1);
        System.out.println(n);   
    }
}
