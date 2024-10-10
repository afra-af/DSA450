class Solution:    
    #Complete this function
    def printNos(self,N):
        #Your code here
        if N==0:
            return
        self.printNos(N-1)
        print(N,end=" ")
'''
Examples

Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: n = 5
Output: 1 2 3 4 5
