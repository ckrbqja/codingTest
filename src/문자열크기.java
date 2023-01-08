import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 문자열크기 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String t = scanner.nextLine();
        System.out.println(문자열크기.doWhile(t));
    }

    private static String solution(String t) {
        return Arrays.stream(t.split(" ")).max(Comparator.comparing(String::length)).orElse(String.valueOf(0));
    }

    private static String solution1(String t) {
        String[] split = t.split(" ");
        int m=Integer.MIN_VALUE;
        String result = "";
        for (String a : split) {
            if (m < a.length()) {
                m = a.length();
                result = a;
            }
        }
        return result;
    }

    private static String doWhile(String t) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = t.indexOf(" ")) != -1) {
            String tmp = t.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }

            t = t.substring(pos + 1);

        }
        return answer;
    }
}
