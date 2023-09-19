https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i = 0, j = 0; // pointers
        int n=a.length;
        int m= b.length;
  ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
  // step 1: start comparing both arrays
  while (i < n && j < m) {
      // if i< j then take it in union array ; 1<2 take 1 
    if (a[i] <= b[j]) // Case 1 and 2
    {
        // and also check if the previous element added before != current i ; unionsize=0 initially union size=0

      if (Union.size() == 0 || Union.get(Union.size()-1) != a[i])
        Union.add(a[i]);
      i++;
    } else // case 3
    {
      if (Union.size() == 0 || Union.get(Union.size()-1) != b[j])
        Union.add(b[j]);
      j++;
    }
  }
  while (i < n) // IF any element left in arr1
  {
    if (Union.get(Union.size()-1) != a[i])
      Union.add(a[i]);
    i++;
    }
    while (j < m) // If any elements left in arr2
  {
    if (Union.get(Union.size()-1) != b[j])
      Union.add(b[j]);
    j++;
  }
  return Union;
}
}
