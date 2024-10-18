'''
The task is to complete the insert() function which is used to implement Insertion Sort.


Examples:

Input: n = 5, arr[] = { 4, 1, 3, 9, 7}
Output: 1 3 4 7 9
Input: n = 10, arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 1 2 3 4 5 6 7 8 9 10

'''
class Solution:
    '''
    Function insert(int arr[], int i):
This function will handle the insertion of the element at index i into the correct position in the sorted portion of the array (from index 0 to i-1).
Use a loop to compare the current element with the elements before it, shifting elements to the right until you find the correct position for the element at index i.
Insert the element at its correct position.
    '''
    def insert(self, alist, index, n):
        #code here
        j = index
        while j > 0 and alist[j-1] > alist[j]:
            alist[j-1],alist[j] = alist[j],alist[j-1]
            j = j -1
        return alist
       
    #Function to sort the list using insertion sort algorithm.  
    '''
    Function insertionSort(int arr[], int n):
Loop through the array starting from the second element (index 1).
For each element at index i, call the insert function to place it correctly in the sorted portion.
    '''
    def insertionSort(self, alist, n):
        #code here
        for i in range(1,n):
            self.insert(alist,i,n)
