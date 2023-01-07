package 가로대각합;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ints = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }

        Five five = new Five();
        System.out.println(five.solution(ints, n));

    }

    private int solution(int[][] ints, int n) {
        int answer = Integer.MIN_VALUE;

        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = ints[i][j];
                sum2 = ints[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            sum1 = ints[i][i];
            sum1 = ints[i][n - i - 1];

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        return answer;
    }
}

