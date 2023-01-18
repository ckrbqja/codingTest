package twoPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nn = new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = scanner.nextInt();
        }
        int[] mm = new int[n];
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            mm[i] = scanner.nextInt();
        }

        공통원소.solution(n, m, nn, mm);
    }

    private static void solution(int n, int m, int[] nn, int[] mm) {
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(nn);
        Arrays.sort(mm);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (nn[p1] == mm[p2]) {
                result.add(nn[p1 ++]);
                p2++;
            } else if (nn[p1] < mm[p2]){
                p1++;
            } else {
                p2++;
            }
        }

        result.forEach(System.out::println);
    }
}
