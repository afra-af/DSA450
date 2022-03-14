
import java.util.Scanner;

public class Anagram {
           static boolean isAnagram(String a, String b) { 
               boolean x= true; 
               if (a.length()!=b.length()){ 
                    x=false; 
                    }

    a= a.toLowerCase();
    b=b.toLowerCase();
   int al[]=new int [26];

   for(char c : a.toCharArray()){
       int i=(int) c;
       al[i]++; //increment value to one if same char is found again


   }
   for(char c : b.toCharArray()){
    int i=(int) c;
    al[i]--; //decremnt the value of char when common char are found that means when char=0 common char in strings , -1 char is not common


}
for (int i=0;i<256;i++){
    if(al[i]!=0){ //if char value not equals 0 then it is not and common in both strings and hence there frequency doesnt match
        x=false;
        break;
    }
}



    return x;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
