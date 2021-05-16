/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Questions;

/**
 *
 * @author amare
 */
public class D03_ReverseString {
    public static void main(String[] args) {
//        StringBuilder input1=new StringBuilder("Amaresh");
//        input1.reverse();
//        System.out.println(input1);
          String input="Amaresh";
          StringBuilder input1=new StringBuilder();
          input1.append(input);
          input1.reverse();
          System.out.println(input1);
    }
}
