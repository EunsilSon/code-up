import java.util.Scanner;

public class j1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * ((2 << b) / 2));
    }
}