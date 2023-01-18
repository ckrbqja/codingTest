package 배열.array.멘토링;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] ints = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }

        Main.solution(n, m, ints);
    }

    private static void solution(int n, int m, int[][] ints) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi =0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        if (ints[k][l] == i) {
                            pi = l;
                        }
                        if (ints[k][l] == j) {
                            pj = l;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
