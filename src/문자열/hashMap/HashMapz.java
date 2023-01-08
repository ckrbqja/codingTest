package 문자열.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String t = scanner.next();

        new HashMapz().solution(t, n);
    }

    private void solution(String t, int n) {
        HashMap<Character, Integer> result = new HashMap<>();
        char answer = ' ';

        for (char c : t.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        // 포함여부
        System.out.println(result.containsKey('F'));
        //사이즈
        System.out.println(result.size());
        //삭제
        System.out.println(result.remove('A'));
        System.out.println(result.size());


        int m = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> a:result.entrySet()) {
            if (m < a.getValue()) {
                answer = a.getKey();
                m = a.getValue();
            }
            System.out.println(a.getKey() + " " + a.getValue() );

        }
        System.out.println("answer = " + answer);
    }
}
