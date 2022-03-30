import java.util.*;
class MinandMax{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
int min,max;
n=sc.nextInt();
int[] arr=new int[10];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
if(arr[0]>arr[1]){
max=arr[0];
min=arr[1];
}
else{
max=arr[1];
min=arr[0];
}
for(int i=2;i<n;i++){
if(arr[i]>max){
max=arr[i];
}
else if(arr[i]<max){
min=arr[i];
}
}
System.out.println("max is: ", max);
System.out.print("min is :",min);
}
}
