import java.util.Scanner;

public class j1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\.|\\s");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}