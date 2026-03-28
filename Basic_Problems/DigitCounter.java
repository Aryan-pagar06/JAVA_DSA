// PROBLEM: Count Digits in a Number
// SOURCE: Striver Sheet - Basics
// APPROACH: Extract digits using modulo
// TIME: O(log n)


class Digit_Counter {
    public int countDigit(int n) {
        int count=0;
        while(n != 0) {
            count++;
            n=n/10;
        }
        return count;

    }
}