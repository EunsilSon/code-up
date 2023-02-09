import java.util.Scanner;

public class j1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작 값
        int d = sc.nextInt(); // 등차
        int n = sc.nextInt(); // 정수

        for (int i = 1; i < n; i++) {
            a += d;
        }
        System.out.println(a);
    }
}