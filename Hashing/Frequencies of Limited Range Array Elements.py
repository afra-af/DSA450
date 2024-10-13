'''
You are given an array arr[] containing positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.

Note:

Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.
The elements greater than n in the array can be ignored when counting.
Examples

Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
Output: [0, 2, 2, 0, 1]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1 time, all the modifications done in the same given arr[].
Input: n = 4, arr[] = [3, 3, 3, 3], p = 3
Output: [0, 0, 4, 0]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. 3 occurring 4 times. 4 occurring 0 times.
Input: n = 2, arr[] = [8, 9], p = 9
Output: [0, 0]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. Since here P=9, but there are no 9th Index present so can't count the value.
Constraints:
1 ≤ n ≤ 105
1 ≤ p ≤ 4*104 
1 <= arr[i] <= p
'''
class Solution:
    #Function to count the frequency of all elements from 1 to N in the array.
    def frequencyCount(self, arr, N, P):
        #  do modify in the given array
        #For our test case, n = 2, so: frequency = [0, 0, 0] (length is 3, with indices 0, 1, and 2).
        freq=[0]*(N+1)
        #This starts a loop that iterates through each element in arr. 
        #For our test case, it will loop over 8 and 9.
        for i in arr:
        #Check Validity of Element: This checks whether the current number (num) is within the range 1 to n (which is 2).
        #For the first iteration with num = 8,the condition fails (8 > 2).
        #For the second iteration with num = 9, the condition also fails (9 > 2).
        #Since neither number is valid (within the range 1 to 2), the body of the if statement does not execute.
            if 1<=i<=N:
        #However, since both 8 and 9 are not in the range, this line is never executed in this test case.
                freq[i]+=1
        for i in range(1,N+1):
#For the first iteration (i = 1):
#arr[0] = frequency[1] → frequency[1] is 0 (since we never updated it), so arr[0] remains 0.
#For the second iteration (i = 2):
#arr[1] = frequency[2] → frequency[2] is also 0, so arr[1] remains 0.
            arr[i-1]=freq[i]
        return arr
        
