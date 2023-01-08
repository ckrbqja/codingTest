package 문자열.단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String > solutionResolver(String[] str) {
        ArrayList<String > answer = new ArrayList<>();

        for(String s:str){
            answer.add(new StringBuilder(s).reverse().toString());
        }



        return answer;

    }

    public static ArrayList<String > solution(String[] str) {
        ArrayList<String > answer = new ArrayList<>();

        for(String x:str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt ++; rt --;
            }

            answer.add(String.valueOf(s));
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        String[] strings = new String[i];

        for (int j = 0; j < i; j++) {
            strings[j] = scanner.next();
        }

        for (String x : solution(strings)) {
            System.out.println("x = " + x);
        }
    }
}

