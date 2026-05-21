// PROBLEM: Sort an array using Bubble Sort
// SOURCE: Striver Sheet - Sorting Techniques - I
// APPROACH: Compare adjacent elements, swap if out of order, largest bubbles to end
// TIME: O(n²)

class Solution {
    public int[] bubbleSort(int[] nums) {
        int temp;
       for(int i=0; i<nums.length; i++) {
        for(int j=0; j<nums.length-i-1; j++) {
            if(nums[j] > nums[j+1]) {
                temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
            }
        }
       }
       return nums;
    }
}

