import java.util.Scanner;

public class j1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            } else {
                System.out.println(num);
            }
        }
    }
}