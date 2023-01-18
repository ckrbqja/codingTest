package 배열.봉우리;

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
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {

                    int i1 = i + x[k];
                    int i2 = j + y[k];
                    if(i1 >= 0 && i1 < n && i2 >= 0 && i2 < n && ints[i1][i2] >= ints[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
