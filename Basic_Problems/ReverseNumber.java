// PROBLEM: Reverse the digits of a number (eg. 123 --> 321)
// SOURCE: Striver Sheet - Basics | LeetCode #7
// APPROACH: Extract digits using modulo, build reversed number
// TIME: O(log n)

class ReverseNumber {
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        return reversed;
    }
}