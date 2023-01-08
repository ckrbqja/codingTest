package 문자열.회문문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main.solution1(scanner.next());
    }

    private static void solution1(String str) {
        str = str.toUpperCase();
        int len = str.length();
        boolean result = true;
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len -  i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println("result = " + result);
    }

    private static void solution(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        System.out.println(tmp.equalsIgnoreCase(str));
    }
}

