<a href="
https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTab=0">
</a>

import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

     int max=arr[0];
     for(int i=0;i<n;i++){
         if(arr[i]>max)
         max=arr[i];
     }
     return max;
    }
}
