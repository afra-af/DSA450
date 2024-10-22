class Solution:
    def merge(self, arr, l, m, r):
        temp = []
        left = l
        right = m + 1
        
        # Merge the two halves
        while left <= m and right <= r:
            if arr[left] <= arr[right]:
                temp.append(arr[left])
                left += 1
            else:
                temp.append(arr[right])
                right += 1
        
        # If there are remaining elements in the left half
        while left <= m:
            temp.append(arr[left])
            left += 1
        
        # If there are remaining elements in the right half
        while right <= r:
            temp.append(arr[right])
            right += 1
        
        # Copy the merged elements back into the original array
        for i in range(l, r + 1):
            arr[i] = temp[i - l]
        
        return arr
    
    def mergeSort(self, arr, l, r):
        if l >= r:
            return
        
        m = (l + r) // 2
        self.mergeSort(arr, l, m)    # Sort the left half
        self.mergeSort(arr, m + 1, r)  # Sort the right half
        self.merge(arr, l, m, r)     # Merge the sorted halves

