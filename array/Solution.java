import java.util.*;
class Solution {
    public static void main(String[] args) {
        //int target=6;
        int nums[]={5,6,7,0,1,2,3,4};
        System.out.println(search(nums,5));
    }


    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }
            
            // Determine which half is sorted
            if (nums[left] <= nums[mid]) {  // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    // Target is in the left sorted half
                    right = mid - 1;
                } else {
                    // Target is in the right half
                    left = mid + 1;
                }
            } else {  // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    // Target is in the right sorted half
                    left = mid + 1;
                } else {
                    // Target is in the left half
                    right = mid - 1;
                }
            }
        }
        
        // If we reach here, the target was not found
        return -1;
    }
}

