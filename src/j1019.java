import java.util.Scanner;

public class j1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\s|\\.");
        System.out.printf("%04d.%02d.%02d", sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
