class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        int n=s.length;
        for(int i=0;i<=(s.length-1)/2;i++){
            temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
}
    }
}
