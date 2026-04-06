// PROBLEM: Check if number is Armstrong
// SOURCE: Striver Sheet - Basics
// APPROACH: Sum of digits raised to power of digit count
// TIME: O(log n)

class Armstrong {
    public boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int arms = 0;
        while (n != 0) {
            int rem = n % 10;
            arms += (int) Math.pow(rem, digits);
            n /= 10;
        }
        return arms == original;
    }
}