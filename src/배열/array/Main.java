package 배열.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }

        Main.solution(n, ints);
    }

    private static void solution1(int n, int[] ints) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(ints[i]);
            }
            else if (i == n - 1) {
                if (ints[i] > ints[i - 1]) {
                    System.out.println(ints[i]);
                }
            }
            else if (ints[i - 1] < ints[i]) {
                System.out.println(ints[i]);
            }
        }
    }

    private static void solution(int n, int[] ints) {
        System.out.println(ints[0]);
        for (int i = 1; i < n; i++) {
            if(ints[i] > ints[i-1]) System.out.println(ints[i]);
        }
    }
}
