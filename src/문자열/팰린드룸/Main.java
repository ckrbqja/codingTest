package 문자열.팰린드룸;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.solution(new Scanner(System.in).nextLine());
    }

    private static void solution(String str) {
        String s = str.toUpperCase().replaceAll("[^A-Z]", "");

        System.out.println("s = " + s);
        String b = new StringBuilder(s).reverse().toString();
        System.out.println("b = " + b);
        System.out.println(s.equalsIgnoreCase(b));

    }
}
