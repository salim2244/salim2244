package StringCode;

import java.lang.reflect.Array;

public class StringReverse {
    public static void main(String[] args) {
        String s1="Shdaab";
        System.out.print(s1);
        System.out.println();
        char [] sr=s1.toCharArray();
        int i=0; 
        int j=sr.length-1;
        char temp;
        while(i<j){
            temp=sr[i];
            sr[i]=sr[j];
            sr[j]=temp;
            i++;
            j--;
        }
        s1=new String(sr);
        System.out.print(s1);
    }
}
