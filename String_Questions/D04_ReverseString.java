package String_Questions;

public class D04_ReverseString {

    public static void main(String[] args) {
        String s = "Amaresh";
        char[] rev = s.toCharArray();
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.print(rev[i]);
        }
    }
}
