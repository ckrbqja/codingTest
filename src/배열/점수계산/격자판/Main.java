package 배열.점수계산.격자판;

import java.util.ArrayList;
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
        ArrayList<Integer> res = new ArrayList<Integer>();
        int answer = 0;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += ints[i][j];
                sum2 += ints[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += ints[i][i];
            sum2 += ints[i][n - 1 - i];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        System.out.println(answer);
    }



}
