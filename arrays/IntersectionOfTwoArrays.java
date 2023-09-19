/**
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000


**/
/*
The intitution is 
1. sort both the array 
2.here we will use two pointer to check element from both the array 
as both the array are sorted so we will adjust the array index by comparing the array values 

*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(i > 0 && nums1[i] == nums1[i-1]){ //condition for remove the duplicate element . because the result should have unique elements
                i++;
                continue;
            }
            if(nums1[i] == nums2[j]){ // if both the array has same element then put that element in the list 
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){ // as both the array is sorted, so adjust the index by comparing the element
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
        }
        
        int[] ans = new int[list.size()]; // store the list value in an array 
        for(int k = 0; k < ans.length; k++){
            ans[k] = list.get(k);
        }
        return ans;
    }
}
