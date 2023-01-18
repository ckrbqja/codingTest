package twoPoint.최대매출;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }

        Main.solution(n, m, ints);
    }

    private static void solution(int n, int m, int[] ints) {
        int result = 0, sum=0;

        for (int i = 0; i < m; i++)
            sum += ints[i];

        result = sum;

        for (int i = m; i < n; i++) {
            sum = sum - ints[i - m] + ints[i];
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}
