/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:

Input: 
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
*/
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                list.add(i+1);
            }
            
        }
        return list;
    }
}
