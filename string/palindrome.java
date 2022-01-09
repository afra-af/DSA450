import java.util.*;
public class palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       System.out.print(ispalindrom(str));
    }
       
       static boolean ispalindrom(String str){
       for(int i=0;i<=str.length()/2;i++){
           char start=str.charAt(i);
           char end =str.charAt(str.length()-1-i); //if n=4 start=0,end=3
           if(start!=end){
               return false;
           }
       }
       return true;
    }
}
