package twoPoint.연속부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] ints = new int[n];
        for (int i = 0; i < n; i++)
            ints[i] = scanner.nextInt();


        Main.solution(n, m, ints);
    }

    private static void solution(int n, int m, int[] ints) {
        int lt = 0, rt = 0, cnt = 0;
        for (int i = 0; i < n; i++,rt ++) {
            if (lt + rt > m) {
                while (lt + rt < m) {
                    if(++lt + rt == m) break;
                }
            }

            if(lt + rt == m) {
                cnt++;
                lt++;
            }
        }
        System.out.println(cnt);
    }
}
