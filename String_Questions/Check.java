/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Questions;

/**
 *
 * @author Saurabh Rajput
 */
public class Check {

    static String findSubString(String str, String pat) {
        int len1 = str.length();
        int len2 = pat.length();

        if (len1 < len2) {
            System.out.println("No such window exists");
            return "";
        }
        int hash_pat[] = new int[256];
        int hash_str[] = new int[256];

        for (int i = 0; i < len2; i++) {
            hash_pat[pat.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            System.out.print(hash_pat[i] + " ");
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "this is a test string";
        String pat = "tist";

        System.out.print("Smallest window is :\n "
                + findSubString(str, pat));
    }
}
