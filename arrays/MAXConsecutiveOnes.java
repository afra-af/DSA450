/**
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
**/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //Initialize two variables: maxCount and currentCount to 0. These variables are used to keep track of the maximum consecutive ones encountered so far (maxCount) and the current streak of consecutive ones (currentCount).
        int maxcount=0;
        int currcount=0;
        for(int i: nums){
            //Check if num is equal to 1 using the condition if (num == 1). If it is, that means we've encountered another consecutive one.
            if(i==1){
                //If num is 1, increment the currentCount variable by 1. This represents an extension of the current streak of consecutive ones.
                currcount++;
                //Now, compare maxCount with currentCount using Math.max(maxCount, currentCount). This updates maxCount to be the maximum value between its current value and the currentCount. This step ensures that maxCount always holds the maximum number of consecutive ones encountered so far.
                maxcount=Math.max(maxcount,currcount);
            }
            else{
                //If num is not 1 (meaning we've encountered a 0), reset currentCount to 0. This effectively ends the current streak of consecutive ones.
                currcount=0;
            }
        }
        return maxcount;
    }
}
