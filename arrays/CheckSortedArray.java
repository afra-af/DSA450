https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

public class Solution {
    public static int isSorted(int n, int []a) {
        //int min=a[0];
    
        for(int i=1;i<n;i++){
          // check if element at index i > previous element 
            if(a[i]>=a[i-1]){
            }
            else{
                return 0;
            }  
        }
        return 1;
        
        
    }
}
