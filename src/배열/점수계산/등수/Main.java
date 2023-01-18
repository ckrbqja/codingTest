package 배열.점수계산.등수;

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

    private static void solution(int n, int[] ints) {
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (ints[i] > ints[j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}
