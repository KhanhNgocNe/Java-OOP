package OPP_P2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.println("Enter string: ");
        str = scanner.nextLine();
        System.out.println("Enter char: ");
        char ch = (char) System.in.read();
        CountChar(str,ch);
        CountCharWithType(str, ch);

    }

    private static void CountChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Number of appear of " + ch +
                " in string " + str + " = " + count);
    }

    private static void CountCharWithType(String str, char ch) {
        int countLower = 0;
        int countUpper = 0;
        int countNumber = 0;
        char c ;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                countLower++;
            }
            if(c >= 'A' && c <= 'Z'){
                countUpper++;
            }
            if(c >= '0' && c <= '9'){
                countNumber++;
            }
        }

        System.out.println("Number lower: " + countLower);
        System.out.println("Number upper: " + countUpper);
        System.out.println("Number number: " + countNumber);
    }
}
