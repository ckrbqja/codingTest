package 문자열.중복문자제거;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.solution(new Scanner(System.in).next());
    }

    private static void solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == str.indexOf(ch)) {
                answer += str.charAt(i);
            }
        }

        System.out.println(answer);

    }
}
