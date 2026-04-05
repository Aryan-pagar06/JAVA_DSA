// PROBLEM: Find GCD of two numbers
// SOURCE: Striver Sheet - Basics
// APPROACH: Euclidean algorithm - GCD(a,b) = GCD(b, a%b)
// TIME: O(log(min(a,b)))

class GCD {
    public int GCD(int n1, int n2) {
        while (n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n1;
    }
}