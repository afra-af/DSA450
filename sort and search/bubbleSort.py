'''
Given an Integer n and a list arr. Sort the array using bubble sort algorithm.

Examples :

Input: n = 5, arr[] = {4, 1, 3, 9, 7}
Output: 1 3 4 7 9
Input: n = 10, arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 1 2 3 4 5 6 7 8 9 10
'''
class Solution:
    #Function to sort the array using bubble sort algorithm.
    def bubbleSort(self,arr, n):
        # code here
        # swaps happens till n times
        for i in range(n):
            #if i=0 it will and j=i-1 j will be -1,
            #so do n-i-1 4-0-1=3 swapping will happen till n=3 index and last element will not be considered for adjacent comparision
# to do adjacent comparion and swap , do comparision till n-2 index ony
            for j in range(n-i-1):
                if arr[j]>arr[j+1]:
                    arr[j],arr[j+1]=arr[j+1],arr[j]
        return arr
