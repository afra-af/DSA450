## SELECTION SORT
def selection_sort(arr):
    # Traverse through all array elements
    for i in range(len(arr)):
        # Find the minimum element in remaining unsorted array
        min_index = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        # Swap the found minimum element with the first element
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr

# Example usage
arr = [64, 25, 12, 22, 11]
sorted_arr = selection_sort(arr)
print("Sorted array:", sorted_arr)
time complexity of O(n^2)


## Bubble sort
def bubble_sort(arr):
    n = len(arr)
    # Traverse through all array elements
    for i in range(n):
        # Last i elements are already sorted
        for j in range(0, n - i - 1):
            # Swap if the element found is greater than the next element
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

# Example usage
arr = [64, 34, 25, 12, 22, 11, 90]
sorted_arr = bubble_sort(arr)
print("Sorted array:", sorted_arr)
Time Complexity: O(n^2)in the average and worst cases, as every pair of elements is compared.
Space Complexity: O(1), as it is an in-place sort.

## Insertion Sort:
def insertion_sort(arr):
    # Traverse from the second element to the end of the list
    for i in range(1, len(arr)):
        key = arr[i]
        # Move elements of arr[0...i-1] that are greater than key to one position ahead of their current position
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        # Insert the key at its correct position
        arr[j + 1] = key
    return arr

# Example usage
arr = [12, 11, 13, 5, 6]
sorted_arr = insertion_sort(arr)
print("Sorted array:", sorted_arr)
Time Complexity: O(n^2)
in the worst case, when the list is in reverse order. However, it can be 
O(n) if the list is already mostly sorted.
Space Complexity: 
O(1) since it is an in-place sort.

## Quick sort

def quick_sort(arr):
    if len(arr) <= 1:
        return arr  # Base case: a list of 0 or 1 elements is already sorted

    pivot = arr[len(arr) // 2]  # Choose the middle element as the pivot
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]

    # Recursively apply quick_sort to the left and right sublists
    return quick_sort(left) + middle + quick_sort(right)

# Example usage
arr = [10, 7, 8, 9, 1, 5]
sorted_arr = quick_sort(arr)
print("Sorted array:", sorted_arr)

Time Complexity:
Average: 
O(nlogn)
Worst case: 
O(n ^2)
 ), when the pivot is consistently the smallest or largest element.
Space Complexity: 
O(logn) for the recursion stack.

## merge sort
def merge_sort(arr):
    if len(arr) > 1:
        # Find the middle point to divide the array into halves
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]

        # Recursively sort the two halves
        merge_sort(left_half)
        merge_sort(right_half)

        # Merge the sorted halves
        i = j = k = 0

        # Copy data to temp arrays left_half[] and right_half[]
        while i < len(left_half) and j < len(right_half):
            if left_half[i] < right_half[j]:
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        # Check for any remaining elements
        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1

    return arr

# Example usage
arr = [38, 27, 43, 3, 9, 82, 10]
sorted_arr = merge_sort(arr)
print("Sorted array:", sorted_arr)

Time Complexity: 
O(nlogn) for all cases (best, average, and worst).
Space Complexity: 
O(n) due to the additional space required for temporary arrays during the merging process.

## binary search:

def binary_search(arr, target):
    left, right = 0, len(arr) - 1

    while left <= right:
        mid = left + (right - left) // 2  # Calculate the middle index

        # Check if the target is at the middle
        if arr[mid] == target:
            return mid
        # If target is greater, ignore the left half
        elif arr[mid] < target:
            left = mid + 1
        # If target is smaller, ignore the right half
        else:
            right = mid - 1

    # Target is not present in the array
    return -1

# Example usage
arr = [2, 3, 4, 10, 40]
target = 10
result = binary_search(arr, target)

if result != -1:
    print("Element found at index", result)
else:
    print("Element not found in array")
Complexity
Time Complexity: 
O(logn)
Space Complexity: 
O(1) for the iterative version.

---       recursive approach
def binary_search_recursive(arr, target, left, right):
    # Base case: target is not present
    if left > right:
        return -1

    mid = left + (right - left) // 2  # Calculate the middle index

    # Check if the target is at the middle
    if arr[mid] == target:
        return mid
    # If target is greater, ignore the left half
    elif arr[mid] < target:
        return binary_search_recursive(arr, target, mid + 1, right)
    # If target is smaller, ignore the right half
    else:
        return binary_search_recursive(arr, target, left, mid - 1)

# Example usage
arr = [2, 3, 4, 10, 40]
target = 10
result = binary_search_recursive(arr, target, 0, len(arr) - 1)

if result != -1:
    print("Element found at index", result)
else:
    print("Element not found in array")

Complexity
Time Complexity: 
O(logn)
Space Complexity: 
O(logn) due to the recursive call stack.


