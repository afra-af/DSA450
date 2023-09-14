https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=1;i<n;i++){
            //push index=1 element to its previous element 
            arr[i-1]=arr[i];
        }
        // keep first element at last nth place of array
        arr[n-1]=temp;
        return arr;

    }
}
