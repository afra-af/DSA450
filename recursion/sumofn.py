'''
Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
'''
class Solution:
    def sumOfSeries(self,n):
        #code here
        res=n*(n+1)//2
        return res*res

'''Sum of the Squares of the First 
𝑛
n Natural Numbers
python
Copy code'''
class Solution:
    def sum_of_squares(self, n):
        return n * (n + 1) * (2 * n + 1) // 6

# Example usage
solution = Solution()
n = 5
print(solution.sum_of_squares(n))  # Output: 55

''Sum of the First 
𝑛
n Natural Numbers
python
Copy code'''
class Solution:
    def sum_of_natural_numbers(self, n):
        return n * (n + 1) // 2

# Example usage
solution = Solution()
n = 5
print(solution.sum_of_natural_numbers(n))  # Output: 15
