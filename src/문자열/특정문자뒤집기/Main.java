package 문자열.특정문자뒤집기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main.solution(scanner.next());
    }

    private static void solution(String str) {
        int lt = 0, rt = str.length() - 1;
        char[] chars = str.toCharArray();

        while (lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt ++;
                rt--;
            }
        }

        System.out.println(String.valueOf(chars));
    }
}
