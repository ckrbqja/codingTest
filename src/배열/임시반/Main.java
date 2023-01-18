package 배열.임시반;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] ints = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }

        Main.solution(n, ints);
    }

    private static void solution(int n, int[][] ints) {
        int result = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (ints[i][k] == ints[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                result = i;
            }
        }
        System.out.println(result + 1);
    }
}
