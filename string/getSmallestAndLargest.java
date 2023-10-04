/*Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel */

import java.util.Scanner;

public class Solution2 {

    public static String getSmallestAndLargest(String s, int k) {
        String str=s.substring(0,k); //wel
        String smallest = str;
        String largest = str;
        
        // Complete the function
        for(int i=1;i<=s.length()-k;i++){ //start with e 
            str=s.substring(i,i+k); //get substring like elc,lco...
          // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
            if(str.compareTo(smallest)<0){   
                smallest=str;
            }
            if(str.compareTo(largest)>0){
                largest=str;
            }
        }
        
        
        return smallest + "\n" + largest;
    }
