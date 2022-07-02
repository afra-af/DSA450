/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
*/
class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        //check for entire string if char at i not equal to j call substring palindrome function after removing one char ie i+1 or j-1 still they are not equal then return false else true
       while(start<end){
           if(s.charAt(start)!=s.charAt(end)){
               return ispalin(s,start+1,end) || ispalin(s,start,end-1);
           }
           start++;
           end--;
       }
        return true;
    }
    public boolean ispalin(String s, int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
