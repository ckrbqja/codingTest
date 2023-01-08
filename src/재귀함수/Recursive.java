package 재귀함수;

public class Recursive {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        recursive.DFS(3);
    }

    private void DFS(int i) {
        if (i == 0) return;
        else {
            DFS(i - 1);
            System.out.println(i + " ");
        }

    }
}
