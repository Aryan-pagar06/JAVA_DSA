// PROBLEM: Check if the number is a palindrome
// SOURCE: Striver Sheet - Basics | LeetCode #9
// APPROACH: Reverse the number and compare with original
// TIME: O(log n)

class PalindromeNumber {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev == original;
    }
}