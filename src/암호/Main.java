package 암호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        Main.solution(n, str);
        
        
    }

    private static void solution(int n, String str) {
        String answer = "";
        int len = 7;
        for (int i = 0; i < n; i++) {
            String replace = str.substring(len * i, len * (i + 1)).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(replace, 2);
//            System.out.println("replace = " + replace + " " + num);
            answer += (char) num;
        }

        System.out.println("answer = " + answer);


    }
}
