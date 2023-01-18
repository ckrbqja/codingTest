import 문자열.단어뒤집기.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] ints1 = new int[m];
        for (int i = 0; i < m; i++) {
            ints1[i] = scanner.nextInt();
        }

        test.solution(n, m, ints, ints1);
    }

    private static void solution(int n, int m, int[] ints, int[] ints1) {
        int p1 = 0, p2 = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (p1 < n && p2 < m)
            if (ints[p1] < ints1[p2])
                arr.add(ints[p1++]);
             else
                arr.add(ints1[p2++]);


        while (p1 < n)
            arr.add(ints[p1++]);


        while (p2 < m)
            arr.add(ints1[p2++]);


        arr.forEach(System.out::println);
    }
}
