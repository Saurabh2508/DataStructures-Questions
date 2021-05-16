/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author amare
 */
public class D06_ReverseString {

    public static void main(String[] args) {
        String input = "Amaresh";
        char[] rev = input.toCharArray();
        List<Character> trial1 = new ArrayList();
        for (char c : rev) {
            trial1.add(c);
        }
        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next());
        }
        System.out.println("");
    }
}
