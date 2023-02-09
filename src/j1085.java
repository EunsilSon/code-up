import java.util.Scanner;

public class j1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        double storage = h * b * c * s;
        storage = storage / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", storage);
    }
}