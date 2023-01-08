package 문자열.대문자소문자;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        Main.ASCII(next);
    }

    private static void solution(String next) {

        for (char c : next.toCharArray()) {
            System.out.print(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
    }

    private static void ASCII(String next) {

        for (char c : next.toCharArray()) {
            if (c >= 97 && c < 122) System.out.print((char)(c - 32));
            else System.out.println((char)(c + 32));
        }
    }
}
