/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_Questions;

import java.util.Scanner;

/**
 *
 * @author Saurabh Rajput
 */
public class Abc2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String[] s2=new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    s2[i]="z";
                    break;
                    case 'b':
                    s2[i]="y";
                    break;
                    case 'c':
                    s2[i]="x";
                    break;
                    case 'd':
                    s2[i]="w";
                    break;
                    case 'e':
                    s2[i]="v";
                    break;
                    case 'f':
                    s2[i]="u";
                    break;
                    case 'g':
                    s2[i]="t";
                    break;
                    case 'h':
                    s2[i]="s";
                    break;
                    case 'i':
                    s2[i]="r";
                    break;
                    case 'j':
                    s2[i]="q";
                    break;
                    case 'k':
                    s2[i]="p";
                    break;
                    case 'l':
                    s2[i]="o";
                    break;
                    case 'm':
                    s2[i]="n";
                    break;
                    case 'n':
                    s2[i]="m";
                    break;
                    case 'o':
                    s2[i]="l";
                    break;
                    case 'p':
                    s2[i]="k";
                    break;
                    case 'q':
                    s2[i]="j";
                    break;
                    case 'r':
                    s2[i]="i";
                    break;
                    case 's':
                    s2[i]="h";
                    break;
                    case 't':
                    s2[i]="g";
                    break;
                    case 'u':
                    s2[i]="f";
                    break;
                    case 'v':
                    s2[i]="e";
                    break;
                    case 'w':
                    s2[i]="d";
                    break;
                    case 'x':
                    s2[i]="c";
                    break;
                    case 'y':
                    s2[i]="b";
                    break;
                    case 'z':
                    s2[i]="a";
                    break;    
            }
        }
        for(int i=0;i<s2.length;i++)
        {
            System.out.print(s2[i]);
        }
    }
}
