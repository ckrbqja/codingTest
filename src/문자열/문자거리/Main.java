package 문자열.문자거리;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String str = scanner.next();
        Main.solution1(string, str.charAt(0));

    }

    private static void solution(String string, char str) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            int l = i, r = i;


            while (chars[l] != str && chars[r] != str) {
                if(l < chars.length - 1 ) l ++;
                if(r > 0) r--;
            }

            System.out.print(Math.max(l, -r) - i);

        }


    }
    private static void solution1(String string, char str) {
        int len = string.length();
        int[] answer = new int[len];
        int p = 1000;
        for (int i = 0; i < len; i++) {
            answer[i] = string.charAt(i) == str ? p = 0 : ++p;
        }

        p = 1000;
        for (int i = len - 1; i >= 0; i--) {
            if (string.charAt(i) == str) p = 0;
            else answer[i] = Math.min(answer[i], ++p);
        }

        System.out.println(Arrays.toString(answer));
    }
}
