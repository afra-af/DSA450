/*
Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
             occurrence of 5 is at index 5. 
*/
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> list=new ArrayList<Long>();
        int low=binary(arr,x,true);
        int high=binary(arr,x,false);
        list.add((long)low);    //store the occurence in list and return the list//
        list.add((long)high);
        return list;
        
}
public static int binary(long[] arr,int x, boolean firstindex){
    int a1=-1;
    int low=0,high=arr.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]>x){
            high=mid-1;}
        else if(arr[mid]<x){
            low=mid+1;}
        else{
            a1=mid;
        if(firstindex){      //continue to iterate and find the next occurence//
            high=mid-1;}
            else{ 
                low=mid+1; }
        }
    
    }
     return a1;
}
}
