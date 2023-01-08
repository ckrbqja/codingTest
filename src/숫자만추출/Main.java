package 숫자만추출;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.solution(new Scanner(System.in).next());
    }

    private static void solution(String str) {
        StringBuilder result = new StringBuilder();
        for (char a : str.toCharArray()) {
            if (Character.isDigit(a)) {
                System.out.print(a);
            }
        }
    }
}
