
import java.util.HashMap;
import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {
        HashMap<Character, String> hs = new HashMap();
        hs.put('a', "z");
        hs.put('b', "y");
        hs.put('c', "x");
        hs.put('d', "w");
        hs.put('e', "v");
        hs.put('f', "u");
        hs.put('g', "t");
        hs.put('h', "s");
        hs.put('i', "r");
        hs.put('j', "q");
        hs.put('k', "p");
        hs.put('l', "o");
        hs.put('m', "n");
        hs.put('n', "m");
        hs.put('o', "l");
        hs.put('p', "k");
        hs.put('q', "j");
        hs.put('r', "i");
        hs.put('s', "h");
        hs.put('t', "g");
        hs.put('u', "f");
        hs.put('v', "e");
        hs.put('w', "d");
        hs.put('x', "c");
        hs.put('y', "b");
        hs.put('z', "a");

        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String[] ch = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = hs.get(s.charAt(i));
        }
        for (String tem : ch) {
            System.out.print(tem);
        }
    }
}
