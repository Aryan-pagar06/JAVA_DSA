// PROBLEM: Reverse an array using recursion
// SOURCE: Striver Sheet - Basics
// APPROACH: Swap from both ends moving inward
// TIME: O(n)

public class ReverseArray {
    public void reverse(int[] arr, int n) {
        int i = arr.length - n;
        if (i >= arr.length / 2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverse(arr, n - 1);
    }
}