import java.util.Scanner;

public class j1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter(":|\\s");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(minute);
    }
}