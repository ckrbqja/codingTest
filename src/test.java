import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.next().toUpperCase();
        char c1 = Character.toUpperCase(scanner.next().charAt(0));


        int a = 0;
        for (char c : next.toCharArray()) {
            if (c1 == c) a++;
        }

        System.out.println("a = " + a);
    }
}
