package 문자열.twoPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer>[] ints = new ArrayList[2];
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                a.add(scanner.nextInt());
            }
            ints[i] = a;
        }

        TwoPoint t = new TwoPoint();
        t.solution(ints);
    }

    private void solution(ArrayList<Integer>[] a) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < a[0].size() && p2 < a[1].size()) {
            if (a[0].get(p1) < a[1].get(p2) ) answer.add(a[0].get(p1++));
            else answer.add(a[1].get(p2++));
        }

        while (p1 < a[0].size()) answer.add(a[0].get(p1++));
        while (p2 < a[1].size()) answer.add(a[1].get(p2++));

        System.out.println(answer);
    }
}
