// PROBLEM: Find all divisors of a number
// SOURCE: Striver Sheet - Basics
// APPROACH: Loop from 1 to n, collect divisors, store in an array then copy in a new array
// TIME: O(n)

class PrintDivisors {
    public int[] divisors(int n) {
       int[] temp = new int[100];
       int k=0;
       for(int i=1; i<=n; i++) {
        if(n % i == 0 ) {
            temp[k]=i;
            k++;
        }
       }
       int[] solution = new int[k];
       for(int i=0; i<k; i++) {
        solution[i]=temp[i];
       }
       return solution;
    }
}