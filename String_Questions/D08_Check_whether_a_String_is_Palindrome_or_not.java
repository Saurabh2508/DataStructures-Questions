
package String_Questions;

import java.util.Scanner;

public class D08_Check_whether_a_String_is_Palindrome_or_not {
    
        static boolean isPalindrome(String str)
        {
            int i=0,j=str.length()-1;
            while(i<j)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        if(isPalindrome(s))
                System.out.println("Yes");
        else
                System.out.println("No");
    }
}
