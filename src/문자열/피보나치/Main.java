package 문자열.피보나치;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        //for(int x : new Main().solution(n)) System.out.println("x = " + x);
        new Main().noArray(n);

    }

    private int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;


    }

    private void noArray(int n) {

        int a = 1, b = 1, c;

        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }


    }
}
