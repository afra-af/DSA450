class Solution:
    def reverseWords(self, s: str) -> str:
        res=[]
        words=s.split()
        for i in range(len(words)-1,-1,-1):
            res.append(words[i])
        return ' '.join(res)
