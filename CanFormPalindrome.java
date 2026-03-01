//Q) Check if the alphabets in string can form a palindrome in any permutation.
import java.util.*;
public class CanFormPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            flag^=(1<<ch-'a');
        }
        System.out.print(flag==0||(flag&(flag-1))==0?"YES":"NO");
    }
}
