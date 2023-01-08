package 문자열.문장속단어;

import java.util.Scanner;
public class Main {
    public String solutionSplit(String str) {
        String answer = "";

        int minValue = Integer.MIN_VALUE;

        String[] split = str.split(" ");


        for (String ch : split) {
            int len = ch.length();
            if (len > minValue) {
                minValue = len;
                answer = ch;
            }
        }

        return answer;
    }

    public String solution(String str) {
        String answer = "";

        int minValue = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1){

            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > minValue) {
                minValue = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);

            if(str.length() > minValue ) answer=str;

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(new Main().solution(str));

    }
}
