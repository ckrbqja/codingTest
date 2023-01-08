import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }

        문자열뒤집기.solution2(s);
    }

    private static void solution1(String[] s) {
        ArrayList<String> strings = new ArrayList<>();
        for (String d : s) {
            strings.add(new StringBuilder(d).reverse().toString());
        }

        strings.forEach(System.out::println);
    }

    private static void solution2(String[] s) {
        for (String b : s) {
            char[] chars = b.toCharArray();
            int lt = 0, rt = b.length() - 1;

            char tmp;
            while (lt < rt) {
                tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
//            String s1 = String.valueOf(chars);
            System.out.println(chars);

        }

    }
}
