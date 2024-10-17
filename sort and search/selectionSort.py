class Solution:
    #This method finds the index of the minimum element in the subarray starting from index i to the end of the array.
    def select(self, arr, i):
        # code here
        #assume the first element as mini and start comparing it with every element till last index of array
        mini=i
        for i in range(i+1,len(arr)):
            if(arr[i]<arr[mini]):
                mini=i
        return mini
        
    #Purpose: This method sorts the entire array using the Selection Sort algorithm.
    def selectionSort(self, arr,n):
        for i in range(n):
            # Sort the array using selection sort
            mini=self.select
            # Swap the found minimum element with the first element
            temp=arr[i]
            arr[i]=arr[mini]
            arr[mini]=temp
