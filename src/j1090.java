import java.util.Scanner;

public class j1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(); // 시작 값
        int r = sc.nextInt(); // 등비
        int n = sc.nextInt(); // 정수

        for (int i = 0; i < n-1; i++) {
            a *= r;
        }
        System.out.println(a);
    }
}