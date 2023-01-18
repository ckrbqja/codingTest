package twoPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {}

    private static void solution(int i, int j, int[] ints, int[] ints1) {
        int point = 0, pont1 = 0;


        ArrayList<Integer> result = new ArrayList<>();
        while (pont1 < i && point < j) {
            if (ints[point] > ints[pont1]) {
                result.add(ints[pont1++]);
            } else {
                result.add(ints[point++]);
            }
        }

        while (pont1 < i) result.add(ints[pont1++]);
        while (point < j) result.add(ints[point++]);

        result.forEach(System.out::println);
    }
}
