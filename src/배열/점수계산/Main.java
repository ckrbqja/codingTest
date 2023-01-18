package 배열.점수계산;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] ints = new int[number];
        for (int i = 0; i < number; i++) {
            ints[i] = scanner.nextInt();
        }

        Main.solution(number, ints);


    }

    private static void solution(int number, int[] ints) {
        int result = 0, cnt = 0;
        for (int i = 0; i < number; i++) {
            if (ints[i] == 1) result += ++cnt;
            else cnt = 0;
        }

        System.out.println(result);
    }
}
