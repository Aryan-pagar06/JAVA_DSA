// PROBLEM: Check if a string is palindrome using recursion
// SOURCE: Striver Sheet - Basics | LeetCode #125
// APPROACH: Recursion - compare first and last char, check middle
// TIME: O(n)

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // to clean a string
        return palindromeCheck(s);
    }
    
    private boolean palindromeCheck(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return palindromeCheck(s.substring(1, s.length() - 1));
    }
}