package 문자열.괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class BracketTextRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();

        new BracketTextRemove().solution(t);
    }

    private void solution(String t) {

        Stack<Character> stack = new Stack<>();

        for (char c : t.toCharArray()) {
            if (c == ')')
                while (stack.pop() != '(');
            else stack.push(c);
        }

        stack.forEach(System.out::print);

    }
}
