// PROBLEM: Sort an array using Selection Sort
// SOURCE: Striver Sheet - Sorting Techniques - I
// APPROACH: Find minimum element in unsorted portion, swap with current position
// TIME: O(n²)

class Solution {
    public int[] selectionSort(int[] nums) {
        int minpos,temp;
        for(int i=0; i<nums.length-1; i++) {
            minpos = i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[minpos] > nums[j]) {
                    minpos = j;
                }
            } if(minpos != i) {
                temp = nums[minpos];
                nums[minpos] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}