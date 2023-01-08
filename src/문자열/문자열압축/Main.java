package 문자열.문자열압축;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.solution(new Scanner(System.in).next());
    }

    private static void solution1(String str) {

        int len = str.length();
        for (int i = 0; i < len; i++) {
            int a = i, n = 0;
            while (str.charAt(i) == str.charAt(a)) {
                if(a < len - 1 ) a++;
                n++;
                if(a == i) break;
            }

            if(i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                System.out.println(str.charAt(i) + " " + n);
            }
        }

    }
    private static void solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
            
        }
        System.out.println(answer);

    }
}
