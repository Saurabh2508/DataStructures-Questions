/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Questions;

import java.util.Scanner;

/**
 *
 * @author amare
 */
public class D07_Check_whether_a_String_is_Palindrome_or_not {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            char ch=s.charAt(i);
            char ch2=s.charAt(j);
            i++;
            j--;
            if(ch!=ch2)
            {
                System.out.println("No, It's not a palindrome");
                return;
            }
            
        }
        System.out.println("Yes it is palindrome");
    }
}
