package 배열.보이는학생;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < i; j++) {
            ints[j] = scanner.nextInt();
        }

        Main.solution(i, ints);
    }

    private static void solution(int n, int[] ints) {
        int result = 1, max = ints[0];
        for (int i = 1; i < n ; i++) {
            if(max < ints[i]) {
                result++;
                max = ints[i];
            }
        }
        System.out.println("result = " + result);

    }
}
