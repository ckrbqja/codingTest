package 문자찾기;

import java.util.Scanner;

public class Main1 {

    public static int solution(String str, char c) {
        int res = 0;
        for (char chr : str.toCharArray()) {
            if(chr == c) res++;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.println(Main1.solution(str,c));


    }
}
